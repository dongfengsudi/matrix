package com.dongfeng.admin.biz.service;

import com.dongfeng.biz.constant.NavTab;
import com.dongfeng.biz.dao.BannerDAO;
import com.dongfeng.biz.dao.CellDAO;
import com.dongfeng.biz.data.BannerDO;
import com.dongfeng.biz.data.CellDO;
import com.dongfeng.biz.repository.BannerRepository;
import com.dongfeng.biz.repository.CellRepository;
import com.dongfeng.biz.service.CityPageService;
import com.dongfeng.biz.service.CommunityPageService;
import com.dongfeng.biz.vo.CityPageVO;
import com.dongfeng.biz.vo.CommunityPageVO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by zihan on 2017/9/17.
 */

@Service
public class ManageService {
    @Resource
    private CommunityPageService communityPageService;

    @Resource
    private CityPageService cityPageService;

    @Resource
    private BannerRepository bannerRepository;

    @Resource
    private CellRepository cellRepository;

    public CityPageVO getCityPage(NavTab navTab) {
        return cityPageService.getCityPage(navTab);
    }

    public CommunityPageVO getPage() {
        return communityPageService.getPage();
    }

    public BannerDO addBanner(@RequestParam String picUrl, @RequestParam String link, @RequestParam String tabIdentity){
        BannerDO banner = new BannerDO();
        Date date = new Date();
        banner.setDeleted((byte)0);
        banner.setGmtCreate(date);
        banner.setGmtModified(date);
        banner.setLink(link);
        banner.setPicUrl(picUrl);
        banner.setTabIdentity(tabIdentity);
        return bannerRepository.save(banner);
    }

    public BannerDO delBanner(@RequestParam int id){
        BannerDO banner = new BannerDO();
        Date date = new Date();
        banner.setId(id);
        banner.setGmtModified(date);
        banner.setDeleted((byte) 1);
        return bannerRepository.save(banner);
    }

    public CellDO addCell(@RequestParam String title, @RequestParam String back_img, @RequestParam String link, @RequestParam String identity, @RequestParam String desc){
        CellDO cell = new CellDO();
        Date date = new Date();
        cell.setDeleted((byte)0);
        cell.setGmtCreate(date);
        cell.setGmtModified(date);
        cell.setBackgroundImg(back_img);
        cell.setLink(link);
        cell.setTabIdentity(identity);
        cell.setTitle(title);
        cell.setDescription(desc);
        return cellRepository.save(cell);
    }

    public CellDO delCell(@RequestParam int id){
        CellDO cell = new CellDO();
        Date date = new Date();
        cell.setId(id);
        cell.setDeleted((byte)1);
        cell.setGmtModified(date);
        return cellRepository.save(cell);
    }

}
