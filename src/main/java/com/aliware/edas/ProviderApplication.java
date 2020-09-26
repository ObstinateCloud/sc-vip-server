package com.aliware.edas;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class ProviderApplication {
//
//	@LoadBalanced
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//
//	@LoadBalanced
//	@Bean
//	public AsyncRestTemplate asyncRestTemplate(){
//		return new AsyncRestTemplate();
//	}

	public static void main(String[] args) {
		PandoraBootstrap.run(args);
		SpringApplication.run(ProviderApplication.class, args);
		PandoraBootstrap.markStartupAndWait();
	}

}
