package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Lazy
@Component("hm")
public class HWMessageProvider implements MessageProvider{
	@Override
	public String getMessage(){
		return "Hello World!!";
	}
}