package com.think.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/18.
 */
public class User {
    private String userName;

    private String password;

    private Date createDate;

    private Date updateDate;

    private int phone;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", phone='" + phone + '\'' +
                '}';
    }
}
