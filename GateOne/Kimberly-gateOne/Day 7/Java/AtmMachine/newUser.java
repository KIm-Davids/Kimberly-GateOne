private class newUser {	

	private static void closeAccount(){
			
				System.out.print("Are you sure you want to close your account ?");
				String userInput = input.next();

				System.out.println();
				System.out.println();

				if(userInput.equalsIgnoreCase("yes")) {
					System.out.println("Thank You\nWe hope to see you again");
					System.out.println();
					System.out.println();

					createAccountPage();
				}

			

				if(userInput.equalsIgnoreCase("no")){
					 mainMenu();
				}
				

			}
			
			
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


			
			private static void newUser(){
				double newBalance = myAccount.gettransferAmount();	
				String newUserDetails = myAccount.getaccountNumber();

				if(newBalance > 0){
					System.out.printf("You account has been credited: %n%d%n", newBalance);
			
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
				String transferAccountNumber = input.next();
				myAccount.setsecondUser(transferAmount);
				myAccount.setnewUserAccountNumber(transferAccountNumber);

				System.out.printf("Your account has been Debited, Your remaining balance is: %n%.2f%n", myAccount.getBalance());

				System.out.println("Would you like make another transfer ?");
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
				

				System.out.printf("Name: %s%n",myAccount.getName());
				

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
							case 6: closeAccount();
									break;
							case 7: System.out.println("Thank you for your Patronage\n");
								   break;
							default: mainMenu();
									break;
	
				}
			}


		private static void createAccountPage(){
	
			System.out.print("WELCOME TO BANKE MULTINATIONAL BANK");
			System.out.println();
			System.out.println();
		

			System.out.print("""

			1 -> Create Account
			2 -> Login into your account

			""");
			int login = input.nextInt();

			switch(login){
						case 1: welcomeUserPage();
						case 2: loginPage();
			}


		}	


		private static void loginPage(){
			System.out.println("Enter your name");
			String name = input.next();

			System.out.println();
			System.out.println();
		
			myAccount.setName(name);

			System.out.println("Enter your pin");
			int pin = input.nextInt();

			int verifyPin = myAccount.getPin();
			myAccount.setPin(pin);
			mainMenu();
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
	
		System.out.print("Please enter your full name\n");
		String userName = input.next();

			System.out.println();
			System.out.println();

		System.out.println("Create a pin");
		int pinNumber = input.nextInt();

			System.out.println();
			System.out.println();

		System.out.print("Welcome User: 8366787112");
	
			System.out.println();
			System.out.println();
			
				mainMenu();

					
				myAccount.setName(userName);
				myAccount.setPin(pinNumber);

			System.out.println("name" + myAccount.getName());
			System.out.println("name" + pinNumber);	
		}

