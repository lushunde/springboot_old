package com.lushunde.springboot.config.swagger2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
/**
 * 
 * @node 在与spring boot集成时，放在与Application.java同级的目录下。
 * 		   通过@Configuration注解，让Spring来加载该类配置。
 * 		   再通过@EnableSwagger2注解来启用Swagger2。
 * @package springboot com.lushunde.springboot.config.swagger2 
 * @version 1.0
 * @date 2020年6月7日
 * @author bellus
 * @since JDK1.8
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	
	@Value("${swagger2.configuredFlag}")
    private boolean swagger2ConfiguredFlag;
	
	/**
	 * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。
	 * @return
	 * @author： bellus 2020年6月7日
	 */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.enable(swagger2ConfiguredFlag)
        		//设置信息
                .apiInfo(apiInfo()) 
                .select()
                //设置扫描路径
                .apis(RequestHandlerSelectors.basePackage("com.lushunde.springboot.web.controller"))  
                .paths(PathSelectors.any())
                .build();
    }
    
    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 				访问地址：http://项目实际地址/swagger-ui.html
     * @return
     * @author： bellus 2020年6月7日
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("项目文档RESTful APIs")
                .description("Spring Boot Demo的API文档")
                .termsOfServiceUrl("https://localhiost:8081/")
                .contact(contactInfo())
                .version("1.0")
                .build();
    }
    
    /**
     * 获取用户信息
     * @return
     * @author： bellus 2020年6月7日
     */
    private Contact contactInfo(){
    	return new Contact("bellus", "https://blog.lushunde.com/", "lushunde321@163.com");
    }
}