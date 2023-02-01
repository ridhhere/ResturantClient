import java.util.Scanner;

public class BillDetails {
	
	static int orderNumber;
	static int orderTotal;
	static int newTotal;
	static int newOrder;
	
	static void displayBillDetails() {
		System.out.println("New Total : $ "+orderTotal);
		System.out.println("No of Order : "+orderNumber);
	}
	
	static void payBill() {
		System.out.println("Total : $ "+orderTotal +" is now Paid !!!");
		System.exit(0);
	}
	
	static void addItemToBill(int Item) {
		BillDetails.orderNumber+=BillDetails.newOrder;
		BillDetails.newTotal=BillDetails.newOrder*Item;
		BillDetails.orderTotal+=BillDetails.newTotal;
	}
	
	static void billOptions() {
		while(true) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("-                   1) View Bill      	                 -");
			System.out.println("-                   2) Pay Bill                          -");
			System.out.println("-                   3) Back                              -");
			System.out.println("----------------------------------------------------------");
		System.out.println("Enter The Choice");
		Scanner sc1 = new Scanner(System.in);
		int choice=sc1.nextInt();
		switch(choice){
			case 1:
				System.out.println("View Bill!!");
				displayBillDetails();
				break;
			case 2:
				System.out.println("Pay Bill !!");
				payBill();
				break;
			case 3:
				System.out.println("Going Back to Main Menu!!");
				ResturantClient.resturantApp();
				break;
		default:
			System.out.println("******** Choose between 1 to 3 *******");}
		}
	}


}
