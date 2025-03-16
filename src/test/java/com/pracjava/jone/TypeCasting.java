package com.pracjava.jone;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Type casting as two types
		 * 1. Primitive type casting -- has 2 types 1. widening(implict)2. narrowing(explicit)
		 * 2. non primitives type casting -- has two types 1. upcasting 2. downcasting
		 * 
		 * **/
		
		
		/** Primitive type casting: Converting values from one primitive type to other primitive values(byte, short, int, long, float, double, char, boolean)
		 * 
		 * in widening : the process of converting a narrow data type into a wider data type is know as widening
		 * byte--->short--->int--->long---->float-->double--->boolean
		 * char--->int--->long---->float-->double--->boolean
		 * 
		 * (type)variable
		 * 
		 * 
		 * 
		 * ***/
		
		
		
		double d= 23.99900;
		int c= (int) d;
		System.out.println(c);

	}

}
