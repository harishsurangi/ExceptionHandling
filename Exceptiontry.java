package com.exception.handling.excercises;


public class Exceptiontry {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        doStuff();
        System.out.println("hello");
       
    }
    	 
	public static void doStuff()throws InterruptedException{
		doMoreStuff();
		
	}
	public static void doMoreStuff()throws InterruptedException{
	Thread.sleep(10000);
	}
		
		
}   
    




