package StringPract;

import java.util.Scanner;

public class SameorNot 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of strings:");   
		       
		String[] string = new String [sc.nextInt()];        
		sc.nextLine();   
		for (int i = 0; i < string.length; i++)   
		{  
			string[i] = sc.nextLine();  
		}  
		System.out.println("You have entered:");   
		for(String str: string)   
		{  
			System.out.println(str);
		}
	}
}
