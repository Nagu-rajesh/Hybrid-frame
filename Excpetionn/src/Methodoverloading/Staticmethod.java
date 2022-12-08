package Methodoverloading;

public class Staticmethod {
	public static void Sum(int a, String b) 
	{
	System.out.println(a+" "+b);	
	}

	public static void Sum(int a)
	{
	System.out.println(a);	
	}
	
	public static void Sum(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
	Sum(10, "Hi");
	Sum(15);
	Sum("NAgu");
	

	}

}
