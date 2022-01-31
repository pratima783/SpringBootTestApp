package com.src.webintializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationIntializer implements WebApplicationInitializer 
{

	@Override
	public void onStartup(ServletContext servletContext) {
		// TODO Auto-generated method stub
		WebApplicationContext context=getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcher= servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
	}

	private AnnotationConfigWebApplicationContext getContext() {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.src.webintializer");
		return context;
	}
	
	

}
