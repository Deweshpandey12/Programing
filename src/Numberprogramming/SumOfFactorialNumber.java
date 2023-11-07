package Numberprogramming;

public class SumOfFactorialNumber {
public static void main(String[] args) {
	int n=534,sum=0;
	while(n>0)
	{
		int rem=n%10,fact=1;
		for(int i=rem;i>0;i--)
		{
			rem=fact*i;
		}
		sum=sum+fact;
		System.out.println(rem+"-->"+sum);
		n=n/10;
	}
	System.out.println(sum);
	
}
}
