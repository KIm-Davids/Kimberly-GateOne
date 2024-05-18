const prompt = require('prompt-sync')();

		function closeAccount(){
			
			console.log("Are you sure you want to close your account ?");
			let userInput = input.next();

			console.log("\n");
			console.log("\n");

				if(userInput == "yes") {
					console.log("Thank You\nWe hope to see you again");
					console.log("\n");
					console.log("\n");
				}
				else{
					closeAccount();
				}
					createAccountPage();
					newUser();
			
				if(userInput == "no"){
					 mainMenu();
				}
				

			}
			
			
			function changePin(){

				let changeUserPin = myAccount.getPin();
				
				 pinVerification();

				console.log("Choose a PIN");
				let choosePin = input.nextlet();

					
				console.log("\n");
				console.log("\n");

				console.log("Confirm PIN");
				let confirmPin = input.nextlet();

					
				console.log("\n");
				console.log("\n");


				if(choosePin != confirmPin){
					console.log("PIN does not match\n\nPlease try again");
					changePin();
				}
				else{
					console.log("Done");
					myAccount.setPin(choosePin);
					mainMenu();
				}
		
			}
			
			function newUser(){
				
			console.log("Enter your name");
			let name = input.next();

			console.log("\n");
			console.log("\n");
		
			myAccount.setThirdUser(name);

			console.log("Enter your pin");
			let pin = input.nextlet();

			let verifyPin = myAccount.getPin();
			myAccount.setNewUserPin(pin);
		
				console.log("\n");
				console.log("\n");
			
				console.log("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				
				console.log("\n");
				console.log("\n");	

				mainMenu = prompt("""

				1 -> Deposit
				
				2 -> Withdraw Money

				3 -> Account Balance
	
				4 -> Transfer Money

				5 -> Change pin 
		
				6 -> Close Account

					""");
		
				switch(loginPage){
							case 1: deposit();
								    break;
							case 2: withdrawBalance();
								   break;
							case 3: newBalance();
								    break;
							case 4:  transferBalance();
								    break;
							case 5:  changePin();
								   break;
							case 6: closeAccount();
									break;
							case 7: console.log("Thank you for your Patronage\n");
								   break;
							default: mainMenu();
									break;
	
				}
				
				double newBalance = myAccount.getThirdBalance();	
				let newUserDetails = myAccount.getaccountNumber();
				let oldUserName = myAccount.getthirdUser();
				
				console.log("\n");
				console.log("\n");

				console.log("\n");
				console.log("\n");

					mainMenu();

				if(oldUserName == oldUserName && newUserDetails == newUserDetails ){
					console.log(`Your account ${newUserDetails}  has been credited by ${oldUserName} Amount: ${newBalance});
				}
				
			}

			function thirdAccount(){
				
				double newBalance = myAccount.getThirdBalance();	
				let newUserDetails = myAccount.getaccountNumber();
				let oldUserName = myAccount.getthirdUser();
							
				console.log("\n");
				console.log("\n");

				console.log("\n");
				console.log("\n");

					mainMenu();

				if(oldUserName == oldUserName && newUserDetails == newUserDetails ){
					console.logf(`Your account ${newUserDetails} has been credited by ${oldUserName} Amount: ${newBalance} `);

		
				}
			}
					

			function transferBalance(){

				transferAmount = prompt("How much would you like to transfer ?");
							
				if(transferAmount >  myAccount.getBalance()){
					console.log("Insufficient Funds\n");
					mainMenu();
					
				}

				transferName = prompt("Please enter the name of the user");

				transferAccountNumber = prompt("Please enter the account number of the user");

				myAccount.setUpdatedAmount(transferAmount);

				myAccount.setThirdUserBalance(transferAmount);
				myAccount.setnewUserAccountNumber(transferAccountNumber);

				console.log(`Your account has been Debited, Your remaining balance is: ${myAccount.getBalance()}`);

				performAnotherTrans = prompt("Would you like make another transfer<yes> or <no>\n\nOr click 'I' to transfer to another bank ?");
			
				if(performAnotherTrans == ("yes"){
					transferBalance();
				}
			
				if(performAnotherTrans == ("no"){
					mainMenu();
				}
				if(performAnotherTrans == "I"){
					transferBalance();
					myAccount.setThirdUser(transferName);
					myAccount.setThirdUserBalance(transferAmount);
				}
			}


			function withdrawBalance(){
				
				let userBalance = 0;
				let loadingBalance = 0;

				 pinVerification();

				console.log(`Your Balance is: ${myAccount.getBalance()}`);

				withdrawAmount = prompt("How much would you like to withdraw ?");
		
				double totalBalance = myAccount.getBalance();
				
				if(withdrawAmount > totalBalance){
					console.log("Insufficient Funds !");
					mainMenu();
				
				}
		
				if(withdrawAmount < totalBalance){
					console.log("Transaction Successful\n");
					myAccount.setWithdraw(withdrawAmount);
					mainMenu();
				
				}
				
				if(withdrawAmount < 0){
					console.log("Wrong Input\n");
					mainMenu();
				
				}
								
			
				console.log("\n");
				console.log("\n");

				performAnotherTrans = prompt("Would you like continue ?");
				
				if(performAnotherTrans==("yes")){
					withdrawBalance();
				}
			
				if(performAnotherTrans==("no")){
					mainMenu();
				}			
		}

			//Pin verification 

			
			function pinVerification(){
				pinNo = prompt("Please enter your pin");
			
				let pinNumber = myAccount.getPin();
			
				if(pinNo != pinNumber){
					console.log("\n");
					console.log("Wrong pin");
					console.log("\n");
					 pinVerification();
				}
				
			}

			function balance(){
				let userBalance = 0;
			
				console.logf("Name: %s%n",myAccount.getName());
			
				console.log("Account Number: 8366787112");			

				console.log("\n");	
				console.log("\n");	
	
				console.logf(`Account Balance: ${myAccount.getBalance()}`);
					
				console.log("\n");	
				console.log("\n");	

				console.log("Processing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				mainMenu();		
			}

			function newBalance(){

				let userBalance = 0;

				console.log(`Name: ${myAccount.getthirdUser()}`);

				console.log("Account Number: %s",myAccount.getthirdUserAccountNumber());			

				console.log("\n");	
				console.log("\n");	
	
				console.log("Account Balance: %n%.2f%n",myAccount.getThirdBalance());

				console.log("\n");	
				console.log("\n");	

				console.log("Processing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				mainMenu();		
			}


			function deposit(){

				let depositMoney = 0;

				depositMoneyInput = prompt("Enter amount to deposit");
			
				myAccount.setDeposit(depositMoneyInput);
				console.log(`Your initial deposit  is ${myAccount.getBalance()}`);	
				mainMenu();			
			}

			function mainMenu(){

				console.log("\n");
				console.log("\n");
			
				console.log("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				
				console.log("\n");
				console.log("\n");	

				loginPage = prompt("""

				1 -> Deposit
				
				2 -> Withdraw Money

				3 -> Account Balance
	
				4 -> Transfer Money

				5 -> Change pin 
		
				6 -> Close Account

					""");
		
			

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
							case 7: console.log("Thank you for your Patronage\n");
								   break;
							default: mainMenu();
									break;
				}
			}

		function createAccountPage(){
	
			console.log("WELCOME TO BANKE MULTINATIONAL BANK");
			console.log("\n");
			console.log("\n");
		

			login = prompt("""

			1 -> Create Account
			2 -> Login leto your account
			3 -> Login to another account

			""");
			

			switch(login){
						case 1: welcomeUserPage();
							   break;
						case 2: loginPage();
							    break;
						case 3: newUser();
							    break;
			}
		}	


		function loginPage(){
			console.log("Enter your name");
			let name = input.next();

			console.log("\n");
			console.log("\n");
		
			myAccount.setName(name);

			pin = prompt("Enter your pin");

			let verifyPin = myAccount.getPin();
			myAccount.setPin(pin);
			mainMenu();
		}

		function createPin(){
			
		pinNumber = prompt("Create a pin");
			
		myAccount.setPin(pinNumber);
			
		}



		function welcomeUserPage(){
		let depositMoneyInput  = 0;
		let endSystem = 0;

		console.log("WELCOME TO BANKE MULTINATIONAL BANK");
			console.log("\n");
			console.log("\n");
		console.log("Lets get you started !");
			console.log("\n");
			console.log("\n");
		userName = prompt("Please enter your full name    ");
		
			console.log("Welcome User: 8366787112");		
			console.log("\n");
			console.log("\n");

			 createPin();
	
			console.log("\n");
			console.log("\n");
			
				mainMenu();
			myAccount.setName(userName);
		}

	function main(let[] args){
		createAccountPage();
		mainMenu();
	}
}
