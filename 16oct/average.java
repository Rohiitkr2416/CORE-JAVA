/*
program:to find avergae using comand line argument
@author:Rohit Kumar bhagat
@date: 16/10/2022
*/
//declaring class
 class average
 {
  //declaring main
  public static void main(String args[])  
  { 
   //declaring variabels
   float number1=Float.parseFloat(args[0]);
   float number2=Float.parseFloat(args[1]);
   float number3=Float.parseFloat(args[2]);
   // calculating average
    float sum= number1+number2+number3;
	float avg=sum/3;
   //printing average
    System.out.println("average="+avg);   
  }//end main
 
 }//end class