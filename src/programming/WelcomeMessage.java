package programming;

import java.util.Scanner;

//Design a program it should print "Welcome" to the user and programmer should ask to user shall i print once again "Welcome" or "Stop"
public class WelcomeMessage {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	char ch;
	do
	{
		System.out.println(".......welcome...........");
		System.out.println("Do you want me to print again ...?");
		System.out.println("Type y for yes , type n for no");
		ch=s.next().charAt(0);
	}
	while(ch=='y'||ch=='Y');
	System.out.println("Thank you");
}
}
