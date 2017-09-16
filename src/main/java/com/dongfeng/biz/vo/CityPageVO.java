package com.dongfeng.biz.vo;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Data
public class CityPageVO {

    private List<BannerVO> bannerVOList = Lists.newArrayList();;
    private List<ItemVO> itemVOList = Lists.newArrayList();;

    public List addBanner(BannerVO bannerVO) {
        if (bannerVO == null) {
            return bannerVOList;
        }

        bannerVOList.add(bannerVO);
        return bannerVOList;
    }

    public List addItem(ItemVO itemVO) {
        if (itemVO == null) {
            return itemVOList;
        }

        itemVOList.add(itemVO);
        return itemVOList;
    }


}
