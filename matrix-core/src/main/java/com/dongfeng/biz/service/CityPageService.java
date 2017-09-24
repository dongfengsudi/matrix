package com.dongfeng.biz.service;

import com.dongfeng.biz.constant.NavTab;
import com.dongfeng.biz.dao.BannerDAO;
import com.dongfeng.biz.dao.CellDAO;
import com.dongfeng.biz.data.BannerDO;
import com.dongfeng.biz.data.CellDO;
import com.dongfeng.biz.vo.BannerVO;
import com.dongfeng.biz.vo.CityPageVO;
import com.dongfeng.biz.vo.ItemVO;
import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Service
public class CityPageService {

    @Resource
    private BannerDAO bannerDAO;

    @Resource
    private CellDAO cellDAO;

    /**
     * 获取 『市区信息』/ 『镇级条线』 页面
     * @return
     */
    public CityPageVO getCityPage(NavTab navTab) {

        List<BannerVO> bannerVOList = this.getBannerList(navTab.getIdentity());
        List<ItemVO> itemVOList = this.getCellList(navTab.getIdentity());

        CityPageVO cityPageVO = new CityPageVO();
        cityPageVO.setBannerVOList(bannerVOList);
        cityPageVO.setItemVOList(itemVOList);

        return cityPageVO;
    }



    private List<BannerVO> getBannerList(String identity) {

        List<BannerDO> bannerDOList = bannerDAO.findByTabIdentity(identity);
        if (CollectionUtils.isEmpty(bannerDOList)) {
            return Lists.newArrayList();
        }

        return bannerDOList.stream().filter(Objects::nonNull)
                .map(BannerVO::from).collect(Collectors.toList());
    }

    private List<ItemVO> getCellList(String identity) {
        List<CellDO> cellDOList = cellDAO.findByTabIdentity(identity);
        if (CollectionUtils.isEmpty(cellDOList)) {
            return Lists.newArrayList();
        }

        return cellDOList.stream().filter(Objects::nonNull)
                .map(ItemVO::from).collect(Collectors.toList());

    }




}
