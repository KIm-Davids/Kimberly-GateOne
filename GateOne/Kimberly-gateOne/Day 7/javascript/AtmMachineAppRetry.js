const Bank = require('./BankVscodeVersion')

const prompt = require('prompt-sync')();

const myBank = new Bank();


function CloseAccount(){
    continuePrompt = prompt("Please are you sure you want to close your account <yes> or <no ?  ")
    if(continuePrompt == "yes"){
        process.exit();
    }
    if(continuePrompt == "no"){
        mainMenu();
    }
}

function changePin(){
    pinVerification()

    let changeThePin = prompt("Create a new pin")

    confirmPin = prompt("Confirm pin")
    
    if(changeThePin == confirmPin){
        console.log("\n")
        console.log("Pin Change Successful")
        myBank.setPin(confirmPin)
        mainMenu()
    }
    if(confirmPin != changeThePin){
        console.log("\n")
        console.log("Pin does not match")
        console.log("Please try again")
        changePin()
    }
   
}


function transfer(){
    pinVerification()
    userTransferAccountNumber = prompt("Enter the account number you'd like to transfer to")

    if(userTransferAccountNumber.length != 10){
        console.log("Invalid Account Number !")
        transfer()
    }
    
    transferAmount = prompt("How much would you like to transfer: ")
    if(transferAmount > myBank.getBalance()){
        console.log("Insufficient Funds")
        mainMenu()
    }
    if(transferAmount <= -1){
        console.log("Wrong Input")
        transfer()
    }

    myBank.setTransfer(transferAmount)
    console.log(`Your transfer amount of ${transferAmount} to ${userTransferAccountNumber} is successful`)
    continuePrompt = prompt("Would you like to perfrom another transaction <yes> or <no> ?  ")
    if(continuePrompt == "yes"){
        transfer()
    }
    if(continuePrompt == "no"){
    mainMenu()
    }
}


function balance(){
    console.log(`Customer Name: ${myBank.getName()}`)
    console.log("\n")
    console.log(`Customer Account Number: ${myBank.getAccountNumber()}`)
    console.log("\n")
    console.log(`Customer Balance: ${myBank.getBalance()}`)
    mainMenu()
}


function pinVerification(){
    pin = prompt("Enter your pin")

    if(myBank.getPin() != pin){
        console.log("\n")
        console.log("Wrong pin number")
        console.log("\n")
        console.log("Please try again")
        console.log("\n")
        pinVerification()
    }
}



function withdraw(){
    pinVerification()

    withdrawAmountStr = prompt("How much would you like to withdraw: ")
    let removeComma = withdrawAmountStr.replace(",","")
    WithdrawAmount = parseInt(removeComma)

    if(WithdrawAmount > myBank.getBalance()){
        console.log("Insufficient Funds !")
        mainMenu()
    }

    if(WithdrawAmount < 0){
        console.log("Wrong input, please try again")
        mainMenu()
    }
    myBank.setWithdraw(WithdrawAmount)
    console.log(`Your Balance Amount: ${myBank.getBalance()}`)
    console.log("\n")
    continuePrompt = prompt("Would you like to perform another transaction ? <yes> or <no>  ")
    
    if(continuePrompt == "yes"){
        withdraw()
    }
    if(continuePrompt == "no"){
        mainMenu()
    }

}


function deposit(){
   depositAmountStr =  prompt("How much would you like to deposit ?")
   let removeComma = depositAmountStr.replace(",","")
   depositAmount = parseInt(removeComma)


   myBank.setDeposit(depositAmount)
   console.log("Your deposit is successful")
   console.log("\n")
   console.log(`Your initial deposit is ${depositAmount}`)
   mainMenu()
}


function mainMenu(){
    console.log(`
    
    Please Select An Option:

    1 -> Deposit

    2 -> Withdraw

    3 -> Check Balance

    4 -> Transfer

    5 -> Change Pin

    6 -> Close Account

    `)

    mainMenuOption = prompt("")
    switch(mainMenuOption){
        case '1': deposit()
                   break;
        case '2': withdraw()
                    break;
        case '3': balance()
                    break;
        case '4': transfer()
                    break;
        case '5': changePin()
                    break;
        case '6': CloseAccount()
                    break;
        default: console.log("Wrong Input, Please try again")
    }

}



function loginPage(){
    userName = prompt("Please enter your name")
    accountNumber = prompt("Please enter your account number")
    pinNumber = prompt("Enter your pin")

    myBank.setName(userName)
    myBank.setAccountNumber(accountNumber)
    myBank.setPin(pinNumber)
    mainMenu()
}


function createAccount(){
    UserName = prompt("Please enter your full name: ")

    let randomNumber = Math.random(1,99999999999)
    let accountNumber = Math.floor(randomNumber * 11111111111)
    console.log("\n")
    console.log(`Welcome ${UserName} Your new account number is ${accountNumber}`)
    console.log("\n")
    pinNumber = prompt("Create a pin: ")

    myBank.setName(UserName)
    myBank.setAccountNumber(accountNumber)
    myBank.setPin(pinNumber)
    mainMenu()

}


function welcomePage(){

    console.log("WELCOME TO BANKE INTERNATIONAL BANK")

    console.log(`
    
    Please Select An Option:

    1 -> Create Account
    2 -> Login to your account

    `);

    welcomePageOPtions = prompt("")

    switch(welcomePageOPtions){
        case '1': 
		        createAccount();
	        	break;
        case '2':
                loginPage();
                break;
        default: console.log("Wrong input\n\nPlease try again")
                 welcomePage()
    }
}
welcomePage();

