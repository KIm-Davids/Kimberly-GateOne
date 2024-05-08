import java.util.Scanner;
public class JavaTaskTwo{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int[] array = new int[10];

	for(int counter =0; counter < array.length; counter++){
		System.out.print("Enter a number");
		array[counter] = input.nextInt();
	}
	for(int index = 0; index < array.length; index++){
		System.out.println(array[index]);

	}
	}




}