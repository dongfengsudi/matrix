package com.dongfeng.biz.vo;

import com.dongfeng.biz.data.CellDO;
import lombok.Data;
import lombok.NonNull;

/**
 * @author muying.xx
 * @date 2017-07-02
 */
@Data
public class CommunityCellVO {
    private String title;
    private String backgroudImg; // 背景图片
    private String link; // 链接

    public CommunityCellVO() {

    }

    public CommunityCellVO(String title, String backgroudImg, String link) {
        this.title = title;
        this.backgroudImg = backgroudImg;
        this.link = link;
    }

    /**
     *
     * @param cellDO
     * @throws  if param is null, throw null point exception
     * @return
     */
    public static CommunityCellVO from(@NonNull CellDO cellDO) {
        CommunityCellVO communityCellVO = new CommunityCellVO();
        communityCellVO.setLink(cellDO.getLink());
        communityCellVO.setTitle(cellDO.getTitle());
        communityCellVO.setBackgroudImg(cellDO.getBackgroundImg());
        return communityCellVO;
    }
}
