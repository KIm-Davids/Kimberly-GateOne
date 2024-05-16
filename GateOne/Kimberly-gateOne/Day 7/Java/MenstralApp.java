import java.time.LocalDate;
import java.util.Scanner;
	
public class MenstralApp {
	static Scanner input = new Scanner(System.in);

	public static void loginPage(){
		System.out.print("""
		HELLO USER, 
		WELCOME, WHAT WOULD YOU CHECKING TODAY ?

		1 -> Check period date
		2 -> Check ovulation date 
		3 -> Check safe period

		""");

		int login = input.nextInt();

		switch(login){
				   case 1: checkNextPeriod();		
						break;
				   case 2: ovulation();
						break;
				   case 3: safePeriod();
						break;
		}
	}



	public static void checkNextPeriod(){
		System.out.println("Enter your cycle length ");
		int cycleLength = input.nextInt();

		System.out.println("Enter your last period date");
		int lastDay = input.nextInt();

		System.out.println("Enter your period duration ");
		int duration = input.nextInt();

		System.out.println("Enter the month of your last period");
		int month = input.nextInt();

		System.out.println("Enter the year of your last period");
		int year = input.nextInt();

		LocalDate date = LocalDate.of(year,month,lastDay);
		LocalDate nextPeriod = date.plusDays(cycleLength);
		LocalDate endPeriod = nextPeriod.plusDays(duration);


		System.out.printf("Your next period Stats from %s to %s", nextPeriod, endPeriod);	
		System.out.print("Let's go back <yes> or <no>");

		String goBack = input.next();

		if(goBack.equalsIgnoreCase("yes")){
			loginPage();
		}

		
	}

	public static void ovulation(){
		System.out.println("Enter your cycle length ");
		int cycleLength = input.nextInt();

		System.out.println("Enter your last period date");
		int lastDay = input.nextInt();

		System.out.println("Enter your period duration ");
		int duration = input.nextInt();

		System.out.println("Enter the month of your last period");
		int month = input.nextInt();

		System.out.println("Enter the year of your last period");
		int year = input.nextInt();

		LocalDate date = LocalDate.of(year,month,lastDay);
		LocalDate nextPeriod = date.plusDays(cycleLength);
		LocalDate endPeriod = nextPeriod.plusDays(duration);

		int result = cycleLength / 2;

		LocalDate ovulationPeriod = endPeriod.minusDays(result);

		
		System.out.printf("Your Ovulation date is: "+ ovulationPeriod);
		System.out.print("Let's go back <yes> or <no>");

		String goBack = input.next();

		if(goBack.equalsIgnoreCase("yes")){
			loginPage();
		}
		
	}


	public static void safePeriod(){
		System.out.println("Enter your cycle length ");
		int cycleLength = input.nextInt();

		System.out.println("Enter your last period date");
		int lastDay = input.nextInt();

		System.out.println("Enter your period duration ");
		int duration = input.nextInt();

		System.out.println("Enter the month of your last period");
		int month = input.nextInt();

		System.out.println("Enter the year of your last period");
		int year = input.nextInt();

		LocalDate date = LocalDate.of(year,month,lastDay);
		LocalDate nextPeriod = date.plusDays(cycleLength);
		LocalDate endPeriod = nextPeriod.plusDays(duration);
		
		LocalDate safePeriod = nextPeriod.minusDays(5);
		LocalDate endSafePeriod = safePeriod.plusDays(5);
		
		System.out.printf("Your safe period starts from %s  to %s",  safePeriod, endSafePeriod);
	}
	

	public static void main(String[] args){
		loginPage();	
			

	}
}