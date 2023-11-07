package programming;
//Tom wants to buy Tshirt ,Tshirt size should 's' and price should be lass than 0r equal to 1000
public class CheckPriceAndSizeOdTshirt {
public static void main(String[] args) {
	char size='m';
	double price=900;
	if(size=='s' && price<=1000)
	{
		System.out.println("Tom can buy Thirst");
	}
	else
	{
		System.out.println("Tom cann't buy Tshirt");
	}
	
}
}
