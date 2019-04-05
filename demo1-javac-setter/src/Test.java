package com.capgemini.spring.test;
import com.capgemini.spring.annotation.*;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{
	public static void main(String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer messageRenderer=(MessageRenderer)context.getBean("renderer",MessageRenderer.class);
		messageRenderer.render();
		System.out.println("working");
	}
	
}