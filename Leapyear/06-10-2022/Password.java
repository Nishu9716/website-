/*
 Program : To check password is correct or not
 @Author : Nishita
 Date : 06october2022
 */


package corejava;

import java.util.Scanner;

public class Password  // declaring class
{

	public static void main(String[] args) //calling main method
	{
	 
		Scanner sc = new Scanner(System.in); //creating object of scanner class
	
		System.out.println("Enter username :"); //printing statement
	 String username = sc.nextLine();  //taking input from the user
	 
	 System.out.println("Enter password :");  //printing statement
	 int password = sc.nextInt(); //taking input from the user
	
	 if (password ==25836)  //using if-else statement
	 {
		 System.out.println(" Login successful"); //printing statement
	 }
	 else
	 {
		 System.out.println(" Login denied "); //printing statement
	 }
	 

	}

}
