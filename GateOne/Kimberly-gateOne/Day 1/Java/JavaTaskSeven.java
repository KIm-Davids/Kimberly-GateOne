import java.util.Scanner;
	public class JavaTaskSeven {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int total = 0;
		int scores = 0;
		int counter = 0;
		int average = 0;
		int index = 0;

		for(counter = 1; counter <= 10; counter++) {
			System.out.print("Please enter a score" );
			scores = input.nextInt();	
			if(scores % 2 == 0) {
			total += scores;
			}
		}		
		average = total / scores;
		
		System.out.print("The average scores are: %d,%d ", average, scores);

		}
	}