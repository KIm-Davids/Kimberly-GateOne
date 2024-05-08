public class JavaTaskSix{
	public static int evenIndex(int[] collectInput){

	int collected_numbers = 0;


	for(int counter = 1; counter < collectInput.length ; counter+=2){
		collected_numbers += collectInput[counter];


	}
	return collected_numbers;
}
