package sun.com;
import java.util.*;
public class Scanner_ex {

	public static void main(String[] args) {
		String answer;
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Quantity:");
		int quality = input.nextInt();
		System.out.println("Enter the Price:");
		double price = input.nextDouble();
		double total = quality*price;
		System.out.println("Total is:" +total);
		
		System.out.println("Do you want to perform again:");
		answer=input.next();
		}while(answer.equalsIgnoreCase("Yes"));
		
	}
}
