package com.gdsdxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(
                        new Contact("20计应二班-林武泰", "https://www.gdsdxy.edu.cn/", "2786794141@qq.com")
                )
                .title("文档标题")
                .description("描述信息")
                .version("1.0")
                .build();

        docket.apiInfo(apiInfo);

        return docket;
    }


}
