import java.util.Scanner;
	public class JavaTaskOne {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int total = 0;
		int scores = 0;

		for(int counter = 0; counter < 10; counter++) {
			System.out.print("Please enter a score");
			scores = input.nextInt();
				total = total + scores;
		}

	
		
		System.out.print("The total scores are: " + total);
		}
	}