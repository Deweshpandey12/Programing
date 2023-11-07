package Numberprogramming;

public class Sum_Of_EvenNumber {
public static void main(String[] args) {
	int sum=0;
	for(int i=0;i<=10;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
	}
	System.out.println("Sum of Even no : " +sum);
}
}
