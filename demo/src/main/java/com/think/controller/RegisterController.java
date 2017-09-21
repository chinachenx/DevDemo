package com.think.controller;

import com.think.entity.User;
import com.think.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/9/19.
 */
@Controller
public class RegisterController {
    private static Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/register",method = {RequestMethod.POST})
    public ModelAndView register(User user)
    {
        logger.info("register Begin!");
        logger.info(user.toString());
        loginService.add(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/login/login.html");
        modelAndView.addObject("success","注册完成，请登陆！");
        logger.info("register End!");
        return modelAndView;
    }

    @RequestMapping("/registerPage")
    public ModelAndView registerPage()
    {
        logger.info("registerPage Begin!");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/login/register.html");
        logger.info("registerPage End!");
        return modelAndView;
    }

}
