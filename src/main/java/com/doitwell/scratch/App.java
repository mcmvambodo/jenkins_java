package com.doitwell.scratch;

import com.doitwell.scratch.models.*;
public class App{

	public static void main(String[] args){

		if(args.length>1){
			Integer result = User.sum(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			System.out.println(String.format("%s + %s = %s", args[0], args[1],result));
		}
	

	}
}