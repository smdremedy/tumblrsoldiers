package com.soldiersofmobile.tumblrviewer;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by madejs on 24.02.16.
 */
public class PostsListFragment extends ListFragment {

    public static final String BLOG_NAME_ARG = "blog_name";

    public static PostsListFragment newInstance(String blogName) {

        Bundle args = new Bundle();
        args.putString(BLOG_NAME_ARG, blogName);
        PostsListFragment fragment = new PostsListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setEndpoint("http://api.tumblr.com");
        RestAdapter restAdapter = builder.build();
        TumblrApi tumblrApi = restAdapter.create(TumblrApi.class);
        tumblrApi.getTumblrPosts("wehavethemunchies",
                "fD0HOvNDa2z10uyozPZNnjeb4fEFGVGm58zttH6cXSe4K0qC64", 10, 0, new Callback<TumblrResponse>() {

            @Override
            public void success(TumblrResponse tumblrResponse, Response response) {

                Log.d("TAG", tumblrResponse.toString());

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
