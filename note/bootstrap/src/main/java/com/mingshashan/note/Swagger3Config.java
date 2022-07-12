package com.mingshashan.note;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * swagger3 configuration
 *
 * @author mingshashan
 * 参考@see {https://www.cnblogs.com/vipnewboy/p/15664220.html}
 */
@Configuration
@Profile({"dev", "local"})
@EnableOpenApi
@EnableSwaggerBootstrapUI
public class Swagger3Config {


    /**
     * 创建API
     * http:IP:端口号/swagger-ui/index.html 原生地址
     * http:IP:端口号/doc.html bootStrap-UI地址
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .pathMapping("/")
                // 用来创建该API的基本信息，展示在文档的页面中（自定义展示的信息）
                .apiInfo(apiInfo())
                // 设置哪些接口暴露给Swagger展示
                .select()
                // 扫描所有有注解的api，用这种方式更灵活
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 扫描指定包中的swagger注解
                // .apis(RequestHandlerSelectors.basePackage("com.xxx.controller"))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("(?!/ApiError.*).*"))
                .paths(PathSelectors.any())
                .build()
                // 支持的通讯协议集合
                .protocols(new HashSet<>(Lists.newArrayList("https", "http")))
                .securitySchemes(securitySchemes())
                .securityContexts(securityContexts());
    }

    /**
     * 认证的安全上下文
     */
    private List<SecurityScheme> securitySchemes() {
        List<SecurityScheme> securitySchemes = new ArrayList<>();
        securitySchemes.add(new ApiKey("token", "token", "header"));
        return securitySchemes;
    }

    /**
     * 授权信息全局应用
     */
    private List<SecurityContext> securityContexts() {
        List<SecurityContext> securityContexts = new ArrayList<>();
        securityContexts.add(SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.any()).build());
        return securityContexts;
    }

    /**
     * default auth
     *
     * @return
     */
    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        List<SecurityReference> securityReferences = new ArrayList<>();
        securityReferences.add(new SecurityReference("Authorization", authorizationScopes));
        return securityReferences;
    }

    /**
     * 添加摘要信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                // 设置标题
                .title("接口文档")
                // 描述
                .description("描述")
                // 作者信息
                .contact(new Contact("take-note", null, null))
                // 版本
                .version("版本号:V1")
                //协议
                .license("The Apache License")
                //协议url
                .licenseUrl("http://www.baidu.com")
                .build();
    }
}