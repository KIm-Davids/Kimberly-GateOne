import java.util.Scanner;
public class AtmMachineAppRetry {
		static Scanner input = new Scanner(System.in);
		static AtmMachine myAccount = new AtmMachine();
	
			
			private static void changePin(){

				int changeUserPin = myAccount.getPin();
				
				 pinVerification();

				System.out.println("Choose a PIN");
				int choosePin = input.nextInt();

					
				System.out.println();
				System.out.println();



				System.out.println("Confirm PIN");
				int confirmPin = input.nextInt();

					
				System.out.println();
				System.out.println();


				if(choosePin != confirmPin){
					System.out.println("PIN does not match\n\nPlease try again");
					changePin();
				}
				else{
					System.out.println("Done");
					myAccount.setPin(choosePin);
					mainMenu();
				}
		
			}






			private static void transferBalance(){

				System.out.println("How much would you like to transfer ?");
				int transferAmount = input.nextInt();
				
				if(transferAmount >  myAccount.getBalance()){
					System.out.println("Insufficient Funds\n");
					mainMenu();
				
				}

				System.out.print("Please enter the Account Number");
				int transferAccountNumber = input.nextInt();
				myAccount.setsecondUser(transferAmount);

				System.out.printf("Your account has been Debited %n%.2f%n", myAccount.getBalance());

				System.out.println("Would you like continue ?");
				String performAnotherTrans = input.next();	

				if(performAnotherTrans.equalsIgnoreCase("yes")){
					transferBalance();
				}
			
				if(performAnotherTrans.equalsIgnoreCase("no")){
					mainMenu();
				}

				

			}


			private static void withdrawBalance(){
				
				int userBalance = 0;
				int loadingBalance = 0;

				 pinVerification();

				System.out.printf("Your Balance is: %n%.2f%n", myAccount.getBalance());

				System.out.println("How much would you like to withdraw ?");
				double withdrawAmount = input.nextDouble();	
			
				

				double totalBalance = myAccount.getBalance();
				
				if(withdrawAmount > totalBalance){
					System.out.print("Insufficient Funds !");
					mainMenu();
				
				}
		
				if(withdrawAmount < totalBalance){
					System.out.println("Transaction Successful\n");
					myAccount.setWithdraw(withdrawAmount);
					mainMenu();
				
				}

				

				
				if(withdrawAmount < 0){
					System.out.println("Wrong Input\n");
					mainMenu();
				
				}
								
			
				System.out.println();
				System.out.println();

				System.out.println("Would you like continue ?");
				String performAnotherTrans = input.next();	

				if(performAnotherTrans.equalsIgnoreCase("yes")){
					withdrawBalance();
				}
			
				if(performAnotherTrans.equalsIgnoreCase("no")){
					mainMenu();
				}
			
				
				
				

		}





			//Pin verification 

			
			private static void pinVerification(){
				System.out.println("Please enter your pin");
				int pinNo = input.nextInt();

				int pinNumber = myAccount.getPin();
			
				if(pinNo != pinNumber){
					System.out.println();
					System.out.println("Wrong pin");
					System.out.println();
					 pinVerification();
				}
				
			}




			private static void balance(){
						

				int userBalance = 0;
				

				System.out.printf("Name: %s",myAccount.getName());
				

				System.out.print("Account Number: 8366787112");			

				System.out.println();	
				System.out.println();	
	
				System.out.printf("Account Balance: %n%.2f%n",myAccount.getBalance());
			
						
			
			
				System.out.println();	
				System.out.println();	

				System.out.print("Processing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				mainMenu();		
			}







		private static void deposit(){

				int depositMoney = 0;

				System.out.println("Enter amount to deposit");
				int depositMoneyInput = input.nextInt();
			
				myAccount.setDeposit(depositMoneyInput);
				System.out.printf("Your initial deposit  is %n%.2f%n", myAccount.getBalance());	
				mainMenu();			
			}




		public static void mainMenu(){

					

				System.out.println();
				System.out.println();
			
				System.out.print("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				
				System.out.println();
				System.out.println();	

				System.out.print("""

				1 -> Deposit
				
				2 -> Withdraw Money

				3 -> Account Balance
	
				4 -> Transfer Money

				5 -> Change pin 
		
				6 -> Close Account

					""");
		
				int loginPage = input.nextInt();

				switch(loginPage){
							case 1: deposit();
								    break;
							case 2: withdrawBalance();
								   break;
							case 3: balance();
								    break;
							case 4:  transferBalance();
								    break;
							case 5:  changePin();
								   break;
			//				case 6:
			//				case 7: System.out.println("Thank you for your Patronage\n");
			//					   break;
			//				default: errorMessage();
	//

				}
			}




		private static void welcomeUserPage(){
		
		

		int depositMoneyInput  = 0;
		int endSystem = 0;

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

			System.out.println();
			System.out.println();

		System.out.print("Welcome User: 8366787112");
	
			System.out.println();
			System.out.println();
			

					
				myAccount.setName(userName);
				myAccount.setPin(pinNumber);

			System.out.println("name" + myAccount.getName());
			System.out.println("name" + pinNumber);	
		}




	public static void main(String[] args){
		

		welcomeUserPage();
		mainMenu();
								
	
	
		
	}
}
