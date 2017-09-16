package com.dongfeng.controller.test;

import com.dongfeng.biz.data.BannerDO;
import com.dongfeng.biz.repository.BannerRepository;
import com.dongfeng.biz.repository.T1Repository;
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
    private T1Repository t1Repository;

    @Resource
    private BannerRepository bannerRepository;

    @RequestMapping("/banner/insert.htm")
    public String insertData(@RequestParam(value="pic") String pic,
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
