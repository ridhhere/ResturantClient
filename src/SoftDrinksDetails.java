import java.util.Scanner;

public class SoftDrinksDetails {
	static int coke=2;
	static int fanta=2;
	
	public static void iceCreamOptions() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("-                   1) Coke        - $ 2                 -");
			System.out.println("-                   2) Fanta       - $ 2                 -");
			System.out.println("-                   3) Back                              -");
			System.out.println("----------------------------------------------------------");
		System.out.println("Enter The Choice");
		Scanner sc1 = new Scanner(System.in);
		int choice=sc1.nextInt();
		switch(choice){
		case 1:
			System.out.println("Coke Selected !!");
			System.out.println("Select Number of Order : ");
			BillDetails.newOrder=sc1.nextInt();
			BillDetails.addItemToBill(coke);
			BillDetails.displayBillDetails();
			break;
		case 2:
			System.out.println("Fanta Selected !!");
			System.out.println("Select Number of Order : ");
			BillDetails.newOrder=sc1.nextInt();
			BillDetails.addItemToBill(fanta);
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
