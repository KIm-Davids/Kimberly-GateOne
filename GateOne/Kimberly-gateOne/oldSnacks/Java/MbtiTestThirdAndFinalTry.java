import java.util.*;

public class MbtiTestThirdAndFinalTry {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int selectionA1 = 0;
	int selectionB1 = 0;
	int selectionA2 = 0;
	int selectionB2 = 0;
	int selectionA3 = 0;
	int selectionB3 = 0;
	int selectionA4 = 0;
	int selectionB4 = 0;	

	ArrayList<String> extrovertVsIntrovert = new ArrayList<String>();
	


	System.out.println("What is your name");
	String name = scanner.nextLine();

	//Extroverted Vs Introverted questions

	//question 1

	int counter = 0;
	String question1;

	System.out.println("""

	WELCOME TO MYERS-BRIGGS PERSONALITY TEST
				""");


	do
	{

	System.out.println("""
	A. expend energy, enjoy groups         B. Conserve energy, enjoy one-on-one
			""");
	question1 = scanner.next();

	if (question1.equalsIgnoreCase("A") ) {
		selectionA1++;
		break;
	}
	
	if (question1.equalsIgnoreCase("B")) {
		selectionB1++;
		break;
	}
	
	

	}while(question1 != "A" | question1 != "a" && question1.length() > 0 ) ;
		
	

	//question 5

	String question2;
	

	do
	{
		System.out.println("""
		A. More outgoing, think out loud         B. More reserved, think to yourself
				""");
	 	question2 = scanner.next();
		if (question2.equalsIgnoreCase("A")) {
			selectionA1++;
			break;
		}
	
		if (question2.equalsIgnoreCase("B")) {
			selectionB1++;
			break;
		}
		
	}while(question2.charAt(0) != 'A' | question2.charAt(0) != 'a' && question2.length() > 0) ;
	

	//question 9

	String question3;

	do
	{

	System.out.println("""
	A. Seek many tasks, Public activities, Interation with Others         B. Seek private, Solitary activities with quiet to concentrate
				""");
	 	question3 = scanner.next();
		if (question3.equalsIgnoreCase("A")) {
			selectionA1++;
			break;
	}
	
		if (question3.equalsIgnoreCase("B")) {
			selectionB1++;
			break;
	}
		
				
	
	}while(question3.charAt(0) != 'A' | question3.charAt(0) != 'a' && question3.length() > 0) ;
	


	//question 13

	String question4;

	do
	{

	System.out.println("""
	A. External, Communicate, Express yourself         B. Internal, Reticient, keep to yourself
			""");
	question4 = scanner.next();

	if (question4.equalsIgnoreCase("A")) {
			selectionA1++;
			break;
	}
	
		if (question4.equalsIgnoreCase("B")) {
			selectionB1++;
			break;
	}
		
	}while(question4.charAt(0) != 'A' | question4.charAt(0) != 'a' && question4.length() > 0) ;




	//question 17

	String question5;

	do
	{

	System.out.println("""
	A. active, initiate        B.  reflective, deliberate
			""");
	question5 = scanner.next();

	if (question5.equalsIgnoreCase("A")) {
			selectionA1++;
			break;
	}
	
		if (question5.equalsIgnoreCase("B")) {
			selectionB1++;
			break;
	}
	}while(question5.charAt(0) != 'A' | question5.charAt(0) != 'a' && question5.length() > 0) ;



	//Sensing Vs Intuitive

	//question 2
		
	String question6;

	do
	{

	System.out.println("""
	A. Interpet literally         B. Look for meaning and possibility
			""");
	question6 = scanner.next();

	if (question6.equalsIgnoreCase("A")) {
			selectionA2++;
			break;
	}
	
		if (question6.equalsIgnoreCase("B")) {
			selectionB2++;
			break;
	}
		
	}while(question6.charAt(0) != 'A' | question6.charAt(0) != 'a' && question6.length() > 0) ;


	
	String question7;

	//question 6


