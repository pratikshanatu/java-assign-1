package StringPract;

import java.util.Scanner;

public class Reverseword 
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string");
			String str=sc.next();
			System.out.println("Original string:"+str);
			String rev="";
			int length =str.length();
			for(int i=length-1; i>=0; i--)
			{
				rev=rev+str.charAt(i);
			}
			System.out.println("Reverse string" +rev);
			System.out.println("String in Upper case:" +str.toUpperCase());
	}
}

