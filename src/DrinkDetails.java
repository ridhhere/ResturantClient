import java.util.Scanner;

public class DrinkDetails {
	static int hotDrinks;
	static int softDrinks;

	
	
	public static void drinksOptions() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("-                   1) Hot Drinks                        -");
			System.out.println("-                   2) Soft Drinks                       -");
			System.out.println("-                   3) Back                              -");
			System.out.println("----------------------------------------------------------");
		System.out.println("Enter The Choice");
		Scanner sc1 = new Scanner(System.in);
		int choice=sc1.nextInt();
		switch(choice){
			case 1:
				System.out.println("Hot Drinks Selected !!");
				HotDrinksDetails.hotDrinkOptions();
				break;
			case 2:
				System.out.println("Soft Drink Selected !!");
				SoftDrinksDetails.iceCreamOptions();
				break;
			case 3:
				System.out.println("Going Back to Main Menu!!");
				ResturantClient.resturantApp();
		default:
			System.out.println("******** Choose between 1 to 4 *******");}
		}
	}

}
