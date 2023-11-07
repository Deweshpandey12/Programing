package Numberprogramming;
//Sum of factorial digit is equal to original number
public class StrongNumber {
public static void main(String[] args) {
	int n=145 ,temp=n,sum=0;
	while(n>0)
	{
		int fact=1;
		int rem=n%10;
		for(int i=rem;i>0;i--)
		{
			fact=rem*i;
		}
		sum=sum+fact;
		System.out.println(rem+"-->"+sum);
		n=n/10;
	}
	
}
}
