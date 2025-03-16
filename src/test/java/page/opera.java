package page;

public class opera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println("-------------------------------");
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------------------------------");
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------------------------------");
		
		
		

	}

}
