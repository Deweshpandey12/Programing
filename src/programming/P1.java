package programming;

import java.util.Scanner;

//WAJP check persion is eligible for blood donate or not
public class P1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter persion weight");
		int weight = s.nextInt();
		System.out.println("Enter persion blood group");
		String bloodgrop = s.next();
		if(weight>=50)
		{
			if(bloodgrop=="o")
			{
				System.out.println("Persion is eligible");
			}
			else
			{
				System.out.println("Blood group is not matching");
			}
		}
		else
		{
			System.out.println("persion is not eligible");
		}
	}
}
