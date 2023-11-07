package Numberprogramming;

public class FactorialNumber {
public static void main(String[] args) {
	int fact=1,i=5;
	while(i>0)
	{
		fact=fact*i--;
	}
	System.out.println("Factorial of given number : "+fact);
}
}
