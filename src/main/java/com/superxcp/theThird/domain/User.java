package com.superxcp.theThird.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xcp on 2017/11/11
 */
public class User implements Serializable{
    private Long userId;
    private String username;
    private String userpass;
    private String realname;
    private String email;
    private String tel;
    private Date addTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
