package com.org.SpringCloudConfigDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigDemoApplication.class, args);
	}

}
