package com.pracjava.jone;

public class increamentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		int b=11;
		System.out.println(a++);
		System.out.println(++b);
		
		/** ORDER OF EXECUTION
		 * Unary Operators : ++,--,!,type, +,-
		 * 
		 * Binary Operators:
		 *  *,/,%
		 *  +,-
		 *  relational: ==,!=,>,<,>=,<=
		 *  logical: &&,||
		 *  conditional Operator
		 *  Assignment Operators(Right to left)
		 *  
		 * 
		 * ***/
		
		
		int aa= 10;
		int bb=++aa;
		int c=b++ + ++aa;
		int d;
		d= aa--+--bb+(a>b?aa:bb)-c--;
		System.out.println(--aa);
		System.out.println(bb++);
		System.out.println(++c);
		System.out.println(d); 

	}

}
