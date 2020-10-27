package com.hcl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.hcl.controller","com.hcl.config","com.hcl.Dao","com.hcl.entity","com.hcl.service"})
public class MvcWebConfig implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver veiw()
	{
		InternalResourceViewResolver v=new InternalResourceViewResolver();
		v.setPrefix("/WEB-INF/view/");
		v.setSuffix(".jsp");
		return v;
	}
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/resources/**")
            .addResourceLocations("/resources/");
    }


}
