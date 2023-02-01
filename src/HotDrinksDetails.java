import java.util.Scanner;

public class HotDrinksDetails {
	static int tea=3;
	static int coffee=4;
	
	public static void hotDrinkOptions() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("-                   1) Tea        - $ 3                  -");
			System.out.println("-                   2) Coffee     - $ 4                  -");
			System.out.println("-                   3) Back                              -");
			System.out.println("----------------------------------------------------------");
		System.out.println("Enter The Choice");
		Scanner sc1 = new Scanner(System.in);
		int choice=sc1.nextInt();
		switch(choice){
			case 1:
				System.out.println("Tea Selected !!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(tea);
				BillDetails.displayBillDetails();
				break;
			case 2:
				System.out.println("Coffee Selected !!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(coffee);
				BillDetails.displayBillDetails();
				break;
			case 3:
				System.out.println("Going Back to Main Menu!!");
				ResturantClient.resturantApp();
		default:
			System.out.println("******** Choose between 1 to 4 *******");}
		}
	}
}
