/* 
program: casting demo
@author: Rohit Kumar Bhagat
@date:18.10.2022
*/


import java.util.Scanner;

// declaring class
class CastingDemo

{
	public static void main(String args[])
	{
		// declaring short data types
		short s1=38;
		short s2=48;
		
		
		//calculating sum
		short sum;
		sum=(short)(s1+s2);
		
		//printing sum
		
		System.out.println("the sum is :"+sum);
	



/*
now using byte data type;
*/



byte b1=54;
byte b2=43;


byte cal;

cal=(byte)(b1+b2);


//calculating sum
          System.out.println("the sum of byte is :"+cal);
	}

}

