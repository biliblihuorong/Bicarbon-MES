package top.asshell.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringMVCConfig  extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("启动成功放行配置");
        registry.addResourceHandler("/static/**").addResourceLocations(
                "classpath:/static/");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations(
                "classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public Docket getDocket() {
        // 文档类型
        System.out.println("启动成功加载配置");
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.asshell.controller"))//给controller生成测试接口文档
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {//接口文档信息
        return new ApiInfoBuilder()
                .title("国赛测试")
                .version("1.0")
                .description("接口文档")
                .build();
    }
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*") // 允许的源（域名或IP），可以使用通配符 * 表示所有来源
                .allowedMethods("*") // 允许的 HTTP 方法，例如 GET、POST、PUT，或使用 * 表示所有方法
                .allowedHeaders("*") // 允许的请求头，或使用 * 表示所有头部信息
                .allowCredentials(true) // 是否允许发送凭据信息（例如 Cookie、Authorization 头），如果需要携带凭据，则设置为 true
                .maxAge(3600); // 预检请求的有效期，单位为秒
    }


}
