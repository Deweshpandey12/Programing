package Numberprogramming;

public class Swaping_Two_value_without_Temp_Variable {
	public static void main(String[] args) {
		int a=10 ,b=20;
		System.out.println("before swaping ");
		System.out.println("a value : "+a+" ,  b value : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swaping ");
		System.out.println("a value : "+a+" ,  b value : "+b);


	}
}
