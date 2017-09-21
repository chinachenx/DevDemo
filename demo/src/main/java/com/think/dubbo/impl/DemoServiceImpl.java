package com.think.dubbo.impl;

import com.think.dubbo.DemoService;
import com.think.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/20.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
    public List getUsers() {
        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setUserName("jack");

        User u2 = new User();
        u2.setUserName("tom");

        User u3 = new User();
        u3.setUserName("rose");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
