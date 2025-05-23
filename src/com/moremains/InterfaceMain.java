package com.moremains;

import java.util.Scanner;

import com.interfaces.BinaryProcessor;
import com.interfaces.Message;
import com.interfaces.MessageProcessor;
import com.interfaces.ObjectHandler;
import com.interfaces.TextMessage;

public class InterfaceMain {

	 public static void main(String[] args) {
	   Message m;
	   System.out.println("Which message Processor you want to process the message");
	   System.out.println("1. Text Message 2. Binary Processor 3. Object Handler");
	   Scanner sc=new Scanner(System.in);
	   int i=Integer.parseInt(sc.next());
	   switch(i) {
	   case 1:
		   m=new TextMessage();
		   break;
	   case 2:
		   m=new BinaryProcessor();
		   break;
	   case 3:
		   m=new ObjectHandler();
		   break;
		default:
		   m =new TextMessage();
	   }
	   System.out.println("Whats the message:");
	   String message=sc.next();
	   MessageProcessor.processMessage(m, message);
	 }
}
