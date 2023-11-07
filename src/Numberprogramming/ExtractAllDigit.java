package Numberprogramming;

public class ExtractAllDigit {
public static void main(String[] args) {
	int n=54327;
	while(n>0)
	{
		int res=n%10;
		System.out.println("Extract digit :" +res);
		n=n/10;
		System.out.println("Remove digit : "+n);
	}
}
}
