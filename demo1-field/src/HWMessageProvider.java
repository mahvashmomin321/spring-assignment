package com.capgemini.spring.provider;

@Component("hw")
public class HWMessageProvider implements MessageProvider{
	@Override
	public String getMessage(){
		return "Hello World!!";
	}
}