//package com.dongfeng.admin.controller;
//
//import com.dongfeng.admin.biz.data.UserDO;
//import com.dongfeng.admin.biz.repository.UserRepository;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// * Created by zihan on 2017/9/16.
// */
//public class LoginController {
//
//    private UserRepository userR;
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
////                        ,Model model) {
//        UserDO user = userR.findByName(username);
////        if (username.equals("admin") && password.equals("admin")) {
////            model.addAttribute("username", username);
//        if(password.equals(user.getPassword())){
//            return "ok.jsp";
//        } else {
////            model.addAttribute("username", username);
//            return "login";
//        }
//    }
//}