	do
	{
	System.out.print("""
		
		A. practical, realistic, experiential	B. imaginative, innovative, theoretica


				""");


	question7 = scanner.next();

	if (question7.equalsIgnoreCase("A")) {
			selectionA2++;
			break;
	}
	
		if (question7.equalsIgnoreCase("B")) {
			selectionB2++;
			break;
	}
		
	}while(question7.charAt(0) != 'A' | question7.charAt(0) != 'a' && question7.length() > 0) ;



		
	String question8;

	//question 10

	do
	{
	System.out.print("""
		
		A.  standard,  usual, conventional		B.  different, novel, unique


				""");
	question8 = scanner.next();


	if (question8.equalsIgnoreCase("A")) {
			selectionA2++;
			break;
	}
	
		if (question8.equalsIgnoreCase("B")) {
			selectionB2++;
			break;
	}
	}while(question8.charAt(0) != 'A' | question8.charAt(0) != 'a' && question8.length() > 0) ;



	String question9;

	//question 14

	do
	{
	
	System.out.print("""
		
		 A. focus on here-and-now,  look to the future	         B.  global perspective, big picture



				""");
		

	question9 = scanner.next();


	if (question9.equalsIgnoreCase("A")) {
			selectionA2++;
			break;
	}
	
		if (question9.equalsIgnoreCase("B")) {
			selectionB2++;
			break;
	}
	}while(question9.charAt(0) != 'A' | question9.charAt(0) != 'a' && question9.length() < 2) ;



	String question10;

	//question 18

	do
	{
	
	System.out.print("""
		
		 A. facts, things, what is 	 B.  ideas, dreams, what could be , philosophical



				""");
		

	question10 = scanner.next();


	if (question10.equalsIgnoreCase("A")) {
			selectionA2++;
			break;
	}
	
		if (question10.equalsIgnoreCase("B")) {
			selectionB2++;
			break;
	}
		
	}while(question10.charAt(0) != 'A' | question10.charAt(0) != 'a' && question10.length() > 0) ;



	
	//Thinking Vs Feeling

	String Question10;

	//question 3

	do
	{
	
	System.out.print("""
		
		A. Logical, Thinking, Questioning         B. Empatethic, Feeling, Accomodating


				""");
		

	Question10 = scanner.next();


	if (Question10.equalsIgnoreCase("A")) {
			selectionA3++;
			break;
	}
	
		if (Question10.equalsIgnoreCase("B")) {
			selectionB3++;
			break;
	}
		
	}while(Question10.charAt(0) != 'A' | Question10.charAt(0) != 'a' && Question10.length() > 0) ;




	String Question11;

	//question 7

	do
	{
	
	System.out.print("""
		
	A. Candid, Straight Forward, Frank         B. Tactful, Kind, Encouraging

				""");
		

	Question11 = scanner.next();


	if (Question11.equalsIgnoreCase("A")) {
			selectionA3++;
			break;
	}
	
		if (Question11.equalsIgnoreCase("B")) {
			selectionB3++;
			break;
	}
		
	}while(Question11.charAt(0) != 'A' | Question11.charAt(0) != 'a' && Question11.length() > 0) ;



	String Question12;

	//question 11

	do
	{
	
	System.out.print("""
		
	A. Firm, Tend to critisize, Hold the line         B. Gentle, tend to appreciate, conciliate
				""");
		

	Question12 = scanner.next();


	if (Question12.equalsIgnoreCase("A")) {
			selectionA3++;
			break;
	}
	
		if (Question12.equalsIgnoreCase("B")) {
			selectionB3++;
			break;
	}
		
	}while(Question12.charAt(0) != 'A' | Question12.charAt(0) != 'a' && Question12.length() > 0) ;




	String Question13;

	//question 15

	do
	{
	
	System.out.print("""
		
	A. Tough minded, just         B. Tender Hearted, Merciful
				""");
		

	Question13 = scanner.next();


	if (Question13.equalsIgnoreCase("A")) {
			selectionA3++;
			break;
	}
	
		if (Question13.equalsIgnoreCase("B")) {
			selectionB3++;
			break;
	}
	}while(Question13.charAt(0) != 'A' | Question13.charAt(0) != 'a' && Question13.length() > 0) ;


	String Question14;

	//question 19

