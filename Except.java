package com.exception.handling.excercises;

import java.util.Scanner;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc= new Scanner(System.in);
          System.out.println("enter your age based on adhaar card for age validation");
          int age=sc.nextInt();
          sc.close();
      
         if(age>18) {
        	 throw new Lowbalance(" u got age of majority ready to vote & so fill the form & use your vote ");
        	
         }
         else if(age>0.1&&age<18) {
        	 throw new Okbalance(" u r not in age of majority wait until 18 years come so go home ");
        	 
         }else {
        	 System.out.println(" dont do stupid things enter age related to human ");
         }
         
          
	}

}
