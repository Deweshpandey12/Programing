package Numberprogramming;

public class LargestAmongThreenousingTernaryOperator {
public static void main(String[] args) {
	int a=10,b=20,c=30;
	
	String res = a>b&&a>c?"a is largest":(b>c)?"b is largest ":"c is largest";
	System.out.println(res);
}
}
