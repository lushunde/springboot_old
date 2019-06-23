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
 * @模块名：springboot
 * @包名：     com.lushunde.springboot.config.swagger2
 * @类名称：Swagger2Config
 * @类描述：在与spring boot集成时，放在与Application.java同级的目录下。
 * 			通过@Configuration注解，让Spring来加载该类配置。
 * 			再通过@EnableSwagger2注解来启用Swagger2。
 * @版本：      1.0
 * @创建人：bellus
 * @创建时间：2019年6月23日下午4:29:02
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	
	@Value("${swagger2.configuredFlag}")
    private boolean swagger2ConfiguredFlag;
	
	/**
	 * @方法名：createRestApi
	 * @方法描述:	创建API应用
     * 				apiInfo() 增加API相关信息
     * 				通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 				本例采用指定扫描的包路径来定义指定要建立API的目录。
	 * @return
	 * @修改描述:
	 * @版本：1.0
	 * @创建人：bellus
	 * @创建时间：2019年6月23日 下午6:40:29
	 * @修改人：bellus
	 * @修改时间：2019年6月23日 下午6:40:29
	 */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.enable(swagger2ConfiguredFlag)
                .apiInfo(apiInfo()) //设置信息
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lushunde.springboot.web.controller"))   //设置扫描路径
                .paths(PathSelectors.any())
                .build();
    }
    
    /**
     * 
     * @方法名：apiInfo
     * @方法描述:	创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 				访问地址：http://项目实际地址/swagger-ui.html
     * @return
     * @修改描述:
     * @版本：1.0
     * @创建人：bellus
     * @创建时间：2019年6月23日 下午6:41:06
     * @修改人：bellus
     * @修改时间：2019年6月23日 下午6:41:06
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
     * @方法名：contactInfo
     * @方法描述: 获取用户信息
     * @return
     * @修改描述:
     * @版本：1.0
     * @创建人：bellus
     * @创建时间：2019年6月22日 下午9:25:21
     * @修改人：bellus
     * @修改时间：2019年6月22日 下午9:25:21
     */
    private Contact contactInfo(){
    	return new Contact("bellus", "https://blog.lushunde.com/", "lushunde321@163.com");
    }
}