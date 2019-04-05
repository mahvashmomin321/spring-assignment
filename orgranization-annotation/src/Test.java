package com.capgemini.spring.test;
import com.capgemini.spring.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Organization organization=context.getBean(Organization.class);
        System.out.println(organization.toString()); 
    }
}