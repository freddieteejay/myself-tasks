import java.util.*;
public class Pal{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
System.out.println("enter a digit");
int dig = scanner.nextInt();
int total = 0;
while(dig > 0){
total+=dig %10;
System.out.println(dig %10);
System.out.println(total);
dig/=10;

}


}
}