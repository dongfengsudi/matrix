package com.dongfeng.admin.controller;

import com.dongfeng.admin.biz.data.UserDO;
import com.dongfeng.admin.biz.repository.UserRepository;
import com.dongfeng.biz.service.CommunityPageService;
import com.dongfeng.biz.vo.CommunityCellVO;
import com.dongfeng.biz.vo.CommunityPageVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Controller
public class AdminController {

    @Resource
    private UserRepository userR;

    @Resource
    private CommunityPageService communityPageService;

    @RequestMapping("login")
    public String root(Model model) {
        return "login";
    }

    @RequestMapping("addlogin")
    public String addLogin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDO user = userR.findByNameAndPassword(username, password);
        String str = "";
        if (user != null) {
            str = "index";
        } else {
            str = "login";
        }
        return str;

    }
}
