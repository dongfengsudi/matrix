package com.dongfeng.admin.controller;

import com.dongfeng.admin.biz.repository.UserRepository;
import com.dongfeng.admin.biz.service.ManageService;
import com.dongfeng.admin.contant.PageConstant;
import com.dongfeng.biz.constant.NavTab;
import com.dongfeng.biz.dao.BannerDAO;
import com.dongfeng.biz.data.BannerDO;
import com.dongfeng.biz.service.CityPageService;
import com.dongfeng.biz.service.CommunityPageService;
import com.dongfeng.biz.vo.CityPageVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

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
    private ManageService manageService;

    @Resource
    private CommunityPageService communityPageService;

    @Resource
    private CityPageService cityPageService;

    @Resource
    private BannerDAO bannerDAO;


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

        CityPageVO cityPageVO = cityPageService.getCityPage(NavTab.CITY);
        model.addAttribute("bannerList",cityPageVO.getBannerVOList());
        model.addAttribute("itemList",cityPageVO.getItemVOList());

        return "admin/index";
    }

    @RequestMapping("/cityBannerEdit")
    public String cityBannerEdit(@RequestParam("id") long id,
                                 @RequestParam("img") String img,
                                 @RequestParam("link") String link) {

        BannerDO bannerDO = bannerDAO.findOne(id);

        if (bannerDO == null) {
            bannerDO = new BannerDO();
            bannerDO.setTabIdentity(NavTab.CITY.getIdentity());
            bannerDO.setGmtCreate(new Date());
            bannerDO.setGmtModified(new Date());
        }

        bannerDO.setPicUrl(img);
        bannerDO.setLink(link);

        bannerDAO.addBanner(bannerDO);

        return "redirect:/admin/index.htm";
    }




    @RequestMapping("/test.htm")
    public String test() {
        return "admin/test";
    }

    @RequestMapping("/addCell")
    public void addCell(@RequestBody Map<String,Object> reqMap){
        String title = reqMap.get("title").toString();
        String back_img = reqMap.get("backgroud_img").toString();
        String link = reqMap.get("link").toString();
        String identity = reqMap.get("tab_identity").toString();
        String desc = reqMap.get("description").toString();
        manageService.addCell(title,back_img,link,identity,desc);
    }

    @RequestMapping("/delCell")
    public void delCell(@RequestBody Map<String, Object> reqMap){
        int id = Integer.parseInt(reqMap.get("id").toString());
        manageService.delCell(id);
    }

    @RequestMapping("/addBanner")
    public void addBanner(@RequestBody Map<String, Object> reqMap){
        String picUrl = reqMap.get("pic_url").toString();
        String link = reqMap.get("link").toString();
        String tabIdentit = reqMap.get("tab_identity").toString();
        manageService.addBanner(picUrl,link,tabIdentit);
    }

    @RequestMapping("/delBanner")
    public void delBanner(@RequestBody Map<String, Object> reqMap){
        int id = Integer.parseInt(reqMap.get("id").toString());
        manageService.delBanner(id);
    }

}