	do
	{
	
	System.out.print("""
		
	A. Matter of fact, Issue-Oriented         B. Sensitive, People Oriented, Passionate
				""");
		

	Question14 = scanner.next();


	if (Question14.equalsIgnoreCase("A")) {
			selectionA3++;
			break;
	}
	
		if (Question14.equalsIgnoreCase("B")) {
			selectionB3++;
			break;
	}
		
	}while(Question14.charAt(0) != 'A' | Question14.charAt(0) != 'a' && Question14.length() > 0) ;



	//Judging Vs Perceptive

	String Question15;

	//question 4

	do
	{
	
	System.out.print("""
		
	A. Organized, Orderly         B. Flexible, Adaptable
				""");
		

	Question15 = scanner.next();


	if (Question15.equalsIgnoreCase("A")) {
			selectionA4++;
			break;
	}
	
		if (Question15.equalsIgnoreCase("B")) {
			selectionB4++;
			break;
	}
		
	}while(Question15.charAt(0) != 'A' | Question15.charAt(0) != 'a' && Question15.length() > 0) ;



	String Question16;

	//question 8

	do
	{
	
	System.out.print("""
		
	A. Plan, Schedule         B. Unplanned, Spontaneous
				""");
		

	Question16 = scanner.next();


	if (Question16.equalsIgnoreCase("A")) {
			selectionA4++;
			break;
	}
	
		if (Question16.equalsIgnoreCase("B")) {
			selectionB4++;
			break;
	}
		
	}while(Question16.charAt(0) != 'A' | Question16.charAt(0) != 'a' && Question16.length() > 0) ;


	String Question17;

	//question 12

	do
	{
	
	System.out.print("""
		
	A. regulated, structured       B. easy-going, live and let live
				""");
		

	Question17 = scanner.next();


	if (Question17.equalsIgnoreCase("A")) {
			selectionA4++;
			break;
	}
	
		if (Question17.equalsIgnoreCase("B")) {
			selectionB4++;
			break;
	}
		
	}while(Question17.charAt(0) != 'A' | Question17.charAt(0) != 'a' && Question17.length() > 0) ;


	String Question18;

	//question 16

	do
	{
	
	System.out.print("""
		
	A. Preparation, Plan ahead         B. Go with the flow, Adapt as you go
					""");
		

	Question18 = scanner.next();


	if (Question18.equalsIgnoreCase("A")) {
			selectionA4++;
			break;
	}
	
		if (Question18.equalsIgnoreCase("B")) {
			selectionB4++;
			break;
	}
	}while(Question18.charAt(0) != 'A' | Question18.charAt(0) != 'a' && Question18.length() > 0) ;



	String Question19;

	//question 20

	do
	{
	
	System.out.print("""
		
	A.  control, govern        B.  latitude, freedom
					""");
		

	Question19 = scanner.next();


	if (Question19.equalsIgnoreCase("A")) {
			selectionA4++;
			break;
	}
	
		if (Question19.equalsIgnoreCase("B")) {
			selectionB4++;
			break;
	}
		
	}while(Question19.charAt(0) != 'A' | Question19.charAt(0) != 'a' && Question19.length() > 0) ;


		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		


		String theQuestion1a = "A. expend energy, enjoy groups";        
		String theQuestion1b =  "B. Conserve energy, enjoy one-on-one";
		String theQuestion2a = "A. More outgoing, think out loud";      
		String theQuestion2b = "B. More reserved, think to yourself";
		String theQuestion3a = "A. Seek many tasks, Public activities, Interation with Others";   
   
		String theQuestion3b =  "B. Seek private, Solitary activities with quiet to concentrate";
		String theQuestion4a = "A. External, Communicate, Express yourself";        
		String theQuestion4b = "B. Internal, Reticient, keep to yourself";
		String theQuestion5a = "A. active, initiate";      
		String theQuestion5b = "B. reflective, deliberate"; 

		String theQuestion6a = "A. Interpet literally";
		String theQuestion6b = "B. Look for meaning and possibility";
		String theQuestion7a = "A. practical, realistic, experiential";
		String theQuestion7b = "B. imaginative, innovative, theoretical";
		String theQuestion8a = "A. standard,  usual, conventional";
 
