import java.util.Scanner;
	public class JavaTaskNine {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int total = 0;
		int scores = 0;
		int counter = 0;
		int average = 0;
		int index = 0;

		for(counter = 0; counter <= 100; counter++) {		
			total += counter;
		}		
		
		
		System.out.printf("The average scores are: %d", total);

		}
	}