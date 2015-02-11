package org.training.dubbo.provider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

@Configuration
public class DubboDemoConsumerConfig {
//	public static final String APPLICATION_NAME = "consumer-of-helloworld-app";
//
//	public static final String REGISTRY_ADDRESS = "zookeeper://192.168.20.40:2181?backup=192.168.20.41:2181,192.168.20.42:2181";
//
//	public static final String ANNOTATION_PACKAGE = "org.training.dubbo.provider";
//
//	@Bean
//	public ApplicationConfig applicationConfig() {
//		ApplicationConfig applicationConfig = new ApplicationConfig();
//		applicationConfig.setName(APPLICATION_NAME);
//		return applicationConfig;
//	}
//
//	@Bean
//	public RegistryConfig registryConfig() {
//		RegistryConfig registryConfig = new RegistryConfig();
//		registryConfig.setAddress(REGISTRY_ADDRESS);
//		registryConfig.setProtocol("rest");
//		return registryConfig;
//	}
//
//	@Bean
//	public AnnotationBean annotationBean() {
//		AnnotationBean annotationBean = new AnnotationBean();
//		annotationBean.setPackage(ANNOTATION_PACKAGE);
//		return annotationBean;
//	}
}
