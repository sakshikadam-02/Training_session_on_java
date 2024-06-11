package sun.com;
import java.util.*;
public class relational_ex {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the Number1:");
		int a = sc.nextInt();
		
        Scanner sc2 = new Scanner(System.in);        
		System.out.println("Enter the Number2:");
		int b = sc2.nextInt();
		
		System.out.println("a == b = " + (a == b) );
	    System.out.println("a != b = " + (a != b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("a >= b = " + (a >= b) );
		System.out.println("a <= b = " + (a <= b) );

	}

}
