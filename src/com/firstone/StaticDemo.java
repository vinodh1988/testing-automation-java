package com.firstone;

public class StaticDemo {
    public static void main(String[] args) {
	     State s= new State();
	     
	     System.out.println("State of s:"+s.getCount());
	     System.out.println("State of Scount"+State.getScount());
	     
	     State s2 =new State();
	     System.out.println("State of s1:"+s2.getCount());
	     System.out.println("State of Scount"+State.getScount());
	     
	     State s3= new State ();
	     System.out.println("State of s2:"+s3.getCount());
	     System.out.println("State of Scount"+State.getScount());
	     
	  
	     System.out.println("---------------------------");
	     System.out.println("State of s:"+s.getCount());
	     System.out.println("State of s1:"+s2.getCount());
	     System.out.println("State of s2:"+s3.getCount());
	     
	  System.out.println("State of Scount"+State.getScount());
   
	}
}
