import java.util.Arrays;
import java.util.Scanner;
	public class TikTakToe {
		public static void main(String[] args){

	
			Scanner input = new Scanner(System.in);
			
			String[][] board = {{" "," "," "},
						     {" "," "," "},
						     {" "," "," "}};						   
			System.out.println("WELCOME TO MINI TIK TAK TOE GAME");

			for(int counter =0; counter < board.length; counter++){
				for(int index = 0; index < board.length; index++){
					do
					{
					System.out.println("Please enter an 'X' or 'O' to begin:\npostion " + (index + 1));								 
					board[counter][index] = input.next();
					System.out.println("Enter a position");
					
					}while(!board[counter][index].equalsIgnoreCase("x") & !board[counter][index].equalsIgnoreCase("o") && board[counter][index].length() > 0 | board[counter][index].length() > 0 );
				}
			}
				System.out.println("Board");
		
			for(int counter = 0; counter < 3; counter++){
				System.out.println();
				for(int index = 0; index < 3; index++){
					System.out.print(board[counter][index] + " ");
				}
			}	
	}		
}