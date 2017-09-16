package com.dongfeng.admin.interceptor;

import com.dongfeng.biz.utils.UrlUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截器, 拦截所有待 admin的请求, 用来判断是否需要登录
 * @author muying.xx
 * @date 2017-09-16
 */
@Component
public class AuthorityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //获取请求的URL
        String url = request.getRequestURI();

        if(url.indexOf("login")>=0){
            return true;
        }

        //获取Session
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");

        if(username != null){
            return true;
        }

        String urlEncode = UrlUtils.urlEncode(url);
        //不符合条件的，跳转到登录界面
        response.sendRedirect("login.htm?url="+urlEncode);
        return false;
    }
}
