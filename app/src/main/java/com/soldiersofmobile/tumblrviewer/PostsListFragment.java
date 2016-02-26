package com.soldiersofmobile.tumblrviewer;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.soldiersofmobile.tumblrviewer.events.OpenUrlEvent;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by madejs on 24.02.16.
 */
public class PostsListFragment extends ListFragment {

    public static final String BLOG_NAME_ARG = "blog_name";
    private ArrayAdapter<Post> postArrayAdapter;

    private PostCallback callback;

    public static PostsListFragment newInstance(String blogName) {

        Bundle args = new Bundle();
        args.putString(BLOG_NAME_ARG, blogName);
        PostsListFragment fragment = new PostsListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (PostCallback) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callback = null;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setEndpoint("http://api.tumblr.com");
        RestAdapter restAdapter = builder.build();
        TumblrApi tumblrApi = restAdapter.create(TumblrApi.class);
        tumblrApi.getTumblrPosts(getArguments().getString(BLOG_NAME_ARG),
                "fD0HOvNDa2z10uyozPZNnjeb4fEFGVGm58zttH6cXSe4K0qC64", 10, 0, new Callback<TumblrResponse>() {

            @Override
            public void success(TumblrResponse tumblrResponse, Response response) {

                Log.d("TAG", tumblrResponse.toString());

                postArrayAdapter = new ArrayAdapter<Post>(getContext(),
                        R.layout.post_item, R.id.itemTextView, tumblrResponse.getResponse().getPosts()) {

                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        View view = super.getView(position, convertView, parent);
                        TextView itemTextView = (TextView) view.findViewById(R.id.itemTextView);

                        ImageView itemImageView = (ImageView) view.findViewById(R.id.itemImageView);

                        Post post = getItem(position);

                        itemTextView.setText(Html.fromHtml(post.getCaption()));


                        List<Photo> photos = post.getPhotos();

                        if(!photos.isEmpty()) {

                            Glide.with(PostsListFragment.this)
                                    .load(photos.get(0).getOriginalSize().getUrl())
                                    .into(itemImageView);
                        }


                        return view;
                    }
                };

                setEmptyText("No data");
                setListAdapter(postArrayAdapter);

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Post post = postArrayAdapter.getItem(position);
        
        callback.openPost(post.getPostUrl());
        App.bus.post(new OpenUrlEvent(post.getPostUrl()));

    }

    interface PostCallback {
        void openPost(String url);
    }
}
