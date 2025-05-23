package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.interfaces.Message;
import com.interfaces.ObjectHandler;
import com.interfaces.TextMessage;

public class MessageTests {
  Message message;
  
  public void setMessage(Message message) {
	this.message = message;
  }
  
  @Test
  public void testTextMessage() {
	setMessage(new TextMessage());
	String actuals[]= {
		  message.process("Hello"),
		  message.process("Hello World"),
		  message.process("Hey there"),
	  };
	String expecteds[]= {
		  "Text Message Processed: Hello",
		  "Text Message Processed: Hello World",
		  "Text Message Processed: Hey there",
	  };
	assertEquals(actuals[0], expecteds[0]);
	assertEquals(actuals[1], expecteds[1]);
	assertEquals(actuals[2], expecteds[2]);
  }
  
  @Test
  public void objectHandlerMessage() {
	  setMessage(new ObjectHandler());
	  String actuals[]= {
			  message.process("Hello"),
			  message.process("Hello World"),
			  message.process("Hey there"),
		  };
	  String expecteds[]= {
			  "Object Handler handled message: Hello",
			  "Object Handler handled message: Hello World",
			  "Object Handler handled message: Hey there",
		  };
	  assertEquals(actuals[0], expecteds[0]);
	  assertEquals(actuals[1], expecteds[1]);
	  assertEquals(actuals[2], expecteds[2]);
  }
 }

