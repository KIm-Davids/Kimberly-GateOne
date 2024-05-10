import java.util.Scanner;
	public class AtmCardValidator {
			public static Boolean cardValidator(String collectInput){
			
				if(collectInput.length() == 16 & collectInput.charAt(0) == '4' || collectInput.charAt(0) == '5' || collectInput.charAt(0) == '6' && collectInput.charAt(4) == '-' & collectInput.charAt(9) == '-' & collectInput.charAt(14) == '-'){
				return true;
			}
					
			else{
				return false;
			}

}  


			public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.println("Please enter your card number");
			String cardNumber = input.next();
			
			System.out.print(cardValidator(cardNumber));

			
			}

}
				//4123-4567-8901-2345
	