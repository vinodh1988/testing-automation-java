package com.interfaces;

public class MessageProcessor {
	
	public static void processMessage(Message m,String message) {
		System.out.println(m.process(message));
	}

}
