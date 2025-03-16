package page;

public class nextchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "selenium is automation tool";
		StringBuffer str1=new StringBuffer();
		char arr[]=str.toCharArray();
		//String st[]= str.charAt();
		for(int j=0; j<=arr.length-1; j++) {
		System.out.println(arr[j]);
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			char ch =arr[i];
			str1 = str1.append(++ch);
			
		}
		System.out.println(str1);

	}

}
