package com.src.webintializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.src.controller")
public class ApplicationConfig {


	@Bean 
	public InternalResourceViewResolver general()
{
	InternalResourceViewResolver irv= new InternalResourceViewResolver();
	irv.setPrefix("/WEB-INF/jsp/");
	irv.setSuffix(".jsp");
	return irv;
	
}
	
	
}
