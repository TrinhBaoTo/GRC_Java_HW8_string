// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #7, 10/19/19

// This program's behavior is to accepts two parameters: 
//a string and an integer representing a length.
//The method should pad the parameter string with spaces 
//OR stars "*"  until its length is the given size 
// It should then RETURN the new string. 

import java.util.Scanner;


public class HW8
{// open class

   public static void main(String[] args)
   {//open main
      Scanner coefficients = new Scanner(System.in);
       //open scanner class
   
      System.out.print("Please type in a String: ");
      String s = coefficients.nextLine();
      //input for string s
      System.out.print("Please type in an integer: ");
      int c = coefficients.nextInt();
      //input for integer c
    
      String newString=padString(s,c);
      //call method 
      
      System.out.println(newString);
      //print result with input
      
      System.out.println();
      
      System.out.println(padString("Hello",8));
      System.out.println(padString("Danger",7));
      System.out.println(padString("Good morning",6));
      System.out.println(padString("Good afternoon",5));
      System.out.println(padString("Safe",4));
      //print with 5 different examples
      
   }//end main
   
   public static String padString(String b,int c)
   {//open static method
    String newString=b;
    
    int count=b.length();
    //find length of the string
    
    String s="*";
    
    for (int j=count; j<c ;j++)
    {
      newString=newString+s;
    }
    //for loop when string is shorter than the word
      
    for (int j=count; j>=c ;j++)
    {
      newString=newString;
    }
    //for loop when string is longer than the word
    
    return newString;
   }//end static method
   
}//end class

  