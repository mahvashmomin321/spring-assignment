package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;

public class MessageRenderer{
	private MessageProvider provider;

 	public MessageRenderer(MessageProvider provider) {
		 this.provider = provider;
	}

	public void render(){
		System.out.println(provider.getMessage());	
	}
}