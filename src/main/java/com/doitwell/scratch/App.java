package com.doitwell.scratch;

import com.doitwell.scratch.models.*;
public class App{

	public static void main(String[] args){

	User user = new User("mcmvambodo@gmail.com","abcd1234");

		System.out.println("Username: "+user.getUSername());
		System.out.println("Password: "+user.getPassword());

	}
}