package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class MessageRenderer{

	private MessageProvider provider;

	@Autowired
	@Qualifier("gm")
	public  void setMessageProvider(MessageProvider provider){
		this.provider= provider;
	}
	public void render(){
		System.out.println(provider.getMessage());	
	}
}