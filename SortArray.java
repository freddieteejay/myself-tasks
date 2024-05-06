import java.util.*;

public class SortArray{

	public static void main(String...args){

		int[] arr = {2, 9, 3, 1, 6};

		for(int counter = 0; counter < arr.length-1; counter++){

		for(int count = 0; count < arr.length-1; count++){
		
		int tmp = 0;

		if (arr[count] > arr[count+1]){
		tmp = arr[count+1];
		arr[count+1] = arr[count];
		arr[count] = tmp;
		}
		}
		}
		System.out.println(Arrays.toString(arr));
	}

}