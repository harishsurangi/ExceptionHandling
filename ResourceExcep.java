package com.exception.handling.excercises;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResourceExcep {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
      
		try(FileReader fr= new FileReader("input.txt");FileWriter fw= new FileWriter("output.txt")){
			
		
			 System.out.println("harish");
		}
	}

}
