package com.exception.handling.excercises;

public class Trycatfin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}
		public static int m1() {
		try {
			System.out.println("hari");
			System.exit(0);
			return 333;
			
		}catch(Exception e) {
			return 888;
		
		}
		finally{
			return 256;
		}
		

       }
	

}
