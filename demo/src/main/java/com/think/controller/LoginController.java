package com.think.controller;

import com.think.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/9/19.
 */
@Controller
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    /**
     * 登陆
     * @param session
     * @param userName
     * @param pwd
     * @return
     */
    @RequestMapping("/login")
    public String  login(HttpSession session,String userName,String pwd)
    {
        logger.info("login  Begin!");
        session.setAttribute("userName",userName);
        Boolean token = loginService.Token(userName,pwd);
        logger.info("login  End!");
        return "redirect:hello.do";
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session)
    {
        session.invalidate();
        return "redirect:hello.do";
    }

}

