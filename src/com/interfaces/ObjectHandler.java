package com.interfaces;

public class ObjectHandler implements Message{

	@Override
	public String process(String message) {
		// TODO Auto-generated method stub
		return "Object Handler handled message: "+message;
	}

}
