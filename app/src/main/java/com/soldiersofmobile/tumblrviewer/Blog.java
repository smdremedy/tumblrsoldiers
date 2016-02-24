
package com.soldiersofmobile.tumblrviewer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Blog {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("posts")
    @Expose
    private Long posts;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("updated")
    @Expose
    private Long updated;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("is_nsfw")
    @Expose
    private Boolean isNsfw;
    @SerializedName("ask")
    @Expose
    private Boolean ask;
    @SerializedName("ask_page_title")
    @Expose
    private String askPageTitle;
    @SerializedName("ask_anon")
    @Expose
    private Boolean askAnon;
    @SerializedName("share_likes")
    @Expose
    private Boolean shareLikes;

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The posts
     */
    public Long getPosts() {
        return posts;
    }

    /**
     * 
     * @param posts
     *     The posts
     */
    public void setPosts(Long posts) {
        this.posts = posts;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The updated
     */
    public Long getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated
     *     The updated
     */
    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The isNsfw
     */
    public Boolean getIsNsfw() {
        return isNsfw;
    }

    /**
     * 
     * @param isNsfw
     *     The is_nsfw
     */
    public void setIsNsfw(Boolean isNsfw) {
        this.isNsfw = isNsfw;
    }

    /**
     * 
     * @return
     *     The ask
     */
    public Boolean getAsk() {
        return ask;
    }

    /**
     * 
     * @param ask
     *     The ask
     */
    public void setAsk(Boolean ask) {
        this.ask = ask;
    }

    /**
     * 
     * @return
     *     The askPageTitle
     */
    public String getAskPageTitle() {
        return askPageTitle;
    }

    /**
     * 
     * @param askPageTitle
     *     The ask_page_title
     */
    public void setAskPageTitle(String askPageTitle) {
        this.askPageTitle = askPageTitle;
    }

    /**
     * 
     * @return
     *     The askAnon
     */
    public Boolean getAskAnon() {
        return askAnon;
    }

    /**
     * 
     * @param askAnon
     *     The ask_anon
     */
    public void setAskAnon(Boolean askAnon) {
        this.askAnon = askAnon;
    }

    /**
     * 
     * @return
     *     The shareLikes
     */
    public Boolean getShareLikes() {
        return shareLikes;
    }

    /**
     * 
     * @param shareLikes
     *     The share_likes
     */
    public void setShareLikes(Boolean shareLikes) {
        this.shareLikes = shareLikes;
    }

}
