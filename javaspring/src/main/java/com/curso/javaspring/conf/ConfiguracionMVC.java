package com.curso.javaspring.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan
@Configuration
public class ConfiguracionMVC {

	public ConfiguracionMVC() {
		super();
		System.out.println("Creando una instancia de ConfiguracionMVC");
	}
	
	public ViewResolver viewResolver() {
		
		System.out.println("Instanciando el ViewResolver");
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/paginas/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
