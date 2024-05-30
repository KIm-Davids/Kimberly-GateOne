const bank = require ('./BankVscodeVersion')

const prompt = require('prompt-sync')();

function createAccount(){
    name = prompt("Please enter your full name: ")

    let randomNumber = Math.random(1,9999999999)
    let accontNumber = Math.floor(randomNumber * 10000000000)
    console.log(accontNumber)

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
        default: console.log("Wrong input\n\nPlease try again")

    }
}
welcomePage();

