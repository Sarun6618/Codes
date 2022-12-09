//Write a Java program that takes a number as input and prints its multiplication table upto 10.
/*
1 case=1
    2 input=7
    3 output=7 x 1 = 7                                                                                                               
    4 7 x 2 = 14                                                                                                              
    5 7 x 3 = 21                                                                                                              
    6 7 x 4 = 28                                                                                                              
    7 7 x 5 = 35                                                                                                              
    8 7 x 6 = 42                                                                                                              
    9 7 x 7 = 49                                                                                                              
   10 7 x 8 = 56                                                                                                              
   11 7 x 9 = 63                                                                                                              
   12 7 x 10 = 70                                                                                                             
   13  
*/
import java.util.Scanner;
 
public class Multiplicationtable {
 
 public static void main(String[] args) 
 {
  //write code here 
  Scanner scan =new Scanner(System.in);
  int num1=scan.nextInt();
  for(int i=1;i<=10;i++)
  {
      System.out.println(num1+" x "+i+" = "+num1*i);
}
      
}
}