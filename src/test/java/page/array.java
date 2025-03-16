package page;

import java.util.Arrays;

public class array {
	
	public static void main(String args[]) {
		int array1[]= {10,20,5, 7, 18, 90, 23, 23, 56};
		
//		Arrays.sort(array1);
		 if (array1.length < 3) {
	            System.out.println("Array does not have enough elements.");
	            return;
	        }
		
		int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

		
		for(int i: array1) {
			if (i>first) {
				third = second;
				second= first;
				first= i;
			}else if(i>second) {
				third=second;
				second=i;
				
			}else if(i>third) {
				third = i;
			}
			
		}
		System.out.println("The 3rd highest element is: " + third);
	}

}
