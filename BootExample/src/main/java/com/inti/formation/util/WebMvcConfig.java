package com.inti.formation.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport{

	@Override
	protected void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/login").setViewName("login");
//		lorsque j appelle cette commande tu m affiches cette page 
		registry.addViewController("/accueil").setViewName("index");
		registry.addViewController("/error").setViewName("error");
	}
}
