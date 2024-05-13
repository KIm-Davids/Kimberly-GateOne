import java.time.period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
	public static int calculateAge(String collectInput){
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate localDate = LocalDate.parse(collectInput, formatter);

		
		


	}




	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your date of birth");
	String date = input.next();

	System.out.print(calculateAge(date));
	
	}
}	