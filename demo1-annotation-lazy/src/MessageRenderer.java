package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class MessageRenderer{

	private MessageProvider provider;

	@Autowired
	public  void setMessageProvider(MessageProvider provider){
		System.out.println("beans are created");
		this.provider= provider;
	}
	public void render(){
		System.out.println(provider.getMessage());	
	}
}
