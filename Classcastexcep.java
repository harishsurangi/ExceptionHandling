package com.exception.handling.excercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Classcastexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		try {
			 String[] strArray = new String[] { "John", "Snow" };
			 ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
			 System.out.println("String list: " + strList);
		}
		catch(ClassCastException e) {
			 System.out.println(e.toString());
		}
		
    
	}

}
