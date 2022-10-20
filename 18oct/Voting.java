/*
 program:to check person is able for vote
 @author:Rohit Kumar Bhagat
 @date:18/10/2022
*/
//declaring pcakage
import java.util.*;
//declaring class
class Voting


{
 public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 
	 
	 System.out.println("enter the voter's name ");
	 String name=sc.next();
	 
	 
     System.out.println("enter the voter's age");
     int age=sc.nextInt();
	 
	 
	 
	 if(age>=18)	 
     System.out.println(name+" can vote");	 
 
 
 
     else
     System.out.println(name+" can't vote");	 
  }
}