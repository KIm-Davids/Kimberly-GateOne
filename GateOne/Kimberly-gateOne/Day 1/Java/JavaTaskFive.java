import java.util.Scanner;
	public class JavaTaskFive {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int total = 0;
		int scores = 0;
		int counter = 0;
		int average = 0;
		int index = 0;

		for(counter = 0; counter < 10; counter++) {
			System.out.print("Please enter a score" + counter);
			scores = input.nextInt();	
			if(scores % 2 == 0) {
			total += scores;
			}
		

		}		
	
		
		System.out.print("The average scores are: " + total);

		}
	}