/*
 Program : find reverse number
 @Author : Nishita
 Date : 06october2022
 */
package corejava;

import java.util.Scanner;

public class reversenumber //declaring class
{

	public static void main(String[] args) //calling main method
	{
		int number = 6754, reverse = 0, remainder;
		
		System.out.println(" Enter a number :"+ number); //printing a statement
		
		while(number!=0) //using while loop statement
		{
			remainder = number% 10;
			reverse = reverse* 10 + remainder;
			number = number/ 10;
		}
		System.out.println(" Reverse of a number is : " +reverse); //printing reverse number
		}

}
