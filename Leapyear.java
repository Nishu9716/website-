/*
 Program : find leap year
 @Author : Nishita
 Date : 06october2022
 */

package corejava;

import java.util.Scanner;

public class Leapyear  //declaring class
{

	public static void main(String[] args)  //calling main method
	{
		System.out.println("Enter a year :"); // printing statement
		
		Scanner sc= new Scanner(System.in); //creating object of scanner class
		int  year = sc.nextInt();   //taking input from the user
		
		if (((year % 4 ==0)&& (year % 100 !=0))||(year % 400 == 0))  // using if-else statement
			System.out.println("This year is a leap year");
		else
			System.out.println("This year is not a leap year");

	}

}