		String theQuestion8b = "B. different, novel, unique";
		String theQuestion9a = "A. focus on here-and-now,  look to the future";
		String theQuestion9b = "B. global perspective, big picture";
		String theQuestion10a = "A. facts, things, what is";
		String theQuestion10b = "B. ideas, dreams, what could be , philosophical";


		
		String theQuestion11a = "A. Logical, Thinking, Questioning ";
		String theQuestion11b = "B. Empatethic, Feeling, Accomodating";
		String theQuestion12a = "A. Candid, Straight Forward, Frank  ";
		String theQuestion12b = "B. Tactful, Kind, Encouraging";
		String theQuestion13a = "A. Firm, Tend to critisize, Hold the line ";

		String theQuestion13b = "B. Gentle, tend to appreciate, conciliate";
		String theQuestion14a = "A. Tough minded, just";
		String theQuestion14b = "B. Tender Hearted, Merciful";
		String theQuestion15a = "A. Matter of fact, Issue-Oriented ";
		String theQuestion15b = "B. Sensitive, People Oriented, Passionate";

		String theQuestion16a = "A. Organized, Orderly";
		String theQuestion16b = "B. Flexible, Adaptable";
		String theQuestion17a = "A. Plan, Schedule ";
		String theQuestion17b = "B. Unplanned, Spontaneous";
		String theQuestion18a = "A. regulated, structured";
		
		String theQuestion18b = "B. easy-going, live and let live";
		String theQuestion19a = "A. Preparation, Plan ahead ";
		String theQuestion19b = "B. Go with the flow, Adapt as you go";
		String theQuestion20a = "A. control, govern";
		String theQuestion20b = "B. latitude, freedom";
		


		System.out.println("Hello " + name + " You selected ");


		// 1
		if(question1.charAt(0) == 'A' | question1.charAt(0) == 'a') {
		System.out.println(theQuestion1a);
		}
		
		if(question1.charAt(0) == 'B' | question1.charAt(0) == 'b') {
		System.out.println(theQuestion1b);
		}

		//2

		if(question2.charAt(0) == 'A' | question2.charAt(0) == 'a') {
		System.out.println(theQuestion2a);
		}
		
		if(question2.charAt(0) == 'B' | question2.charAt(0) == 'b') {
		System.out.println(theQuestion2b);
		}

		//3

			
		if(question3.charAt(0) == 'A' | question3.charAt(0) == 'a') {
		System.out.println(theQuestion3a);
		}
		
		if(question3.charAt(0) == 'B' | question3.charAt(0) == 'b') {
		System.out.println(theQuestion3b);
		}


		//4
	
		if(question4.charAt(0) == 'A' | question4.charAt(0) == 'a') {
		System.out.println(theQuestion4a);
		}
		
		if(question4.charAt(0) == 'B' | question4.charAt(0) == 'b') {
		System.out.println(theQuestion4b);
		}

		
		//5

		if(question5.charAt(0) == 'A' | question5.charAt(0) == 'a') {
		System.out.println(theQuestion5a);
		}
		
		if(question5.charAt(0) == 'B' | question5.charAt(0) == 'b') {
		System.out.println(theQuestion5b);
		}

		System.out.println();
		System.out.println("Number of A selected: " + selectionA1);
		System.out.println("Number of B selected: " + selectionB1);
		System.out.println();

		
		
		// 6
		if(question6.charAt(0) == 'A' | question6.charAt(0) == 'a') {
		System.out.println(theQuestion6a);
		}
		
		if(question6.charAt(0) == 'B' | question6.charAt(0) == 'b') {
		System.out.println(theQuestion6b);
		}


		//7

		if(question7.charAt(0) == 'A' | question7.charAt(0) == 'a') {
		System.out.println(theQuestion7a);
		}
		
		if(question7.charAt(0) == 'B' | question7.charAt(0) == 'b') {
		System.out.println(theQuestion7b);
		}

		//8

			
		if(question8.charAt(0) == 'A' | question8.charAt(0) == 'a') {
		System.out.println(theQuestion8a);
		}
		
