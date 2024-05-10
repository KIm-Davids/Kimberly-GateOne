	let correctNumbers = 0;
		let wrongNumbers = 0;
		

		console.log("Welcome to Math Trivia");
		console.log("Please try to answer all questions correctly");
		

		for(let counter = 0; counter <= 10; counter++){

			prompt("What is the maximum number between " + randomNumberSeven + " and "+ randomNumberTwo + "?");
			let question1 = input.next();
			let question1Result = Math.max(randomNumberSeven,randomNumberTwo);

			if(question1 == question1Result){
				prompt("It is correct");
				correcNumbers++;
			}
			else{
				console.log
				wrongNumbers++;
			}	

 
			console.log("Add the two numbers " + randomNumberThree + " and " + randomNumberSix);
			let question2 = input.next();
			let question2result = randomNumberThree + randomNumberSix;
		
		if(question2 == question2result){
			prompt("It is correct");
			correcNumbers++;
		}
		else{
			console.log
			wrongNumbers++;
			}	

		
			console.log("What is the minimum number between " + randomNumberFour + " and " + randomNumberOne);
			let question3 = input.next();
			let question3result = Math.min(randomNumberFour, randomNumberEleven);
	
			if(question3 == question3result){
				prompt("It is correct");
				correcNumbers++;
			}
			else{
			console.log
			wrongNumbers++;
			}	

			prompt("What is the square of " +randomNumberTen);
			let question4 = input.next();
			let question4result = (randomNumberTen * randomNumberTen);


			if(question4 == question4result){
				prompt("It is correct");
				correcNumbers++;
			}
			else{
			console.log
			wrongNumbers++;
			}	


		
			prompt("What is the cube of " + randomNumberEight);
			let question5 = input.next();
			let question5result = (randomNumberEight * randomNumberEight *randomNumberEight);

			if(question5 == question5result){
				console.log("It is correct");
				correcNumbers++;
			}
			else{
			console.log
			wrongNumbers++;
			}	





			prompt("Your corret score are " + correcNumbers);
			prompt("Your incorrect score are " + wrongNumbers);
		
			prompt(" ");

			prompt("You have a another chance\nLet's play again");



