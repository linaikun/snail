package com.monkey.snail.config.knife4j;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfig {
 
    @Bean
    public Docket docket(Environment environment) {
        // 添加接口请求头参数配置 没有的话 可以忽略
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("token")
                .description("令牌")
                .defaultValue("")
                .modelRef(new ModelRef("string"))
                .parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否启动swagger 默认启动
                .enable(true)
                //所在分组
                .groupName("snail")
                .select()
                //指定扫描的包路径
                .apis(RequestHandlerSelectors.basePackage("com.monkey.snail.modules"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);
    }
 
    private ApiInfo apiInfo() {
        Contact author = new Contact("李迺锟", "山东省烟台市", "1198025944@qq.com");
        return new ApiInfo(
                "snail文档",
                "snail文档",
                "1.0",
                "",
                author,
                "",
                "",
                new ArrayList<>()
        );
    }
}