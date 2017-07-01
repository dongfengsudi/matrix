package com.dongfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author muying.xx
 * @date 2017-07-01
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }
}
