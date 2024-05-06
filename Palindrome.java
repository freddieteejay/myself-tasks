import java.util.Scanner;
public class Palindrome{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number");
			String num = scanner.nextLine();
		String reversed = "";
		for (int i = num.length()-1; i >= 0; i--){
			reversed  += num.charAt(i);  
		}
		System.out.print(reversed);
}
}