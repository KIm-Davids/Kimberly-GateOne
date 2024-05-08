import java.util.Arrays;
public class JavaTaskFive{
	public static int[] evenIndex(int[] collectInput){

	int[] collected_numbers = new int[10];


	for(int counter = 0; counter < collectInput.length ; counter+=2){
		collected_numbers[counter] = collectInput[counter];


	}
	return collected_numbers;
}

