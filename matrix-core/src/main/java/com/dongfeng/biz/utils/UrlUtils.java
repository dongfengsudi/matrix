package com.dongfeng.biz.utils;

import org.apache.commons.lang3.StringUtils;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
public class UrlUtils {


    public static String urlEncode(String url) {
        try {
            if (StringUtils.isEmpty(url)) {
                return url;
            }
            return URLEncoder.encode(url,"utf-8");
        }catch (Exception e) {

        }
        return url;
    }


    public static String urlDecode(String url) {
        try {
            if (StringUtils.isEmpty(url)) {
                return url;
            }
            return URLDecoder.decode(url,"utf-8");
        }catch (Exception e) {

        }
        return url;
    }

}
