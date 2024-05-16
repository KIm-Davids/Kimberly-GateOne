import java.util.Scanner;
public class MenstralPadCalculator {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String question1 = "";
		String question2 = "";
		String question3 = "";
		

		int question1A = 0;
		int question1B = 0;
		int question2A = 0;
		int question2B  = 0;
		int question3A = 0;
		int question3B = 0;


		System.out.print("""
		
		HELLO, LETS HELP YOU IN CALCULATING YOUR MONTHLY VISITOR

		""");


		System.out.print("""

		Firstly, a little brief; Menstruation (Monthly Period):

		During the monthly hormone cycle, the lining of the womb thickens in preparation for a possible pregnancy.
		If no fertilized egg is present, the uppermost mucous layer detaches.
		The womb’s muscles contract irregularly, allowing the tissue to break away and exit the body through the vagina.
		This process, known as menstruation, typically lasts three to seven days in most women.

		Please answer each question accurately !

		Press Any Number to continue:

		""");
		int brief = input.nextInt();

		//cycle + lastPeriod = due date
		//due date - 14 = ovulation
		// 7 days - due date = safe period
		//7 + start days of your period = another safe period
		

		System.out.print("Please input your period cycle ?");
		int cycle = input.nextInt();

		System.out.print("Enter your first day of your last period ?");
		int lastPeriod = input.nextInt();

		System.out.print("Enter your ");

		

			

		

	}
}