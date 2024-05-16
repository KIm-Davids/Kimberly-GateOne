import java.util.Scanner;
import java.util.*;
import java.util.Collections;
	public class StudentGradeSolved {	
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
 
	   	int index = 0;
		int noOfStudents;
		int score;
		int row;
		String string = "=";
		System.out.println("How many students do you have ? ");
		int students = input.nextInt();
	
		
		System.out.println("How many subjects do they offer ?");
		int subjects = input.nextInt();
	
		int[][] subjAndStudents = new int[students][subjects];
		

		
		
		for(int counter = 0; counter < subjAndStudents.length;counter++) {

			System.out.println("Entering score for students " + (counter + 1));

			for(index = 0; index < subjects;index++){
				System.out.println("Enter score for subject " + (index + 1));
				subjAndStudents[counter][index] = input.nextInt();
				
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");	
				System.out.println("Saved successfully\n");
		
							
			

			}
			
		}
			

		System.out.println("==================================================================" + string.repeat(subjects));
		System.out.print("STUDENTS");
		
		for(int column = 0; column < index; column++) {
			System.out.print("\tSUB" + (column + 1));
		}
		System.out.print("\tTOTAL");
		System.out.print("\tAVERAGE");
		System.out.println("\tPOS");
		
		System.out.println("=================================================================="+ string.repeat(subjects));


	
		int[] total = new int[subjAndStudents.length];
		//double[] average = new double[subjAndStudents.length];
		int[] position = new int[subjAndStudents.length];
		


		
		double average = 0;
		int column;
		int[] result = new int[subjAndStudents.length];
		int totalResult = 0;
		int increment = 0;
	
		for(int count = 0; count<subjAndStudents.length;count++){
			int totalScore = 0;
			for(int counter1 = 0; counter1<subjAndStudents[count].length;counter1++){
				totalScore += subjAndStudents[count][counter1];
				
			}
			total[count] = totalScore;
		}
		for(row = 0; row < subjAndStudents.length; row++) {
			System.out.print("\nSTUDENT " + (row + 1));	
	


			for(column = 0; column < subjects; column++) {

				System.out.print("\t " + subjAndStudents[row][column] + "");
				average = total[row]/subjAndStudents[row].length;
			
		}
					System.out.print("\t " + total[row]);
					System.out.print("\t " + average);	
					System.out.println("\t " + getPosition(total)[row]);
			
			}
		System.out.println("=================================================================="+ string.repeat(subjects));
		System.out.println("=================================================================="+ string.repeat(subjects));



		int[] studentPlus = new int[subjects];
		int studentsPlusOne = 0;
		int[] maximum = new int[subjects];
		for(int counter = 0; counter < subjects; counter++) {
			for(int x = 0; x < students; x++) {
				if(subjAndStudents[x][counter] > maximum[counter]) {
					maximum[counter] =  subjAndStudents[x][counter];
					studentsPlusOne = x + 1 ;
				}
					
			}
					studentPlus[counter] = studentsPlusOne;

		}

		int[] hardestSubject = new int[subjects];
		int[] minimum = new int[subjects];
		for(int counter = 0; counter < subjects; counter++) {
		minimum[counter] = 100;
			for(int y = 0; y < students; y++) {
				if(subjAndStudents[y][counter] < minimum[counter]){
					minimum[counter] = subjAndStudents[y][counter];
				}
			}
		}
				
		int[] subjectTotal = new int[subjects];
		double[] subjectAverage = new double[subjects];

		for(int counter = 0; counter < subjects; counter++) {
			for(int y = 0; y < students; y++) {
			subjectTotal[counter] += subjAndStudents[y][counter];
			subjectAverage[counter] = (double) subjectTotal[counter] / subjects;
		}
		}

		int passes = 0;
		int fail = 0;
		int numbersOfStudents = 0;
		

	for(numbersOfStudents = 0; numbersOfStudents < subjects; numbersOfStudents++) {	
		for(int counter = 0 ; counter < subjects; counter++){
			if( subjectTotal[counter] > 70) {
				passes++;
			}
			if( subjectTotal[counter] < 50){
				fail++;
			}
		}
		}
		
	
				

	// studentScore[counter] +



		System.out.println();
		System.out.println("SUJECT SUMMARY");
		System.out.println();
		for(int counter = 0; counter < subjects; counter++) {
			System.out.println("SUBJECTS "+ (counter + 1));
			System.out.println("Highest scoring student is: "+ "Student " + studentPlus[counter]+ " scoring " + maximum[counter]);
			System.out.println("Lowest scoring students is: "+ minimum[counter]);
			System.out.println("Total score is: "+ subjectTotal[counter]);
			System.out.printf("Average score is:  %.2f\n", subjectAverage[counter]);
			System.out.println("Number of passes " + passes);
			System.out.println("Number of fails " + fail);
			System.out.println();
		}
		

			
	}	
		
		
			
		public static int[] fillArrayFunction(int[] collectInput) {
			int[] array = new int[collectInput.length];
			
			for(int counter = 0; counter < collectInput.length; counter++) {
				array[counter] = 1;
			}
				return array;
			
		}
			
		public static int[] getPosition(int[] array){
		int[] positionArray = new int[array.length];
		int[] fillArray = fillArrayFunction(array);
		for(int count = 0; count < array.length; count++){
			for(int counter = 0; counter <array.length; counter++){
				if(array[counter] > array[count]){
					fillArray[count] += 1;
				}
		
		
		
		}
				
		}
				return fillArray;
		}
	
	

		
	
		

}

		
		
		
	
	
	
	