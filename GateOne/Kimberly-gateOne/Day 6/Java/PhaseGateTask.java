import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Scanner;
public class PhaseGateTask {
	public static int AgeCalculator(String collectInput){
		
		Scanner input = new Scanner(System.in);
		LocalDate localDate = LocalDate.now();
		

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

		

		

		if(collectInput.length() != 11){	
			
			year = collectInput.substring(6);
			month = collectInput.substring(3,5);
			day = collectInput.substring(0,2);
			newDay = Integer.parseInt(day); 
			newMonth = Integer.parseInt(month);
			newYearNumbers = Integer.parseInt(year);	
		}	
		else{
			cutOutLetterInBetween = collectInput.substring(0,2);
			ifLettersUsed = collectInput.substring(7);

			monthsInLetters = collectInput.substring(3,6);
	
			secondDate = Integer.parseInt(cutOutLetterInBetween);
			yearDate = Integer.parseInt(ifLettersUsed);	

			//System.out.println("Your current age is: " + yearDate);

			
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