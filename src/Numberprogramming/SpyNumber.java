package Numberprogramming;

import java.util.Scanner;

//Sum of digit if equal to prod of digit than it is spy number
public class SpyNumber {
public static void main(String[] args) {
	System.out.println("Enter number to check given is spy or not");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
int sum=0,prod=1;
while(n>0)
{
	int rem=n%10;
	prod*=rem;
	sum+=rem;
	n/=10;
}
if(sum==prod)
{
	System.out.println("The given number is spy number");
}
else
{
	System.out.println("The given number is not spy number");
}
}
}
