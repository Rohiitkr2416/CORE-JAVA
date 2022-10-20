/*
program: to check odd or even
@Author:Rohit Kumar Bhagat
Date:18.10.2022

*/



import java.util.Scanner;
//declaring class

class OddEven
{
	
	// declaring main
	public static void main(String args[])
	{
	// creating scanner 
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the no.:");
	
	
	// declaring data type
	
	int n=sc.nextInt();
	
	if ((n%2)==0)
		System.out.println("The number is Even");
	else
		System.out.println("The number is odd");
}
}