		if(question8.charAt(0) == 'B' | question8.charAt(0) == 'b') {
		System.out.println(theQuestion8b);
		}


		//9
	
		if(question9.charAt(0) == 'A' | question9.charAt(0) == 'a') {
		System.out.println(theQuestion9a);
		}
		
		if(question9.charAt(0) == 'B' | question9.charAt(0) == 'b') {
		System.out.println(theQuestion9b);
		}
		
		//10

		if(question10.charAt(0) == 'A' | question10.charAt(0) == 'a') {
		System.out.println(theQuestion10a);
		}
		
		if(question10.charAt(0) == 'B' | question10.charAt(0) == 'b') {
		System.out.println(theQuestion10b);
		}

		
		System.out.println();
		System.out.println("Number of A selected: " + selectionA2);
		System.out.println("Number of B selected: " + selectionB2);
		System.out.println();



		// 10 capital Q

		if(Question10.charAt(0) == 'A' | Question10.charAt(0) == 'a') {
		System.out.println(theQuestion11a);
		}
		
		if(Question10.charAt(0) == 'B' | Question10.charAt(0) == 'b') {
		System.out.println(theQuestion11b);
		}


		// 11

		if(Question11.charAt(0) == 'A' | Question11.charAt(0) == 'a') {
		System.out.println(theQuestion12a);
		}
		
		if(Question11.charAt(0) == 'B' | Question11.charAt(0) == 'b') {
		System.out.println(theQuestion12b);
		}
		
			
		// 12

		if(Question12.charAt(0) == 'A' | Question12.charAt(0) == 'a') {
		System.out.println(theQuestion13a);
		}
		
		if(Question12.charAt(0) == 'B' | Question12.charAt(0) == 'b') {
		System.out.println(theQuestion13b);
		}

	
		// 13

		if(Question13.charAt(0) == 'A' | Question13.charAt(0) == 'a') {
		System.out.println(theQuestion14a);
		}
		
		if(Question13.charAt(0) == 'B' | Question13.charAt(0) == 'b') {
		System.out.println(theQuestion14b);
		}
		

		// 14

		if(Question14.charAt(0) == 'A' | Question14.charAt(0) == 'a') {
		System.out.println(theQuestion15a);
		}
		
		if(Question14.charAt(0) == 'B' | Question14.charAt(0) == 'b') {
		System.out.println(theQuestion15b);
		}
		
		
		System.out.println();
		System.out.println("Number of A selected: " + selectionA3);
		System.out.println("Number of B selected: " + selectionB3);
		System.out.println();

		
		// 15

		if(Question15.charAt(0) == 'A' | Question15.charAt(0) == 'a') {
		System.out.println(theQuestion16a);
		}
		
		if(Question15.charAt(0) == 'B' | Question15.charAt(0) == 'b') {
		System.out.println(theQuestion16b);
		}
		
		//16

		if(Question16.charAt(0) == 'A' | Question16.charAt(0) == 'a') {
		System.out.println(theQuestion17a);
		}
		
		if(Question16.charAt(0) == 'B' | Question16.charAt(0) == 'b') {
		System.out.println(theQuestion17b);
		}
		
		
		//17

		if(Question17.charAt(0) == 'A' | Question17.charAt(0) == 'a') {
		System.out.println(theQuestion18a);
		}
		
		if(Question17.charAt(0) == 'B' | Question17.charAt(0) == 'b') {
		System.out.println(theQuestion18b);
		}
		

		// 18

		if(Question18.charAt(0) == 'A' | Question18.charAt(0) == 'a') {
		System.out.println(theQuestion19a);
		}
		
		if(Question18.charAt(0) == 'B' | Question18.charAt(0) == 'b') {
		System.out.println(theQuestion19b);
		}
		

		//19

		if(Question19.charAt(0) == 'A' | Question19.charAt(0) == 'a') {
		System.out.println(theQuestion20a);
		}
		
		if(Question19.charAt(0) == 'B' | Question19.charAt(0) == 'b') {
		System.out.println(theQuestion20b);
		}
		
		
		System.out.println();
		System.out.println("Number of A selected: " + selectionA4);
		System.out.println("Number of B selected: " + selectionB4);
		System.out.println();







