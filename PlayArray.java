import java.util.*;
public class PlayArray{
	public static void main(String... args){
		int[] arr = {2, 9, 3, 1, 6};
		int[] result = PlayArray.number(arr);
		System.out.print(Arrays.toString(result));



}

	public static int[] number(int [] numbers){
	for (int i = 0; i < numbers.length -1; i++){
		for (int count = i +1; count < numbers.length; count++){
			if (numbers[i] > numbers[count]){
				numbers[i] = numbers[i] + numbers[count];
				numbers[count] = numbers[i] - numbers[count];
				numbers[i] = numbers[i] - numbers[count];
			}
		}
	}

return numbers;
	









	}

}