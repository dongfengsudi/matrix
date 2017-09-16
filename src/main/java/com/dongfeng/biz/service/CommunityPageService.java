package com.dongfeng.biz.service;

import com.dongfeng.biz.vo.CommunityCellVO;
import com.dongfeng.biz.vo.CommunityPageVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muying.xx
 * @date 2017-07-02
 */
@Component
public class CommunityPageService {

    public CommunityPageVO getPage() {

        List<CommunityCellVO> line1 = new ArrayList<>();
        CommunityCellVO cell1 = new CommunityCellVO("张桥","http://i1.buimg.com/601291/f2b85ae2fa811fb1t.jpg","#");
        CommunityCellVO cell2 = new CommunityCellVO("永业一居","http://i1.buimg.com/601291/cf9a2adcd38425dat.jpg","#");
        line1.add(cell1);
        line1.add(cell2);

        List<CommunityCellVO> line2 = new ArrayList<>();
        CommunityCellVO cell3 = new CommunityCellVO("永业二居","http://i1.buimg.com/601291/d1386079d0bb9a4ft.jpg","#");
        CommunityCellVO cell4 = new CommunityCellVO("金桥新城","http://i1.buimg.com/601291/f10073399e40286dt.jpg","#");
        line2.add(cell3);
        line2.add(cell4);

        List<CommunityCellVO> line3 = new ArrayList<>();
        CommunityCellVO cell5 = new CommunityCellVO("城市家园","http://i1.buimg.com/601291/50c4b4acc7b747b3t.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI3MjQwNzU2Mw==&scene=124#wechat_redirect");
        CommunityCellVO cell6 = new CommunityCellVO("金葵一居","http://i1.buimg.com/601291/639420e189c40586t.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzIwODQ5NzY0Nw==&scene=124#wechat_redirect");
        line3.add(cell5);
        line3.add(cell6);

        List<CommunityCellVO> line4 = new ArrayList<>();
        CommunityCellVO cell7 = new CommunityCellVO("金葵二居","http://i1.buimg.com/601291/d2d027c5064b6ca7t.jpg","#");
        CommunityCellVO cell8 = new CommunityCellVO("金葵三居","http://i1.buimg.com/601291/506a3aa024027199t.jpg","#");
        line4.add(cell7);
        line4.add(cell8);

        List<CommunityCellVO> line5 = new ArrayList<>();
        CommunityCellVO cell9 = new CommunityCellVO("阳光一居","http://i1.buimg.com/601291/8e82bd513f8ca40et.jpg","#");
        CommunityCellVO cell10 = new CommunityCellVO("阳光二居","http://i1.buimg.com/601291/b2676f1826f0ed6bt.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI2OTEzODc1Nw==&scene=124#wechat_redirect");
        line5.add(cell9);
        line5.add(cell10);

        List<CommunityCellVO> line6 = new ArrayList<>();
        CommunityCellVO cell11 = new CommunityCellVO("碧云社区","http://i1.buimg.com/601291/cfde081868ee4351t.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI1MDYzODE4Mg==&scene=124#wechat_redirect");
        CommunityCellVO cell12 = new CommunityCellVO("金浦居委","http://i1.buimg.com/601291/2c37ee6e561a95aat.jpg","#");
        line6.add(cell11);
        line6.add(cell12);

        List<CommunityCellVO> line7 = new ArrayList<>();
        CommunityCellVO cell13 = new CommunityCellVO("佳虹居委","http://i1.buimg.com/601291/1c6a06a90ff79e66t.jpg","https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzU5MzAxNDg4OQ==&scene=124#wechat_redirect");
        line7.add(cell13);



        List<List<CommunityCellVO>> lineList = new ArrayList<>();
        lineList.add(line1);
        lineList.add(line2);
        lineList.add(line3);
        lineList.add(line4);
        lineList.add(line5);
        lineList.add(line6);
        lineList.add(line7);

        CommunityPageVO communityPageDO = new CommunityPageVO();
        communityPageDO.setLineList(lineList);

        return communityPageDO;
    }

}
