import java.util.Scanner;

public class ResturantClient {

	static void resturantApp() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("-                   1) Biryani                           -");
			System.out.println("-                   2) Icecream                          -");
			System.out.println("-                   3) Drinks                            -");
			System.out.println("-                   4) Bill                              -");
			System.out.println("-                   5) Exit                              -");
			System.out.println("----------------------------------------------------------");
		System.out.println("Enter The Choice");
		Scanner sc1 = new Scanner(System.in);
		int choice=sc1.nextInt();
		switch(choice){
			case 1:
				System.out.println("Selected Biryani Menu!!");
				BiryaniDetails.biryaniOption();
				break;
			case 2:
				System.out.println("Selected Icecream Menu!!");
				IceCreamDetails.iceCreamOptions();
				break;
			case 3:
				System.out.println("Selected Drinks Menu!!");
				DrinkDetails.drinksOptions();
				break;
			case 4:
				System.out.println("Selected Bill!!");
				BillDetails.billOptions();
				break;
			case 5:
				System.out.println("Thx for Using App!");
				System.exit(0);
				break;
		default:
			System.out.println("******** Choose between 1 to 4 *******");
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resturantApp();
	}

}
