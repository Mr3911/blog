package com.qiang.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 路径映射配置
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${qiang.file-path}")
    private String url;

    // /E:/vblog/             /www/vblog/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("file:"+url+"/");
        registry.addResourceHandler("/article/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/categories/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/time/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/es/**")
                .addResourceLocations("classpath:/static/");
    }
}