		//String loading;
		
		//	String type = " ";

		

		//System.out.println("CLICK TO SEE YOUR RESULT");
			//loading = scanner.next();

		//System.out.println("For the first segment of Extrovert 'E' VS Introvert 'I'\n ");
		

				//E							//N					//F				         	//J

		if (selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4) {
			System.out.println("""
		
			ENFJ			

			THE GIVER

			ENFJs are individuals who are people-centered. 
			They rely mostly on their intuition and feelings and tend to live through their imagination. 
			They focus on abstracts and what could happen in the future. 
			They are highly empathetic not just to their close friends and family but to people in general. 
			The ENFJ generally loves feedback and they can be referred to as people pleasers. 
			Their dominant cognitive function is an extraverted feeling that helps them be in tune with other people’s feelings. 
			Their auxiliary functions are introverted intuition that makes them focus on the future as opposed to the present moment.
			They thrive in jobs where they can encourage others and push them to grow. 
			This also includes humanitarian-focused jobs. In relationships, they are supportive and always willing to understand their partners
					
					""");
			
		
 		}




			System.out.println();



				//I						//N							//F					//J
			
		 if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4 ) {
			
		System.out.print("""

		INFJ

		The Counselor

		INFJs are visionaries who have a different view of the world. 
		They love introspection and refuse to take things at a surface level. 
		They could be termed weird by others because of how they see life. 
		The INFJ are idealists who love understanding complex issues. 
		They are reserved leaders who are usually creatives due to how easily they get inspired.
		Also known as the diplomats, the INFJ prefers to cooperate with members of their team as opposed to conflict.
		The dominant cognitive function of an INFJ is introverted intuition which helps them focus on internal insights and generally influences their decision-making. 
		Their tertiary cognitive function is an extraverted feeling which makes them highly sensitive to the feeling of others or what others refer to as being empathetic. 
		The INFJ thrives in jobs that require a deal of compassion, psychology, and/or collaboration.

			""");
		}

			
				//I						//N							//T						//J

		 if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 > selectionB3 & selectionA4 > selectionB4) {
		 System.out.print("""

		INTJ

		The Mastermind 

		INTJs are introverts who are comfortable being by themselves. 
		They would avoid socializing as it drains their energy. 
		They excel at developing plans and strategies. 
		As analytical problem solvers, this personality type is strategic and innovative
		Their dominant cognitive function is Introverted intuition which they use to read between the lines and unravel patterns. 		
		The auxiliary function is extraverted thinking which makes them deliberate about solutions and highly organized. 
		Also known as the architects, the INTJ thrives in jobs that require logical systems and innovative solutions. 
		They usually prefer to work alone. In relationships, they are loyal and are great at encouraging their partners. 
				""");

		}


				//I							//S						//T						//P
		
		 if (selectionA1 < selectionB1 & selectionA2 > selectionB2 & selectionA3 > selectionB3 & selectionA4 < selectionB4) {
		System.out.print("""

		ISTP

		The Craftsman

		ISTPs are a mysterious, rational, and highly logical bunch. 
		They are spontaneous and unpredictable most times albeit oblivious to those around them because they are experts at hiding their true nature.
		Their dominant cognitive function is introverted thinking which makes them focus on the logical aspect of a situation. 
		The ISTP’s auxiliary cognitive function is extraverted sensing which helps them focus on abstract things. 
		They thrive in jobs that require technical expertise and physical activity. In relationships, they are calm lovers who prefer being handy around the house.
			""");
		
		}

	
		
				//E						//S					//F								//J
		if(selectionA1 > selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4) {
		System.out.print("""

		ESFJ

		The Provider

		ESFJs are stereotypically known to be extroverts. 
		They are cheerleaders and raise the spirits of those around them earning them popularity. 
		Because of their nature, they are easily liked and people easily warm up to them.
		Their dominant cognitive function is an extroverted feeling which makes them work and make decisions based on their gut feeling. 
		The ESFJ’s auxiliary cognitive function is introverted sensing which helps them focus on the present instead of the future or other abstract details.
		They thrive in jobs that require processes and interpersonal skills. In relationships, they are the traditional partners who believe in structure and stability.

			""");
		}

		

				//I							//N						//F								//P
		
		 if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 < selectionB4) {
		System.out.print("""

		INFP

		The Idealist

		INFPs are usually reserved and introverted. 
		They usually spend time all by themselves in quiet places. 
		They love analyzing signs and symbols and using them to draw inferences in explaining what is happening around them.
		Their dominant cognitive function is an introverted feeling which helps them with processing emotions internally.
		The INFP auxiliary cognitive function is the extraverted intuition that helps them focus on the big picture through imagination.
		They thrive in jobs that require visions and align with their goals/ interests. In relationships take time to select their friends and they are quite big on comprise. 
					""");
		}
			


				//E					//S						//F								//P

		if (selectionA1 > selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 < selectionB4) {
		System.out.print("""

		ESFP

		The Performer

		ESFPs are mostly perceived to be entertainers. 
		They enjoy being in the spotlight. 
		They enjoy exploring and learning to share what they’ve learned with others through their strong interpersonal skills.
		Their dominant cognitive function is extraverted sensing which helps them stick to facts instead of abstract ideas. 
		The ESFP’s auxiliary cognitive function is an introverted feeling which helps them make decisions.
		They thrive in work environments where they can be spontaneous, move around often, and involves the use of artistic values. 		
		In relationships, the ESFP will prioritize their family and loved ones over anything although they can also strongly dislike a structured life.

			""");
	
		}


				//E						//N						//F						  //P
		if (selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 &  selectionA4 < selectionB4) {
		System.out.print("""

		ENFP

		The Champion

		ENFPs are highly individualistic and refuse to live their lives inside a box. 
		They strive to create their own methods of doing things. They operate with their feelings and are highly perceptive and thoughtful
		Their dominant cognitive function is extraverted intuition which allows them to focus on abstract thoughts and patterns. 		
		The auxiliary cognitive function is introverted feelings which make them focus on their feelings rather than logic.
		In relationships, the ENFP is always expressive and shares affection openly. They also thrive in jobs that demand creativity and imaginative solutions.
						""");
		}



				//I						//S						//F						//J
	
		 if (selectionA1 < selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4) {
		System.out.print("""

		ISFJ

		Queit, friendly, responsible and conscientious, committed and steady in meeting their obligations. 
		Thorough, painstaking and accurate.
		Loyal , considerate , notice and remember specifics about people who are important to them,
		Strive to create an orderly and harmonious enviroment at work and at home.

				""");

		}
	
		

				//I					//N						//F				//J
		
		if (selectionA1 < selectionB1 & selectionA2 < selectionB2 & selectionA3 < selectionB3 & selectionA4 > selectionB4)  {
		System.out.print("""
		
		
		INFJ 

		Seek meaning and connection in ideas, relationships, and material possessions. 
		Want to understand what motivates people and are insightful about others. 
		Conscientious and committed to their firm values. 
		Develop a clear vision about how best to serve the common good. 
		Organized and decisive in implementing their vision.
				""");

		}


				//I							//S						//F						//P
		
		if (selectionA1 < selectionB1 & selectionA2 > selectionB2 & selectionA3 < selectionB3 & selectionA4 < selectionB4) {
		System.out.print("""

		ISFP 

		Quiet, friendly, sensitive, and kind. 
		Enjoy the present moment, what's going on around them. 
		Like to have their own space and to work within their own time frame. 
		Loyal and committed to their values and to people who are important to them. 
		Dislike disagreements and conflicts; don't force their opinions or values on others.
			""");
		}

		

				//E				//S					//T					//p
		
		if(selectionA1 > selectionB1 & selectionA2 > selectionB2 & selectionA3 > selectionB3 & selectionA4 < selectionB4) {
		System.out.print("""
		
		ESTP 

		Flexible and tolerant, take a pragmatic approach focused on immediate results. 
		Bored by theories and conceptual explanations; want to act energetically to solve the problem. 
		Focus on the here and now, spontaneous, enjoy each moment they can be active with others. 
		Enjoy material comforts and style. Learn best through doing.
					""");
		}


				//E					//N					//T					//P
		
		if(selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 > selectionB3 & selectionA4 < selectionB4) {
		System.out.print("""

		ENTP 

		Quick, ingenious, stimulating, alert, and outspoken. 
		Resourceful in solving new and challenging problems. 
		Adept at generating conceptual possibilities and then analyzing them strategically. 
		Good at reading other people. 
		Bored by routine, will seldom do the same thing the same way, apt to turn to one new interest after another.
			""");

		}

		
		
			//E					//S						//T						//J

		if(selectionA1 > selectionB1 &  selectionA2 > selectionB2 & selectionA3 > selectionB3 & selectionA4 > selectionB4) {
		System.out.print("""

		ESTJ 

		Practical, realistic, matter-of-fact. 
		Decisive, quickly move to implement decisions. 
		Organize projects and people to get things done, focus on getting results in the most efficient way possible. 
		Take care of routine details. 
		Have a clear set of logical standards, systematically follow them and want others to also. 
		Forceful in implementing their plans.
			""");
		}


		
				//E					//N 				//T					//J
	
		if(selectionA1 > selectionB1 & selectionA2 < selectionB2 & selectionA3 > selectionB3 & selectionA4 > selectionB4) {
		System.out.print("""

		ENTJ 

		Frank, decisive, assume leadership readily. 
		Quickly see illogical and inefficient procedures and policies, develop and implement comprehensive systems to solve organizational problems. 
		Enjoy longterm planning and goal setting. Usually well informed, well read, enjoy expanding their knowledge and passing it on to others. 
		Forceful in presenting their ideas.
			""");
		}


		
		










		


		// //I

		// if (selectionA1 < selectionB1) {
		// 	System.out.println("It seems like you're an introvert");
 		// 	System.out.println("I");
			

		// }
		// 	System.out.println();

		// System.out.println("Please press 'A' to continue");
		// 	loading = scanner.next();

		// System.out.println("For the Second segment of Sensitive 'S' VS Intuitive 'N'\n ");
		// System.out.println("Number of A selected: " + selectionA2);
		// System.out.println("Number of B selected: " + selectionB2);

		// 	System.out.println();

		// //S
	
		// if (selectionA2 > selectionB2) {
		// 	System.out.println("It seems like you're an Sensitive");
 		// 	System.out.println("S");

 		// }
		// 	System.out.println();

		// //N


 		// if (selectionA2 < selectionB2) {
		// 	System.out.println("It seems like you're Intuitive ");
 		// 	System.out.println("N");
 		// }

		// 	System.out.println();

		// 	System.out.println("Please press 'A' to continue");
		// 	loading = scanner.next();
			

		// System.out.println("For the Third segment of Thinking 'S' VS Feeling 'N'\n ");
		// System.out.println("Number of A selected: " + selectionA3);
		// System.out.println("Number of B selected: " + selectionB3);
		// 	System.out.println();

		
		// //T

		// if (selectionA3 > selectionB3) {
		// 	System.out.println("It seems like you're a Thinker ");
		// 	System.out.println("T");
			
		// }
		// 	System.out.println();

		// //F

 		// if (selectionA3 < selectionB3) {
		// 	System.out.println("It seems like you're more of the emotional type ");
 		// 	System.out.println("F");
 		// }
		// 	System.out.println();


		// System.out.println("Please press 'A' to continue");
		// 	loading = scanner.next();

		// System.out.println("For the Last segment of Judging 'S' VS Perceptive 'N'\n ");
		// System.out.println("Number of A selected: " + selectionA4);
		// System.out.println("Number of B selected: " + selectionB4);

		// 	System.out.println();

		// //J

	 	// if (selectionA4 > selectionB4) {
		// 	System.out.println("It seems like you're more of the judging type ");
 		// 	System.out.println("J");
 		// }
		// 		System.out.println();

		// //P

		// if (selectionA4 < selectionB4){
		// 	System.out.println("It seems like you're more of the perceptive type ");
 		// 	System.out.println("P");
 		// }


		














// }
// }














}
}