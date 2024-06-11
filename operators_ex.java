package sun.com;
import java.util.*;
public class operators_ex {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter the Number1:");
		int a = sc.nextInt();
		
        Scanner sc2 = new Scanner(System.in);
        
		System.out.println("Enter the Number2:");
		int b = sc2.nextInt();
		//Arithmetic Operators
		System.out.println("Addition = " +(a + b));
		System.out.println("Subtraction = " +(a - b));
		System.out.println("Multiplication = " +(a * b));
		System.out.println("Division = " +(a / b));
		System.out.println("Modulus = " +(a % b));
		
		//Relational Operators
		System.out.println("a == b = " + (a == b) );
	    System.out.println("a != b = " + (a != b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("a >= b = " + (a >= b) );
		System.out.println("a <= b = " + (a <= b) );
		
		//Unary Operators
		System.out.println("a++  = " + (++a));
		System.out.println("b--  = " + (--b));
		
		//Logical Operators
		boolean x = true;
		boolean y = false;
		System.out.println("x && y = " + (x&&y));
		System.out.println("x || y = " + (x||y));
		System.out.println("!(x && y) = " + !(x&&y));
	}
}
