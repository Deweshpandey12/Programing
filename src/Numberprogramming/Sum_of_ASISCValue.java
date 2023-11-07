package Numberprogramming;
//WAJP to print sum of ascii value
public class Sum_of_ASISCValue {
public static void main(String[] args) {
	char ascii_Start='A';
	char ascii_Last='Z';
	int sum=0;
	int a=(int)ascii_Start;
	int b=(int)ascii_Last;
	for(int i=a;i<=b;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}
