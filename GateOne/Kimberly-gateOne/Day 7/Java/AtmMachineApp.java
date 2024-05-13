import java.util.*;
public class AtmMachineApp {
		static ArrayList<String> welcomeUserPage = new ArrayList<String>();
		static ArrayList<String> userDetails = new ArrayList<String>();
		static ArrayList<String> pin = new ArrayList<String>();
		static ArrayList<Integer> deposit = new ArrayList<Integer>();

		static Scanner input = new Scanner(System.in);


			private static ArrayList <String> balance(){
			ArrayList <String> end = new ArrayList<String>();

			ListIterator<String> name = welcomeUserPage.listIterator();
			ListIterator<Integer> amountDeposited = deposit.listIterator();

			System.out.print("Name:");
			while(name.hasNext()){
				System.out.print(" " + name.next());
			}

			System.out.println();	
			
			System.out.print("Deposit Amount: ");
			while(amountDeposited.hasNext()){
				System.out.println(" " +amountDeposited.next());
			}

			System.out.print("Processing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
								
				return end;
			}



			private static ArrayList<Integer> deposit(){

				int depositMoney = 0;

				System.out.println("Enter amount to deposit");
				int depositMoneyInput = input.nextInt();
					
				deposit.add(depositMoney);
				deposit.add(depositMoneyInput);
				
				System.out.println();
				System.out.println();
			
			
				System.out.println("Please enter your pin");
				String pinNo = input.next();

				String pinNumber = pin.get(0);
			
				if(!pinNo.equals(pinNumber)){
					System.out.println();
					System.out.println("Wrong pin");
					System.out.println();
					 deposit();
				}
					
				mainMenu();					

				return deposit;
			}


			private static int errorMessage(){

				System.out.print(" Press 1 to try again or any number to quit");
				int errorInput = input.nextInt();			

				if(errorInput == 1){
					welcomeUserPage();
				}
					return errorInput;
				
			}	



			private static ArrayList<String> welcomeUserPage(){
				
				ArrayList<String> welcomeUser = new ArrayList<String>();

				System.out.print("WELCOME TO BANKE MULTINATIONAL BANK");
	
					System.out.println();
					System.out.println();
		
				System.out.print("Lets get you started !");

					System.out.println();
					System.out.println();
	
				System.out.println("Please enter your First name");
				String firstName = input.next();
	
				welcomeUserPage.add(firstName);

				System.out.print("Please enter your Last name\n");
				String lastName = input.next();

				welcomeUserPage.add(lastName);

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
							case 3: balance();
								    break;
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

		//System.out.print(pin);
	
	}                                                                                                                      				
}