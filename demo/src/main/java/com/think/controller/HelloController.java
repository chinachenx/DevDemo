package com.think.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/9/19.
 */
@Controller
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")//制定这个控制类对应的url
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        logger.info("hello Begin!");
      //在页面上提示一行信息
      String message = "hello world!";

      ModelAndView modelAndView = new ModelAndView();
     // 相当于request.setAttribute(), 将数据传到页面展示
      //model数据
      modelAndView.addObject("message", message);
      //设置视图
      modelAndView.setViewName("/WEB-INF/hello.jsp");
      logger.info("hello End!");
      return modelAndView;
  }
}
