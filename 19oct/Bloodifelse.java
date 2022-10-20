/*
program: check wheather you can donate you blood or not
@author: Rohit Kumar Bhagat
@date:19.10.2022
*/

// declaring class
import java.util.*;
class Bloodifelse
	
	{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int age;
	float weight;
	char gender;
	
	System.out.println("Enter Your age:");
	age=sc.nextInt();
	
	// check age
	if (age>18)
	{

System.out.print("Enter your gender (m/f):");
gender=sc.next().charAt(0);
System.out.println("Enter your weight:");
weight=sc.nextFloat();


if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
	System.out.println("You are eligible for donat blood...");

  else
	
System.out.println("You are not eligible for donate blood");
	}
	else
		System.out.println("YOu are too young please wait ...");
	}
	// end main
	
	}
	//end of class