package StringPract;

public class Reverseword 
{
	public static void main(String[] args)
	{
			String str= "Pratiksha", 
			str1="";
			char ch;
				
			System.out.print("Word: ");
			System.out.println("Pratiksha"); 
				
			for (int i=0; i<str.length(); i++)
			{
				ch= str.charAt(i);
				str1= ch+str1;
			}
			System.out.println("Reversed word: "+ str1);
			System.out.println(str1.toUpperCase());
	}
}

