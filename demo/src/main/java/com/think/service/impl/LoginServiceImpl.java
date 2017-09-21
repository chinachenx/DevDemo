package com.think.service.impl;

import com.think.core.DemoException;
import com.think.dao.UserMapper;
import com.think.entity.User;
import com.think.service.LoginService;
import com.think.util.MD5Util;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/19.
 */
@Service
public class LoginServiceImpl implements LoginService {

    private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    public boolean Token(String userName, String pwd) {
        logger.info("验证账号密码! Begin");
        User user = null;
        String password = MD5Util.getMD5(pwd);
        try{
            user =  userMapper.selectByUserName(userName);
        }catch(Exception e){
            logger.error("查询用户"+userName+"用户失败!");
        }
        if(user == null)
        {
           return false;
        }
        if( user.getPassword().equals(password))
        {
            return true;
        }
        return false;
    }

    public void add(User user) {
        String password = MD5Util.getMD5(user.getPassword());
        user.setPassword(password);
        Date date = new Date();
        user.setCreateDate(date);
        user.setUpdateDate(date);
        try{
            userMapper.insert(user);
        }catch (Exception e){
            logger.error("新增用户,"+user.getUserName()+"失败!");
        }
    }
}
