import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.YearMonth;

public class AgeCalculator {
	public static int calculateAge(String collectInput){
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(collectInput, formatter);		
		Period period = Period.between(date,localDate);
		period.getYears();		
		int year = Math.abs(period.getYears());
		
		return year;

	}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String replacedString  = "";
	System.out.println("Enter your date of birth");
	String date = input.next();
	replacedString = date.replaceAll(" ","/");

	if(date.charAt(2) != '/' & date.charAt(5) != '/'){
		StringBuilder string = new StringBuilder(date);
		string.setCharAt(2, '/');
		string.setCharAt(5,'/');
	}
	System.out.print(calculateAge(replacedString));
	
	}
}	