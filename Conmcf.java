package com.exception.handling.excercises;

public class Conmcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		try {
			System.out.println("1st line");
			System.out.println("2nd line");
			try {
				System.out.println("1st1 line");
				System.out.println("2nd2 line");
				System.out.println(10/0);
				
				
			}catch(Exception e) {
				System.out.println(10/0);
			
			}
			System.out.println("3rd line");
			
			
		}catch(Exception e) {
			System.out.println("4th line");
		
		}
		finally{
			System.out.println("5th line");
		}
		System.out.println("6th line");
	}

}
