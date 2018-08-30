package com.chapter10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by xiaoxiaojing on 2018/8/30.
 */

@Configuration  //标明该文件是配置文件
@EnableSwagger2
public class SwaggerConfig {  //该类是固定写法

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("我的接口文档")
                .contact(new Contact("xiaoxiaojing","","xiaoxiaojing@qq.com"))
                .description("这是小小晶使用swaggerUI框架生成的接口文档")
                .version("1.0.0")
                .build();
    }

}
