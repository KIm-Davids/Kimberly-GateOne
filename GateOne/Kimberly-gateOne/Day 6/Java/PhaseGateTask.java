import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;
public class PhaseGateTask {
	public static void main(String[] args){
		
		LocalDate localDate = LocalDate.now();
		Scanner input = new Scanner(System.in);

		String year = "";
		String month = "";
		String day = "";
		int newYearNumbers = 0;
		int newMonth = 0; 
		String cutOutLetterInBetween = "";		
		String ifLettersUsed = "";
		int currentMonth = LocalDate.now().getMonthValue();	
		int currentDay = LocalDate.now().getDayOfMonth();	
		int currentYear = YearMonth.now().getYear();
		int checkYear = 0;
		int yearDate = 0;
		int updatedYear = 0;
		int newDay = 0;
		int secondDate = 0;
		String monthsInLetters = "";
	

		String[] monthsOfTheYear = {"jan","feb","mar","apr","may","june"};
		String[] secondHalfOfTheYear = {"jul","aug","sept","oct","nov","dec"};

		
		System.out.print("Enter your date of birth");
		String date = input.next();

		if(date.length() != 11){	
			
			year = date.substring(6);
			month = date.substring(3,5);
			day = date.substring(0,2);
			newDay = Integer.parseInt(day); 
			newMonth = Integer.parseInt(month);
			newYearNumbers = Integer.parseInt(year);	
		}	
		else{
			cutOutLetterInBetween = date.substring(0,2);
			ifLettersUsed = date.substring(7);

			monthsInLetters = date.substring(3,6);
	
			secondDate = Integer.parseInt(cutOutLetterInBetween);
			yearDate = Integer.parseInt(ifLettersUsed);	


			
		}
		
		updatedYear = currentYear - newYearNumbers;
		
		int secondUpdatedYear = currentYear - yearDate;
		
	
		for(int counter = 0; counter < 1; counter++){
			
			if(secondDate  <= currentDay ||monthsInLetters == monthsOfTheYear[counter] & yearDate < currentYear){								
				System.out.println("Your current age is * " + secondUpdatedYear);
			}
			if(secondDate  <= currentDay & monthsInLetters == secondHalfOfTheYear[counter] || yearDate < currentYear){
				int secondCheckYear = secondUpdatedYear - 1 ;
				System.out.println("Your current age is # " + secondCheckYear);
			}
		}	
		
		if(newMonth > currentMonth && newYearNumbers < currentYear ){		
			checkYear = updatedYear - 1 ;
			System.out.println("Your current age is: " + checkYear);
		}
		if(newDay  < currentDay && newMonth <= currentMonth && newYearNumbers < currentYear){			
			System.out.println("Your current age is * " + updatedYear);
		}
		
	}

}
			

	//  11/12/2022