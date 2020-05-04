package com.zensar;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProductManagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// SpringApplication.run(ProductManagementApplication.class, args);
		
		/*
		 * SpringApplicationBuilder springApplicationBuilder = new
		 * SpringApplicationBuilder(ProductManagementApplication.class);
		 * 
		 * springApplicationBuilder.properties("spring.config.name:myapplication");
		 * 
		 * springApplicationBuilder.properties("server.port:3333");
		 * 
		 * springApplicationBuilder.build();
		 * 
		 * springApplicationBuilder.run(args);
		 */
		
		new SpringApplicationBuilder(ProductManagementApplication.class)
		.properties("spring.config.name:myapplication")
		.build()
		.run(args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}
	
	

}
