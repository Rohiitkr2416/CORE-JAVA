/*
program: check greatest number
@author: Rohit Kumar Bhagat
@date:19.10.2022
*/
import java.util.*;
class Greatest

{
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Enter the 1st number:");
		n1=sc.nextInt();
		
		System.out.println("Enter the 12nd number:");
		n2=sc.nextInt();
	
		System.out.println("Enter the 3rd number:");
		n3=sc.nextInt();
		
		
		
		if((n1>n2)&&(n1>n3))
			System.out.println("The greatest no. is :"+n1);
		else if (n2>n3)
			System.out.println("The greatest no. is :"+n2);
		else
			System.out.println("the greatest number is :"+n3);
		
		
	}   // end main
	
	
	
	
}// end class