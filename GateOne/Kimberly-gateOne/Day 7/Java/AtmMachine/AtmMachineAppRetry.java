import java.util.Scanner;
public class AtmMachineAppRetry {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		AtmMachine myAccount = new AtmMachine();
					
		System.out.print("WELCOME TO BANKE MULTINATIONAL BANK");
	
			System.out.println();
			System.out.println();
		
		System.out.print("Lets get you started !");

			System.out.println();
			System.out.println();
	
		System.out.println("Please enter your full name");
		String userName = input.nextLine();

			System.out.println();
			System.out.println();

		System.out.println("Create a pin");
		int pinNumber = input.nextInt();

		System.out.print("Welcome User: 8366787112");
	
			System.out.println();
			System.out.println();

		
		
								
		
		myAccount.setName(userName);
		System.out.println();

		myAccount.setPin(pinNumber);

		System.out.printf("Name in object myAccount is %n%s%n", myAccount.getName());
		System.out.printf("Your pin is %n%d%n", myAccount.getPin());
	
		
		
	}
}
