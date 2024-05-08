public class JavaTaskSeven{
	public static int evenIndex(int[] collectInput){

	int collected_numbers = 0;


	for(int counter = 0; counter < collectInput.length ; counter+=2){
		collected_numbers += collectInput[counter];


	}
	return collected_numbers;
}
