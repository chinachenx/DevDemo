package com.think.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/9/19.
 */
public class LoginInterceptor implements HandlerInterceptor{

    private static Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("preHandle Begin!");
        //获取请求的url
        String url = request.getRequestURI();
        //获取session
        HttpSession session = request.getSession();
        String userName = (String)session.getAttribute("userName");
        if(userName == null)
        {
            //不符合条件的跳转到登陆页面
            request.getRequestDispatcher("/WEB-INF/login/login.html").forward(request,response);
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("postHandle Begin!");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("afterCompletion Begin!");
    }
}
