package programming;

public class PositiveOddNumber {
public static void main(String[] args) {
	System.out.println("using do while loop");
	int i=-10;
	do
	{
		if(i%2!=0 &&i>0)
		{
			System.out.println(i);
		}
		
		i++;	
	}
	while(i<=10);
	
	System.out.println("using while loop");
	int j=-10;
	while(j<=10)
	{
		if(j%2!=0 &&j>0)
		{
			System.out.println(j);
		}
		
		j++;
	}
	
	System.out.println("using for loop");
	int k=-10;
	for(k=-10;k<=10;k++)
	{
		if(k%2!=0 &&k>0)
		{
			System.out.println(k);
		}
	}
}


}
