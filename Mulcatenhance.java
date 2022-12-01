package com.exception.handling.excercises;

public class Mulcatenhance  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//System.out.println(10/0);
		
		try
		{
		System.out.println(10/0);
	    String s=null;
		System.out.println(s.length());
		Object o= new Object();
		String s1= (String)o;
		Thread.sleep(1000);
		}
		catch(ArithmeticException|NullPointerException|InterruptedException|ClassCastException e) {
			System.out.println(e);
		}
		
	
	}

}
