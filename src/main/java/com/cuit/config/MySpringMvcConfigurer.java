package com.cuit.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */

@Configuration
public class MySpringMvcConfigurer {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
         return    new WebMvcConfigurer(){
                //添加视图控制
                @Override                                                   //  找/main/login.html
                public void addViewControllers(ViewControllerRegistry registry) {
                    registry.addViewController("/").setViewName("main/index");
                    registry.addViewController("/a.html").setViewName("a");


                }
         };
    }


}
