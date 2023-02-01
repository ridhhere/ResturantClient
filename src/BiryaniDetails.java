import java.util.Scanner;

public class BiryaniDetails {
	
	static int muttonBiryani=15;
	static int chickenBiryani=13;
	static int vegBiryani=12;
	
	public static void biryaniOption() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("-                   1) Chicken Biryani      - $ 13       -");
			System.out.println("-                   2) Mutton Biryani       - $ 15       -");
			System.out.println("-                   3) Veg Biryani          - $ 12       -");
			System.out.println("-                   4) Back                              -");
			System.out.println("----------------------------------------------------------");
		System.out.println("Enter The Choice");
		Scanner sc1 = new Scanner(System.in);
		int choice=sc1.nextInt();
		switch(choice){
			case 1:
				System.out.println("Selected Chicken Biryani!!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(chickenBiryani);
				BillDetails.displayBillDetails();
				break;
			case 2:
				System.out.println("Selected Mutton Biryani!!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(muttonBiryani);
				BillDetails.displayBillDetails();
				break;
			case 3:
				System.out.println("Selected Veg Biryani!!");
				System.out.println("Select Number of Order : ");
				BillDetails.newOrder=sc1.nextInt();
				BillDetails.addItemToBill(vegBiryani);
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
