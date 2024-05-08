const prompt = require('prompt-sync')();


		let randomNumberOne = 0;
		let randomNumberTwo = 0;
		let randomNumberTwenty = 0;
		let randomNumberThirty =0;
		let randomNumberThree = 0;
		let randomNumberFour = 0;
		let randomNumberFive = 0;
		let randomNumberEleven = 0;
		let randomNumberSix = 0; 
		let randomNumberSeven =  0;
		let randomNumberEight = 0; 
		let randomNumberNine = 0;		
		let randomNumberTen = 0;


		randomNumberOne = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberTwo = ThreadLocalRandom.current().nextlet(1,100);	
		randomNumberThree = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberFour = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberFive = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberEleven = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberSix = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberSeven = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberEight = ThreadLocalRandom.current().nextlet(1,100);
		randomNumberNine = ThreadLocalRandom.current().nextlet(1,100);		
		randomNumberTen = ThreadLocalRandom.current().nextlet(1,100);	

		let correcNumbers = 0;
		let wrongNumbers = 0;
		

		console.log("Welcome to Math Trivia");
		console.log("Please try to answer all questions correctly");
		

		for(let counter = 0; counter <= 10; counter++){

			console.log("What is the maximum number between " + randomNumberSeven + " and "+ randomNumberTwo + "?");
			let question1 = input.nextlet();
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
			let question2 = input.nextlet();
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
			let question3 = input.nextlet();
			let question3result = Math.min(randomNumberFour, randomNumberEleven);
	
			if(question3 == question3result){
				prompt("It is correct");
				correcNumbers++;
			}
			else{
			console.log
			wrongNumbers++;
			}	

			const input = prompt("What is the square of " +randomNumberTen);
			let question4 = input.nextlet();
			let question4result = (randomNumberTen * randomNumberTen);


			if(question4 == question4result){
				prompt("It is correct");
				correcNumbers++;
			}
			else{
			console.log
			wrongNumbers++;
			}	


		
			const input = prompt("What is the cube of " + randomNumberEight);
			let question5 = input.nextlet();
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




		}



		
	

		
		


		