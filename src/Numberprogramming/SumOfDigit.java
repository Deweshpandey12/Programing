package Numberprogramming;

public class SumOfDigit {
public static void main(String[] args) {
	int sum=0,i=7656536;
	while(i>0)
	{
	int rem=i%10;
	sum=sum+rem;
	i=i/10;
	}
	System.out.println(sum);
}
}
