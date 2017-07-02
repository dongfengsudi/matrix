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

    @GetMapping("/city_page")
    public String cityPage() {
        return "city_page";
    }

    @GetMapping("town_page")
    public String townPage() {
        return "town_page";
    }

    @GetMapping("community_page")
    public String communityPage() {
        return "community_page";
    }

}
