import java.util.Scanner;
	public class JavaTaskThree {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int total = 0;
		int scores = 0;
		int counter = 0;
		int average = 0;

		for(counter = 1; counter < 11; counter++) {
			System.out.print("Please enter a score");
			scores = input.nextInt();
				total = total + scores;
		}
		average = total / counter;

	
		
		System.out.print("The average scores are: " + average);
		System.out.printf("The sum and the average = %d, and %d",total , average);
		}
	}