package com.pracjava.jone;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//&&--binary operator
		//||--binary operators
		// !---- unary operator
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println((10==10) && (10!=20));
		System.out.println((10==10) &&(10==20));
		
		System.out.println("logical or operator");
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println((10==10) || (10!=20));
		System.out.print((10==10) || (10==20));
		
		
		System.out.println("logical Operator");
		System.out.println(10==10);
		System.out.println(false);
		System.out.println(!false);
		System.out.println(10==10);
		System.out.print(!(10==10));

	}

}
