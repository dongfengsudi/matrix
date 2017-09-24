package com.dongfeng.biz.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
public class ArrayUtils {

    /**
     * 网上找的, 用来将 target 分割为 size份,
     * @param target
     * @param size
     * @param <T>
     * @return
     */
    public static <T> List<List<T>>  createList(List<T> target, int size) {
        List<List<T>> listArr = new ArrayList<>();
        //获取被拆分的数组个数
        int arrSize = target.size()%size==0?target.size()/size:target.size()/size+1;
        for(int i=0;i<arrSize;i++) {
            List<T>  sub = new ArrayList<>();
            //把指定索引数据放入到list中
            for(int j=i*size;j<=size*(i+1)-1;j++) {
                if(j<=target.size()-1) {
                    sub.add(target.get(j));
                }
            }
            listArr.add(sub);
        }
        return listArr;
    }

}
