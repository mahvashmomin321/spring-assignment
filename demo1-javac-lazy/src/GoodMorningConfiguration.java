package com.capgemini.spring.annotation;

import com.capgemini.spring.render.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GoodMorningConfiguration {

 @Bean
 public MessageProvider provider() {
 	return new GMMessageProvider();
 }

 @Bean
 public MessageRenderer renderer(){
 	MessageRenderer renderer = new MessageRenderer();
 	renderer.setMessageProvider(provider());
 	return renderer;
 }
}