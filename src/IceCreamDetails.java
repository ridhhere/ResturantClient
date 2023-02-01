import java.util.Scanner;

public class IceCreamDetails {
	static int vanilla=5;
	static int butterScotch=6;
	static int choclate=7;

	
	
	public static void iceCreamOptions() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("-                   1) Vanilla        - $ 5              -");
			System.out.println("-                   2) Butter Scotch  - $ 6              -");
			System.out.println("-                   3) Choclate       - $ 7              -");
			System.out.println("-                   4) Back                              -");
			System.out.println("----------------------------------------------------------");
		System.out.println("Enter The Choice");
		Scanner sc1 = new Scanner(System.in);
		int choice=sc1.nextInt();
		switch(choice){
			case 1:
				System.out.println("Selected Vanilla Icecream!!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(vanilla);
				BillDetails.displayBillDetails();
				break;
			case 2:
				System.out.println("Selected Butter Scotch Icecream!!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(butterScotch);
				BillDetails.displayBillDetails();
				break;
			case 3:
				System.out.println("Selected Choclate Icecream!!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(choclate);
				BillDetails.displayBillDetails();
				break;
			case 4:
				System.out.println("Going Back to Main Menu!!");
				ResturantClient.resturantApp();
		default:
			System.out.println("******** Choose between 1 to 4 *******");}
		}
	}
}
