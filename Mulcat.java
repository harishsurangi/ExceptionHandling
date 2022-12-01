package com.exception.handling.excercises;

public class Mulcat {

	public static void main(String[] args){
		// TODO Auto-generated method stub
       try {
		System.out.println(10/0);
       }
       catch(ArithmeticException e) {
    	   System.out.println(10/2);
       }
      /* catch(ArithmeticException e) {
    	   System.out.println(10/2);
       }*/
       catch(Exception e) {
    	   System.out.println("already caught");
       }
       /* withdraw(1000000);
		
   	}
   	public static void withdraw(double amount)  {
   		double balance = 10000;
   		if(amount>balance ) {
   		throw new ArithmeticException("insufficient founds");
   		}*/
	}

}
