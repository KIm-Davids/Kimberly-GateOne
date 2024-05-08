import java.util.Scanner;
	public class JavaTaskEight {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int total = 0;
		int scores = 0;
		int counter = 0;
		int average = 0;
		int index = 0;

		for(counter = 1; counter <= 100; counter++) {
			System.out.print("Please enter a score" );
			scores = input.nextInt();	
		}		
		
		
		System.out.print("The average scores are: %d, ", scores);

		}
	}