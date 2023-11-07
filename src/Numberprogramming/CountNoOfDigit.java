package Numberprogramming;

public class CountNoOfDigit {
	public static void main(String[] args) {
		int count=0,j=987654;
		while(j>0)
		{
			j=j/10;
			count++;
		}
		System.out.println(count);
	}
}
