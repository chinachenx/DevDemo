package com.think.service;

import com.think.entity.User;

/**
 * Created by Administrator on 2017/9/19.
 */
public interface LoginService {

    public boolean Token(String userName,String pwd);

    void add(User user);
}
