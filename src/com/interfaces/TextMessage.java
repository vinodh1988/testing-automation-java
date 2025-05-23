package com.interfaces;

public class TextMessage implements Message {

	@Override
	public String process(String message) {
		// TODO Auto-generated method stub
		return "Text Message Processed: "+message;
	}

}
