package com.lixing.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //也可以使用@EnableEurekaClient代替 在spring cloud中服务发现组件有多种选择，例如Zookeeper、consul等。@EnableDiscoveryClient为各种服务组件提供了支持
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
}
