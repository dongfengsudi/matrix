package com.dongfeng.biz.vo;

import com.dongfeng.biz.data.BannerDO;
import lombok.Data;

/**
 * 用来展现banner
 * @author muying.xx
 * @date 2017-09-16
 */
@Data
public class BannerVO {

    private long id; // id
    private String img; // 图片链接
    private String url; // 跳转链接

    public BannerVO() {}

    public static BannerVO from(BannerDO bannerDO) {
        BannerVO bannerVO = new BannerVO();
        bannerVO.setId(bannerDO.getId());
        bannerVO.setImg(bannerDO.getPicUrl());
        bannerVO.setUrl(bannerDO.getLink());
        return bannerVO;
    }


}
