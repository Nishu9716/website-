/*
 Program : Create reverse pyramid
 @Author : Nishita
 Date : 06october2022
 */

package corejava;

public class Pyramid  //declaring class
{

	public static void main(String[] args) //calling main method
	{
		int i,j, row=10;
		for(i=row;i>=1;--i) //using for loop
		{
		 for(j=1;j<= i;++j) //using for loop
		 {

			 System.out.print(" * "); //printing * pyramid
		}
		 System.out.println(" "); //printing space
		}
	}
	}
