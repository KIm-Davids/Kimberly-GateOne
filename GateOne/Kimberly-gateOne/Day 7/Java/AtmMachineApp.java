import java.util.Scanner;
import java.util.ArrayList;
public class AtmMachineApp {
		static ArrayList<String> welcomPage = new ArrayList<String>();
		static ArrayList<String> userDetails = new ArrayList<String>();
		static ArrayList<String> pin = new ArrayList<String>();
		static ArrayList<String> deposit = new ArrayList<String>();

		static Scanner input = new Scanner(System.in);

			private static ArrayList<String> deposit(){

				System.out.print("Enter amount to deposit");
				String depositMoney = input.next();
	
				deposit.add(depositMoney);

				System.out.println();
				System.out.println();
			
				String pinNumber = 
	
				System.out.print("Please enter your pin");
				int pin = input.nextInt();

				return deposit;
			}


			private static int errorMessage(){

				System.out.print(" Press 1 to try again or 2 to quit");
				int errorInput = input.nextInt();			

				if(errorInput == 1){
					welcomeUserPage();
				}
					return errorInput;
				
			}	



			private static ArrayList<String> welcomeUserPage(){
				
				ArrayList<String> welcomeUserPage = new ArrayList<String>();

				System.out.print("WELCOME TO KIMBERLY MULTINATIONAL BANK");
	
					System.out.println();
					System.out.println();
		
				System.out.print("Lets get you started !");

					System.out.println();
					System.out.println();
	
				System.out.println("Please enter your First name");
				String firstName = input.next();
	
				userDetails.add(firstName);

				System.out.print("Please enter your Last name\n");
				String lastName = input.next();

				userDetails.add(lastName);

				System.out.println("Create a pin");
				String pinNumber = input.next();
				
				pin.add(pinNumber);	
				
		
				return welcomeUserPage;

			
			
			}


			public static ArrayList<String> mainMenu(){

				ArrayList<String> mainMenu = new ArrayList <String>();				

				System.out.println();
				System.out.println();
			
				System.out.print("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				
				System.out.println();
				System.out.println();	

				System.out.print("""

				1 -> Deposit
				
				2 -> Withdraw Money

				3 -> Account Balance
	
				4 -> Tranfer Money

				5 -> Change pin 
		
				6 -> Close Account

					""");
		
				int loginPage = input.nextInt();

				switch(loginPage){
							case 1: deposit();
								    break;
							case 2: 
							case 3:
							case 4:
							case 5:
							case 6:
							case 7: System.out.print("Thank you for your Patronage");
							default: errorMessage();
	

						

				}

					return mainMenu;

			}


	








	
		public static void main(String[] args){
		welcomeUserPage();
		mainMenu();
	
	}                                                                                                                      				
}