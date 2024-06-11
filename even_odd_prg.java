package sun.com;
import java.util.*;
public class even_odd_prg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int x = sc.nextInt();	
        
		if(x%2==0) 
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
