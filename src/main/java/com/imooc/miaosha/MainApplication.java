package com.imooc.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author shkstart
 * @date 2021/5/6 - 22:06
 */
@SpringBootApplication
public class MainApplication  {
    public static void main(String[] args)throws Exception{
        SpringApplication.run(MainApplication.class,args);
    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return builder.sources(MainApplication.class);
//    }
}
