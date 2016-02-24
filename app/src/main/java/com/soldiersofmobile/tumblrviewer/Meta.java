
package com.soldiersofmobile.tumblrviewer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Meta {

    @SerializedName("status")
    @Expose
    private Long status;
    @SerializedName("msg")
    @Expose
    private String msg;

    /**
     * 
     * @return
     *     The status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
