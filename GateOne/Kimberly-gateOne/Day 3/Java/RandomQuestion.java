import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
	public class RandomQuestion {
		public static void main(String[] args){
		

		Scanner input = new Scanner(System.in);
		
		int randomNumberOne = 0;
		int randomNumberTwo = 0;
		int randomNumberTwenty = 0;
		int randomNumberThirty =0;
		int randomNumberThree = 0;
		int randomNumberFour = 0;
		int randomNumberFive = 0;
		int randomNumberEleven = 0;
		int randomNumberSix = 0; 
		int randomNumberSeven =  0;
		int randomNumberEight = 0; 
		int randomNumberNine = 0;		
		int randomNumberTen = 0;


		randomNumberOne = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberTwo = ThreadLocalRandom.current().nextInt(1,100);	
		randomNumberThree = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberFour = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberFive = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberEleven = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberSix = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberSeven = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberEight = ThreadLocalRandom.current().nextInt(1,100);
		randomNumberNine = ThreadLocalRandom.current().nextInt(1,100);		
		randomNumberTen = ThreadLocalRandom.current().nextInt(1,100);	

		int correcNumbers = 0;
		int wrongNumbers = 0;
		

		System.out.println("Welcome to Math Trivia");
		System.out.println("Please try to answer all questions correctly");
		

		for(int counter = 0; counter <= 10; counter++){

			System.out.print("What is the maximum number between " + randomNumberSeven + " and "+ randomNumberTwo + "?");
			int question1 = input.nextInt();
			int question1Result = Math.max(randomNumberSeven,randomNumberTwo);

		if(question1 == question1Result){
			System.out.println("It is correct");
			correcNumbers++;
		}
		else{
			System.out.println("It is wrong");
			wrongNumbers++;
			}	

 
			System.out.print("Add the two numbers " + randomNumberThree + " and " + randomNumberSix);
			int question2 = input.nextInt();
			int question2result = randomNumberThree + randomNumberSix;
		
		if(question2 == question2result){
			System.out.println("It is correct");
			correcNumbers++;
		}
		else{
			System.out.println("It is wrong");
			wrongNumbers++;
			}	

		
			System.out.print("What is the minimum number between " + randomNumberFour + " and " + randomNumberOne);
			int question3 = input.nextInt();
			int question3result = Math.min(randomNumberFour, randomNumberEleven);
	
		if(question3 == question3result){
			System.out.println("It is correct");
			correcNumbers++;
		}
		else{
			System.out.println("It is wrong");
			wrongNumbers++;
			}	





			System.out.print("What is the square of " +randomNumberTen);
			int question4 = input.nextInt();
			int question4result = (randomNumberTen * randomNumberTen);


		if(question4 == question4result){
			System.out.println("It is correct");
			correcNumbers++;
		}
		else{
			System.out.println("It is wrong");
			wrongNumbers++;
			}	


		
			System.out.print("What is the cube of " + randomNumberEight);
			int question5 = input.nextInt();
			int question5result = (randomNumberEight * randomNumberEight *randomNumberEight);

		if(question5 == question5result){
			System.out.println("It is correct");
			correcNumbers++;
		}
		else{
			System.out.println("It is wrong");
			wrongNumbers++;
			}	





			System.out.println("Your corret score are " + correcNumbers);
			System.out.println("Your incorrect score are " + wrongNumbers);
		
			System.out.println(" ");

			System.out.println("You have a another chance\nLet's play again");




		}



		
	

		
		


				

	

		}


		


}