
package com.soldiersofmobile.tumblrviewer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Blog_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("theme")
    @Expose
    private Theme theme;
    @SerializedName("share_likes")
    @Expose
    private Boolean shareLikes;
    @SerializedName("share_following")
    @Expose
    private Boolean shareFollowing;

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
     *     The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The theme
     */
    public Theme getTheme() {
        return theme;
    }

    /**
     * 
     * @param theme
     *     The theme
     */
    public void setTheme(Theme theme) {
        this.theme = theme;
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

    /**
     * 
     * @return
     *     The shareFollowing
     */
    public Boolean getShareFollowing() {
        return shareFollowing;
    }

    /**
     * 
     * @param shareFollowing
     *     The share_following
     */
    public void setShareFollowing(Boolean shareFollowing) {
        this.shareFollowing = shareFollowing;
    }

}
