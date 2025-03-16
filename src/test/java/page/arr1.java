package page;

public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dataType[] arr
		//dataType []arr
		//dataType arr[]
		
		//int arr[3]= {1,2,3};
		
		
		int array1[]=new int[5];
		array1[0]=5;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=6;
		
		System.out.println(array1[4]);
		
		System.out.println("-----------------------------");
		
		int array2[]= {1,2,3,4,5,6,7,8,9,9,0};
		
//		for(int i=0;i<array2.length-1;i++) {
//			System.out.print(array2[i]);
//		}
		
		for(int z:array2) {
			System.out.println(z);
		}
		System.out.println("-----------------------------");
		System.out.println(array2.getClass());

	}

}
