package com.capgemini.spring.test;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("beans are not created");
		MessageRenderer renderer= context.getBean(MessageRenderer.class);
		renderer.render();
		System.out.println("working");
		// MessageRenderer renderer1= context.getBean(MessageRenderer.class);
		// int hashcode1=renderer.hashCode();
		// int hascode2=renderer1.hashCode();
		// if(hashcode1 == hascode2){
		// 	System.out.println("It is singleton class");
		// }
	}
	
}