
package com.soldiersofmobile.tumblrviewer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Reblog {

    @SerializedName("tree_html")
    @Expose
    private String treeHtml;
    @SerializedName("comment")
    @Expose
    private String comment;

    /**
     * 
     * @return
     *     The treeHtml
     */
    public String getTreeHtml() {
        return treeHtml;
    }

    /**
     * 
     * @param treeHtml
     *     The tree_html
     */
    public void setTreeHtml(String treeHtml) {
        this.treeHtml = treeHtml;
    }

    /**
     * 
     * @return
     *     The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

}
