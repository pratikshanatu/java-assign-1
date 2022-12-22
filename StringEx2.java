package StringPract;
import java.util.Scanner;

public class StringEx2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First string");
		String str1=sc.next();
		System.out.println("Enter second string");
		String str2=sc.next();
		
		if(str1.contains(str2))
		{
			System.out.println("First string exists in second string");
		}
		else
		{
			System.out.println("First string do not exists in second string");
		}
	}

}
