//package com.superxcp.theThird.interceptor;
//
//import com.superxcp.theThird.dao.UserDao;
//import com.superxcp.theThird.domain.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
///**
// * Created by xcp on 2017/12/16.
// */
//public class SpringMVCInterceptor implements HandlerInterceptor{
//    @Autowired
//    private UserDao userDao;
//
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//        System.out.println("preHandle");
//        System.out.println(request.getParameter("username"));
//        System.out.println(request.getParameter("userpass"));
//        String name=request.getParameter("username");
//        String pass=request.getParameter("userpass");
//        User user=userDao.logValid(name,pass);
//
//        if(user!=null){
//            System.out.println("拦截成功");
//            return true;
//        }
//        else{
//            System.out.println("拦截失败");
//            return false;
//        }
//
//    }
//
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("postHandle");
//    }
//
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}
