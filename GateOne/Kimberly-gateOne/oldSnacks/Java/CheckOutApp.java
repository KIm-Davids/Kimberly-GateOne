import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class SemicolonStoreCopy1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is the customer's Name ?");
	  	String customerName = input.next();

		Date date = new Date();
		
		

		int counter = 0;
		
		String addingMoreItems = null;
		String userBuy = null;
		double howManyPieces = 0;
		double howManyUnit = 0;
		double total = 1;
		double sum = 0;
		double discountMinused = 0;
		

		ArrayList<String> items = new ArrayList<String>();
		ArrayList<Double> pieces = new ArrayList<Double>();
		ArrayList<Double> unit = new ArrayList<Double>();

		ArrayList<Double> totals = new ArrayList<Double>();

	

		

		

		do
		{
		System.out.println("What did the user buy ?");
		userBuy = input.next();
		
		System.out.println("How many pieces? ");
		howManyPieces = input.nextInt();
              		
		System.out.println("How much per unit? ");
		howManyUnit = input.nextInt();

		total = howManyPieces * howManyUnit;

		items.add(userBuy);
		pieces.add(howManyPieces);
		unit.add(howManyUnit);
		totals.add(total);
		

		System.out.println("Add more items? ");
		addingMoreItems = input.next();

		if(addingMoreItems.equalsIgnoreCase("no")) {
				break;
			}

		} while(addingMoreItems.equalsIgnoreCase("yes"));


		System.out.println("What is your name? (Cashier name)");
		String cashierName = input.next();
			
		System.out.println("How much discount will he get? ");
		double discount = input.nextDouble();

		

		//first reciept
	
		
		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println(date);
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);					System.out.println("================================================");
		System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");		System.out.println("-------------------------------------------------");
		for(counter = 0; counter<items.size(); counter++){
			sum += totals.get(counter);
			 System.out.println(items.get(counter) + "\t"+ pieces.get(counter) + "\t" + unit.get(counter)+ "\t\t" + totals.get(counter));
			}
		System.out.print("----------------------------------------------------");
		System.out.println();
		System.out.println("\t\tsub total is: \t" + sum);

		double discountPercentage = discount / 100 * (sum);
		double discountResult = discountPercentage; 

		double vatTax = sum * (7.5 / 100);

		System.out.print("\t\tDiscount: \t" + discountResult);
		System.out.printf("\n\t\tVAT @ 7.50:\t%.1f%n", vatTax);
		System.out.println("================================================");
	
		double billTotal = (sum - discountResult) + vatTax;
		System.out.println("\t\tBill Total:\t" + billTotal);

		System.out.println("================================================");
		System.out.println("THIS IS NOT AN RECIEPT KINDLY PAY " + billTotal);
		System.out.println("================================================");


		System.out.println();


		System.out.println("How much did the customer give to you ?");
		int customerPayment = input.nextInt();





		
		//Second reciept

		System.out.println();

		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("Date: " + date);
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);					System.out.println("================================================");
		System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");		System.out.println("-------------------------------------------------");
		for(counter = 0; counter<items.size(); counter++){
			
			 System.out.println(items.get(counter) + "\t"+ pieces.get(counter) + "\t" + unit.get(counter)+ "\t\t" + totals.get(counter));
			}
		
		System.out.print("----------------------------------------------------");
		System.out.println();
		System.out.println("\t\tsub total is: \t" + sum);

		System.out.print("\t\tDiscount: \t" + discountResult);
		System.out.printf("\n\t\tVAT @ 17.50:\t%.2f%n", vatTax);
		System.out.println("================================================");
	
		billTotal = (sum - discountResult) + vatTax;

		System.out.println("\t\tBill Total:\t" + billTotal);
	
		System.out.println("\t\tAmount Paid:\t" + customerPayment);
		double balance = customerPayment - billTotal;
		System.out.print("\t\tBalance:\t" + balance);

		System.out.println("\n================================================");
		System.out.println("\tTHANK YOU FOR YOUR PATRONAGE");
		System.out.println("================================================");






	}
}









		