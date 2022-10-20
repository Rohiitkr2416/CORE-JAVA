/*
Program: to check wheather it was pass or not.
@author:Rohit Kumar Bhagat
@Date: 19.10.2022
*/

import java.util.*;

//declaring class

class PassFail
{
	
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		
		
	System.out.println("Enter the first subject marks:" );
	
	float mark1=sc.nextFloat();
	
	
	System.out.println("Enter the second subject marks:" );
	
	float mark2=sc.nextFloat();
	
	
	System.out.println("Enter the third subject marks:" );
	
	
	float mark3=sc.nextFloat();
	
	float tot=(mark1 + mark2+ mark3);
	
	
	System.out.println("Total Marks"+tot);
	
	
	float per=((tot*100))/300;
	
	
	
	if(per>40)
		System.out.print("Congratulation :) you are pass:");
	
	else
		System.out.println("Sorry you are Fail:");
	
	
}

}
	
	
	