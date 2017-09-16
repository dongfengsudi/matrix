package com.dongfeng.controller.test;

import com.dongfeng.biz.constant.NavTab;
import com.dongfeng.biz.data.BannerDO;
import com.dongfeng.biz.data.CellDO;
import com.dongfeng.biz.repository.BannerRepository;
import com.dongfeng.biz.repository.CellRepository;
import com.dongfeng.biz.utils.UrlUtils;
import io.vavr.control.Try;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private BannerRepository bannerRepository;

    @Resource
    private CellRepository cellRepository;

    @RequestMapping("/cell/insert.htm")
    public String insertCell(@RequestParam(value="title") String title,
                             @RequestParam(value="img") String img,
                             @RequestParam(value="link") String link,
                             @RequestParam(value="desc") String desc) {

        CellDO cellDO = new CellDO();

        img = UrlUtils.urlDecode(img);
        link = UrlUtils.urlDecode(link);

        cellDO.setDeleted((byte) 0);
        cellDO.setGmtCreate(new Date());
        cellDO.setGmtModified(new Date());

        cellDO.setTitle(title);
        cellDO.setBackgroundImg(img);
        cellDO.setLink(link);
        cellDO.setDescription(desc);
        cellDO.setTabIdentity(NavTab.COMMUNITY.getIdentity());

        Try<CellDO> tryResult = Try.of(() -> cellRepository.save(cellDO));
        if (tryResult.isSuccess()) {
            return "success";
        } else {
            tryResult.onFailure(e -> {
                System.out.println(e.getMessage());
                e.printStackTrace();
            });
            return "fail";
        }

    }




    @RequestMapping("/banner/insert.htm")
    public String insertBanner(@RequestParam(value="pic") String pic,
                             @RequestParam(value="link") String link,
                             @RequestParam(value="identity") String identity) {

        BannerDO bannerDO = new BannerDO();
        bannerDO.setDeleted((byte) 0);
        bannerDO.setGmtCreate(new Date());
        bannerDO.setGmtModified(new Date());
        bannerDO.setLink(link);
        bannerDO.setPicUrl(pic);
        bannerDO.setTabIdentity(identity);

        if (Try.of(() -> bannerRepository.save(bannerDO)).isSuccess()) {
            return "success";
        } else {
            return "fail";
        }
    }


}
