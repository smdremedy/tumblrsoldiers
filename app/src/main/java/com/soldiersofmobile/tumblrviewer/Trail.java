
package com.soldiersofmobile.tumblrviewer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Trail {

    @SerializedName("blog")
    @Expose
    private Blog_ blog;
    @SerializedName("post")
    @Expose
    private Post_ post;
    @SerializedName("content_raw")
    @Expose
    private String contentRaw;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("is_current_item")
    @Expose
    private Boolean isCurrentItem;
    @SerializedName("is_root_item")
    @Expose
    private Boolean isRootItem;

    /**
     * 
     * @return
     *     The blog
     */
    public Blog_ getBlog() {
        return blog;
    }

    /**
     * 
     * @param blog
     *     The blog
     */
    public void setBlog(Blog_ blog) {
        this.blog = blog;
    }

    /**
     * 
     * @return
     *     The post
     */
    public Post_ getPost() {
        return post;
    }

    /**
     * 
     * @param post
     *     The post
     */
    public void setPost(Post_ post) {
        this.post = post;
    }

    /**
     * 
     * @return
     *     The contentRaw
     */
    public String getContentRaw() {
        return contentRaw;
    }

    /**
     * 
     * @param contentRaw
     *     The content_raw
     */
    public void setContentRaw(String contentRaw) {
        this.contentRaw = contentRaw;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The isCurrentItem
     */
    public Boolean getIsCurrentItem() {
        return isCurrentItem;
    }

    /**
     * 
     * @param isCurrentItem
     *     The is_current_item
     */
    public void setIsCurrentItem(Boolean isCurrentItem) {
        this.isCurrentItem = isCurrentItem;
    }

    /**
     * 
     * @return
     *     The isRootItem
     */
    public Boolean getIsRootItem() {
        return isRootItem;
    }

    /**
     * 
     * @param isRootItem
     *     The is_root_item
     */
    public void setIsRootItem(Boolean isRootItem) {
        this.isRootItem = isRootItem;
    }

}
