package com.dongfeng.admin.controller;

import com.dongfeng.admin.biz.repository.UserRepository;
import com.dongfeng.admin.contant.PageConstant;
import com.dongfeng.biz.service.CommunityPageService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private UserRepository userRepository;

    @Resource
    private CommunityPageService communityPageService;

    @RequestMapping("/login.htm")
    public String login(Model model,String context) {
        if (StringUtils.isNotEmpty(context)) {
            model.addAttribute("result",context);
        }
        return "/admin/login";
    }

    @RequestMapping(value = "/tryLogin.do", method = RequestMethod.POST)
    public String tryLogin(HttpSession session, String username, String password) {

        if(userRepository.findByNameAndPassword(username,password)!=null){
            session.setAttribute(PageConstant.USER_NAME,username);
            return "redirect:/admin/index.htm";
        } else {
            return "redirect:/admin/login.htm?context=fail";
        }

    }


    @RequestMapping("/index.htm")
    public String index(HttpSession session, Model model) {
        String username = (String) session.getAttribute(PageConstant.USER_NAME);
        model.addAttribute("username",username);
        return "admin/index";
    }


    @RequestMapping("/test.htm")
    public String test() {
        return "admin/test";
    }


}
