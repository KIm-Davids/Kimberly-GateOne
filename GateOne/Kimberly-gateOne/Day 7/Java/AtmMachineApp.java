import java.util.Scanner;
import java.util.ArrayList;
public class AtmMachineApp {
		static Scanner input = new Scanner(System.in);
		public static ArrayList<String> loginPage(){

		ArrayList<String> userDetails = new ArrayList<String>();		

			System.out.println("Please enter your name");
			String userName = input.next();
			userDetails.add(userName);

				System.out.println();
				System.out.println();

			System.out.print("Please enter your phone number");
			String phoneNumber = input.next();
			userDetails.add(phoneNumber);

				
				System.out.println();
				System.out.println();

			System.out.println("Please enter your e-mail");
			String email = input.next();
			userDetails.add(email);

			
				System.out.println();
				System.out.println();

			System.out.println("Please enter your address");
			String address = input.next();

			userDetails.add(address);

			return userDetails;

		}














		public static void main(String[] args){
	//	Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.println();

	
		System.out.print("WELCOME TO KIM MULTINATIONAL BANK");
	
		System.out.println();

		System.out.print("""

		1 -> Create Account
		2 -> Sign In

			""");
		
		int loginPage = input.nextInt();

		switch(loginPage){
						case 1: loginPage();
						case 2: 
	



		}
	}                                                                                                                      				
}