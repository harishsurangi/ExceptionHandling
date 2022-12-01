package com.exception.handling.excercises;

public class Dogtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try(Dog d= new Dog()){
    	d.shout();
    }
	}

}
