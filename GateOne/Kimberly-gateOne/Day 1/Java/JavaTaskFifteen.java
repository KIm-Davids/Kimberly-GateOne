 public class JavaTaskFifteen {
	public static void main(String[]  args) {
	
		for(int counter = 1; counter < 51; counter++){
			if(counter % 7 == 0){
				for(int index = 0; index < 7; index++){
					System.out.print(counter+ ",");
				}
			}	
		}
	}
}