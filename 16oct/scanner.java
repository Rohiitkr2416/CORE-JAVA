/*
program: using of scanner class
@author: Rohit kumar bhagat
date:16oct2022

*/
//declaration of package
import java.util.Scanner;


//declaration of class
class scanner
 
 {
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);	
	
	//declaration of data type
	
	System.out.println("Enter Your name:");
	String Name=sc.next();
	System.out.println("Enter Your Age");
	int Age=sc.nextInt();
	System.out.println("Enter Your Marks");
	float marks=sc.nextFloat();
	System.out.println("Enter Your Gender m/f");
	char Gender=sc.next().charAt(0);
	System.out.println("Enter paas or Fail true/false");
	boolean pass=sc.nextBoolean();
	
	System.out.println("name:"+Name);
	System.out.println("Age:"+Age);
	System.out.println("Marks:"+marks);
	System.out.println("Gender:"+Gender);
	System.out.println("pass:"+pass);
	
	
	} 
	
 }