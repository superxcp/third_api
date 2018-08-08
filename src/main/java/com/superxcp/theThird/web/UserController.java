package com.superxcp.theThird.web;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.superxcp.theThird.domain.User;
import com.superxcp.theThird.service.UserService;
import com.superxcp.theThird.redis.RedisUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

/**
 * Created by xcp on 2017/11/14
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Log log= LogFactory.getLog(UserController.class);

    @Autowired
    UserService mUserService;

    @Autowired
    private RedisUtil redisUtil;

    Gson gson=new Gson();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String loginValid(HttpServletRequest request, HttpServletResponse response,Model model) {

//        第一种方法:
//        // 设置：Access-Control-Allow-Origin头，处理Session问题
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("P3P", "CP=CAO PSA OUR");
//        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
//            response.addHeader("Access-Control-Allow-Methods", "POST,GET,TRACE,OPTIONS");
//            response.addHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
//            response.addHeader("Access-Control-Max-Age", "120");
//        }

//        第二种方法:
//java
//        response.setHeader("Access-Control-Allow-Origin", "*");

        log.error("-----------开始登陆-------------");
        User user = mUserService.getUserByUsername(request.getParameter("username"));

        if(user==null){
            log.error("------------user is null----------");
            return null;
        }else {
            if(user.getUserpass().equals(request.getParameter("userpass"))){

                request.getSession().setAttribute("session_in_user",user);
                Cookie cookie=new Cookie(request.getParameter("username"),request.getParameter("userpass"));
                response.addCookie(cookie);
                log.error("------------"+gson.toJson(user)+"----------");
                return gson.toJson(user);
            }else {
                return "list";
            }

        }

    }


}
