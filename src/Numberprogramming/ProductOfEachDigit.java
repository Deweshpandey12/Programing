package Numberprogramming;

public class ProductOfEachDigit {
public static void main(String[] args) {
	int prod=1,n=9876543;
	while(n>0)
	{
		int rem=n%10;
		prod=prod*rem;
		n=n/10;
	}
	System.out.println("prod of each digit : "+prod);
}
}
