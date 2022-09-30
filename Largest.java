
/*

 program : FIND LARGEST NUMBER BETWEEN TWO NUMBERS
 @author : NISHITA MANGLA
 @DATE : 29-09-2022

 */

package corejava;

import java.util.Scanner;

class Largest 	//declaring class
{

	public static void main(String[] args)	//calling main method
	{
	 
		Scanner sc = new Scanner(System.in); //creating object of scanner class
	
	 System.out.println("Enter first number :");	//taking input from user
	 int a = sc.nextInt();
	 
	 System.out.println("Enter second number :");	//taking input from user
	 int b = sc.nextInt();
  
	 // using if else statement
	 
	 if(a>b)
 {
	 System.out.println("first number is greater");	//printing statement
 }
 else
 {
	 System.out.println("second number is greater");	//printing statement
 }
	}

}
