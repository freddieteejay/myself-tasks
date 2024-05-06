import java.util.*;
public class Algorithim{
	public static void main(String[] args){
		int result = 0;
		String numbers = "124589";
		ArrayList <Integer> alpha = new ArrayList<>();
		for (int i = numbers.length(); i > 0; i--){
			if (i % 2 != 0){
			int num = Integer.valueOf(String.valueOf(numbers.charAt(i)));
			alpha.add(num);
			result += num;
			}
		}		
		System.out.println(alpha);
		System.out.println(result);


	}























}