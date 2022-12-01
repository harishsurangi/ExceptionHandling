package com.exception.handling.excercises;

public class Dog  implements AutoCloseable {

		  public void shout() {
		     System.out.print("The dog is barking.");
		     System.out.println();
		   }
		 
		   public void close() {
		     System.out.print("Now the dog mouth is closed. ");
		  }
		 }
		 

