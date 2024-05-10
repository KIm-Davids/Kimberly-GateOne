import java.util.Arrays;
public class JavaTaskFive{
	public static int[] evenIndex(int[] collectInput){

	int[] collected_numbers = new int[10];
	for(int counter = 0; counter < collectInput.length ; counter+=2){
		collected_numbers[counter] = collectInput[counter];
	}
	return collected_numbers;
}
	public static void main(String[] args){
	int[] array = {1,2,3,4,5,6,7,8,9,10};
	System.out.print(Arrays.toString(evenIndex(array)));	

}
}