package com.dongfeng.biz.vo;

import com.dongfeng.biz.data.CellDO;
import lombok.Data;
import lombok.NonNull;

/**
 * 页面上的 条目, 比如 city页面, banner下的,就是一个条目
 * @author muying.xx
 * @date 2017-09-16
 */
@Data
public class ItemVO {

    private long id;             // id
    private String title;        // 标题
    private String img;          // 图片链接
    private String description;  // 描述
    private String followLink;   // 关注链接

    public ItemVO() {
    }

    public static ItemVO from(@NonNull CellDO cellDO) {
        ItemVO itemVO = new ItemVO();
        itemVO.id = cellDO.getId();
        itemVO.title = cellDO.getTitle();
        itemVO.img = cellDO.getBackgroundImg();
        itemVO.description = cellDO.getDescription();
        itemVO.followLink = cellDO.getLink();
        return itemVO;
    }

}
