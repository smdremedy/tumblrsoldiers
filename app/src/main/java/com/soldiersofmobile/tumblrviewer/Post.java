
package com.soldiersofmobile.tumblrviewer;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Post {

    @SerializedName("blog_name")
    @Expose
    private String blogName;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("post_url")
    @Expose
    private String postUrl;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("reblog_key")
    @Expose
    private String reblogKey;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("recommended_source")
    @Expose
    private Object recommendedSource;
    @SerializedName("recommended_color")
    @Expose
    private Object recommendedColor;
    @SerializedName("post_author")
    @Expose
    private String postAuthor;
    @SerializedName("highlighted")
    @Expose
    private List<Object> highlighted = new ArrayList<Object>();
    @SerializedName("note_count")
    @Expose
    private Long noteCount;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("reblog")
    @Expose
    private Reblog reblog;
    @SerializedName("trail")
    @Expose
    private List<Trail> trail = new ArrayList<Trail>();
    @SerializedName("image_permalink")
    @Expose
    private String imagePermalink;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = new ArrayList<Photo>();

    /**
     * 
     * @return
     *     The blogName
     */
    public String getBlogName() {
        return blogName;
    }

    /**
     * 
     * @param blogName
     *     The blog_name
     */
    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The postUrl
     */
    public String getPostUrl() {
        return postUrl;
    }

    /**
     * 
     * @param postUrl
     *     The post_url
     */
    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The format
     */
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 
     * @return
     *     The reblogKey
     */
    public String getReblogKey() {
        return reblogKey;
    }

    /**
     * 
     * @param reblogKey
     *     The reblog_key
     */
    public void setReblogKey(String reblogKey) {
        this.reblogKey = reblogKey;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The shortUrl
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     * 
     * @param shortUrl
     *     The short_url
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     * 
     * @return
     *     The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The recommendedSource
     */
    public Object getRecommendedSource() {
        return recommendedSource;
    }

    /**
     * 
     * @param recommendedSource
     *     The recommended_source
     */
    public void setRecommendedSource(Object recommendedSource) {
        this.recommendedSource = recommendedSource;
    }

    /**
     * 
     * @return
     *     The recommendedColor
     */
    public Object getRecommendedColor() {
        return recommendedColor;
    }

    /**
     * 
     * @param recommendedColor
     *     The recommended_color
     */
    public void setRecommendedColor(Object recommendedColor) {
        this.recommendedColor = recommendedColor;
    }

    /**
     * 
     * @return
     *     The postAuthor
     */
    public String getPostAuthor() {
        return postAuthor;
    }

    /**
     * 
     * @param postAuthor
     *     The post_author
     */
    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     * 
     * @return
     *     The highlighted
     */
    public List<Object> getHighlighted() {
        return highlighted;
    }

    /**
     * 
     * @param highlighted
     *     The highlighted
     */
    public void setHighlighted(List<Object> highlighted) {
        this.highlighted = highlighted;
    }

    /**
     * 
     * @return
     *     The noteCount
     */
    public Long getNoteCount() {
        return noteCount;
    }

    /**
     * 
     * @param noteCount
     *     The note_count
     */
    public void setNoteCount(Long noteCount) {
        this.noteCount = noteCount;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The reblog
     */
    public Reblog getReblog() {
        return reblog;
    }

    /**
     * 
     * @param reblog
     *     The reblog
     */
    public void setReblog(Reblog reblog) {
        this.reblog = reblog;
    }

    /**
     * 
     * @return
     *     The trail
     */
    public List<Trail> getTrail() {
        return trail;
    }

    /**
     * 
     * @param trail
     *     The trail
     */
    public void setTrail(List<Trail> trail) {
        this.trail = trail;
    }

    /**
     * 
     * @return
     *     The imagePermalink
     */
    public String getImagePermalink() {
        return imagePermalink;
    }

    /**
     * 
     * @param imagePermalink
     *     The image_permalink
     */
    public void setImagePermalink(String imagePermalink) {
        this.imagePermalink = imagePermalink;
    }

    /**
     * 
     * @return
     *     The photos
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     * 
     * @param photos
     *     The photos
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

}
