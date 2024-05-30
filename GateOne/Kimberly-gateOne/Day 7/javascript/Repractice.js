const prompt = require('prompt-sync')();
let inputNumber = prompt("Enter a number to check")

negativeNumbers = 0;
zero = 0
positiveNumbers = 0

for(counter = 0; counter < inputNumber; counter++){
	numbersToCheck = prompt("Enter number: ");

	if(numbersToCheck < 0){
		negativeNumbers++;
	}
	
	if(numbersToCheck == 0){
		zero++;
	}

	if(numbersToCheck > 0){
		positiveNumbers++;
	}
}

console.log(`The negative numbers are: ${negativeNumbers}\n The positive numbers are: ${positiveNumbers}\n The zeros are: ${zero}`)