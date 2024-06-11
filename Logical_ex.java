package sun.com;
import java.util.*;
public class Logical_ex {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter the Number1:");
		int a = sc.nextInt();
		
        Scanner sc2 = new Scanner(System.in);
        
		System.out.println("Enter the Number2:");
		int b = sc2.nextInt();
		
        Scanner sc3 = new Scanner(System.in);
        
		System.out.println("Enter the Number3:");
		int c = sc3.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Number greater is:" +a);
		}

		if(b>a && b>c)
		{
			System.out.println("Number greater is:" +b);
		}
		else
		{
			System.out.println("Number greater is:" +c);
		}
	}

}
