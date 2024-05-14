import java.util.Scanner;
public class AtmMachineAppRetry {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		AtmMachine myAccount = new AtmMachine();

		System.out.printf("Initial name is: %ns%n%n", myAccount.getName());

		System.out.println("Please enter the name");

		String theName = input.next();
		myAccount.setName(theName);
		System.out.printl();

		System.out.printf("Name in object myAccount is %n%s%n", myAccount.getName());
	
		
		
	}
}
