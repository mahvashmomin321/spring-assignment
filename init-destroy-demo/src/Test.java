package com.capgemini.spring.test;
 
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.capgemini.spring.model.*;
 
public class SpringDemo {
 
    public static void main(String a[]){
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context 
                            = new ClassPathXmlApplicationContext(confFile);
        NetworkManager networkMng = (NetworkManager) context.getBean("netManager");
        networkMng.readData();
        context.close();
    }
}