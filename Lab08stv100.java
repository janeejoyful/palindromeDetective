// Lab08stv100.java
// Janee Yeak
// 24 November 2020
// This program determines whether or not the entered string is a palindrome, and is not
// case sensitive. For example, Madam, MaDAM, maDam, MADAm, etc. are all palindromes.

import java.util.Scanner;

public class Lab08stv100
{
	public static void main (String args[])
	{
		System.out.println("\nLab08v80\n");
      Scanner input = new Scanner(System.in);
		boolean notFinished = false;
		do
		{
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));	 
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			String repeat = input.nextLine();
			notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
			System.out.println();
		}
		while (notFinished);
	}
}

class Palindrome
{
	public static boolean isPal(String s)
	{
      String s2 = s.toLowerCase();
      
      int s2Length = s2.length();
      
      String reverseS2 = "";
 		
      for (int i = s2Length - 1; i >= 0; i--) 
      {
			reverseS2 = reverseS2 + s2.substring(i,i + 1);
		}
    
		if (s2.equals(reverseS2))
			return true;
		else
			return false;

	}  
  
   private static boolean isLetter(char s)
   {     
        boolean booleanS = Character.isLetter(s);
                 
         if (booleanS = true)
			    return true;
		   else
			    return false;
   }
   
  	private static String purge(String s)
	{
      String s2 = s.replaceAll(" ",""); 
      String s3 = s2.replaceAll("[^a-zA-Z0-9]", ""); 
      String s4 = s3.toLowerCase(); 
      return s4;        
	}
   
   public static boolean almostPal(String s)
	{
      boolean sIsPal = isPal(s);
      
      if (sIsPal != true)
         return isPal(purge(s));   
      else
         return false;
      
   }

}


