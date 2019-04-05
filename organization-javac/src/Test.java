package com.capgemini.spring.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.*;
import com.capgemini.spring.model.*;
import com.capgemini.spring.configuration.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{

	public static void main(String args[]){
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(OrganizationConfiguration.class);
		Organization organization=context.getBean(Organization.class);
		System.out.println(organization.toString());

	}
}