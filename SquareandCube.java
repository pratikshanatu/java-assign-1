package StringPract;

import java.util.Scanner;

	interface Printable  
	{
		void print();
	}
	interface Calculate
	{
		void cal();
	}
	class Square implements Printable,Calculate
	{
		int a,s;
			public void cal()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number:");
				a=sc.nextInt();
				s=a*a;
			}
			public void print()
			{
				System.out.println("Square is" +s);
			}
	}
	
	class Cube implements Printable,Calculate
	{
		int a,c;
			public void cal()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number:");
				a=sc.nextInt();
				c=a*a*a;			
			}
			public void print()
			{
				System.out.println("Cube is"  +c);
			}
	}

public class SquareandCube 
{
	public static void main(String[] args) 
	{
			Square x=new Square();
			x.cal();
			x.print();
			
			Cube y=new Cube();
			y.cal();
			y.print();
	}

}
