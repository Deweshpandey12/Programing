package Numberprogramming;
//Given number is equal to reverse number
public class PalindromeNumber {
public static void main(String[] args) {
	int p=121,temp=123;
	int rev=0;
	while(p>0)
	{
		int rem=p%10;
		rev=rev*10+rem;
		p=p/10;
		
	}
	if(temp==rev)
	{
		System.out.println("Given number is palindrome number");
	}
	else
	{
		System.out.println("Given number is not palindrome number");
	}
}
}
