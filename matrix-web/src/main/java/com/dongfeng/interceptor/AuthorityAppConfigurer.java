package com.dongfeng.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Configuration
public class AuthorityAppConfigurer extends WebMvcConfigurerAdapter {

    @Resource
    private AuthorityInterceptor authorityInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorityInterceptor)
                .addPathPatterns("/admin/*")  // 拦截所有带admin的请求
                .excludePathPatterns("/resources/*"); // 排除资源文件
        super.addInterceptors(registry);
    }



}

