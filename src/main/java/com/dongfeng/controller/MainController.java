package com.dongfeng.controller;

import com.dongfeng.biz.vo.CommunityCellVO;
import com.dongfeng.biz.vo.CommunityPageVO;
import com.dongfeng.biz.service.CommunityPageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author muying.xx
 * @date 2017-07-01
 */
@Controller
public class MainController {

    @Resource
    private CommunityPageService communityPageService;

    @GetMapping("/")
    public String root(Model model) {
        CommunityPageVO communityPageDO = communityPageService.getPage();
        if (communityPageDO == null) {
            return "error";
        }
        List<List<CommunityCellVO>> lineList = communityPageDO.getLineList();
        model.addAttribute("lineList",lineList);
        return "index";
    }

    @RequestMapping("/city_page")
    public String cityPage() {
        return "city_page";
    }

    @RequestMapping("town_page")
    public String townPage() {
        return "town_page";
    }

    @RequestMapping("community_page")
    public String communityPage(Model model) {
        CommunityPageVO communityPageDO = communityPageService.getPage();
        if (communityPageDO == null) {
            return "error";
        }
        List<List<CommunityCellVO>> lineList = communityPageDO.getLineList();
        model.addAttribute("lineList",lineList);
        return "community_page";
    }

    @RequestMapping("test")
    public String test(Model model) {
        CommunityPageVO communityPageDO = communityPageService.getPage();
        if (communityPageDO == null) {
            return "error";
        }
        List<List<CommunityCellVO>> lineList = communityPageDO.getLineList();
        model.addAttribute("lineList",lineList);

        return "test";
    }


}
