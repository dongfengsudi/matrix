package com.dongfeng.biz.page;

import com.dongfeng.biz.data.CommunityCellDO;
import com.dongfeng.biz.data.CommunityPageDO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muying.xx
 * @date 2017-07-02
 */
@Component
public class CommunityPageService {

    public CommunityPageDO getPage() {

        List<CommunityCellDO> line1 = new ArrayList<>();
        CommunityCellDO cell1 = new CommunityCellDO("金葵一居","http://upload.gezila.com/data/20160912/25941473646354.jpg","weixin://profile/gh_93431c4b9a00");
        CommunityCellDO cell2 = new CommunityCellDO("金葵二居","http://pic1.ooopic.com/uploadfilepic/sheji/2010-01-27/OOOPIC_WHMH_201001275a57897b2805f548.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MjM5NDkxMTgyNw==&scene=124#wechat_redirect");
        line1.add(cell1);
        line1.add(cell2);

        List<CommunityCellDO> line2 = new ArrayList<>();
        CommunityCellDO cell3 = new CommunityCellDO("阳光二居","http://tupian.enterdesk.com/2013/lxy/09/14/1/8.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MjM5NjE4NjAwMA==&scene=124#wechat_redirect");
        CommunityCellDO cell4 = new CommunityCellDO("碧云居委","http://img3.a0bi.com/upload/ttq/20140810/1407676684893.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MjM5MDE0Mjc4MA==&scene=124#wechat_redirect");
        line2.add(cell3);
        line2.add(cell4);

        List<CommunityCellDO> line3 = new ArrayList<>();
        CommunityCellDO cell5 = new CommunityCellDO("城市家园","http://pic.58pic.com/58pic/14/26/38/44658PICKP7_1024.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MjM5NDAxMTE0MA==&scene=124#wechat_redirect");
        line3.add(cell5);



        List<List<CommunityCellDO>> lineList = new ArrayList<>();
        lineList.add(line1);
        lineList.add(line2);
        lineList.add(line3);

        CommunityPageDO communityPageDO = new CommunityPageDO();
        communityPageDO.setLineList(lineList);

        return communityPageDO;
    }

}
