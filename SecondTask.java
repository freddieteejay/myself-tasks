import java.util.*;
public class SecondTask{
	public static void main(String... args){
		int[] numbers = {6, 9, 1, 2, 3};
		for(int count = 0; count < numbers.length; count++){
			for(int counter = 0; counter < numbers.length; counter++){
				int num = numbers[count] * numbers[counter];
				if (numbers[count] != numbers[counter]){
					System.out.println(numbers[count]+ "x"+numbers[counter]+" = "+num );
					System.out.println(Math.max(num));
					
				}
	
			}
		}























	}
}