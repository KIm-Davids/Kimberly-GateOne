import java.util.Scanner;
	public class JavaTaskFour {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int total = 0;
		int scores = 0;
		int counter = 0;
		int average = 0;
		int index = 0;

		for(counter = 0; counter < 10; counter++) {
			System.out.print("Please enter a score" );
			scores = input.nextInt();	
		}
			for(index = 0; index < 10; index+=2){
			total += scores;
			
		}
		
		System.out.printf("The sum and the average = "+ total);
		}
	}