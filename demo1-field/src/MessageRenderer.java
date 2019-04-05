package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;

public class MessageRenderer{

	@Autowired
	@Qualifier("gm")
	private MessageProvider provider;

	public void render(){
		System.out.println(provider.getMessage());	
	}
}