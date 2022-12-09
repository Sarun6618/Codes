//Write a Java program that takes two numbers as input and display the product of two numbers.L-1 Hint

import java.util.Scanner;
 
public class Product {
 
 public static void main(String[] args) {
  //write code here
  Scanner scan =new Scanner(System.in);
  int num1=scan.nextInt();
  int num2=scan.nextInt();
  System.out.println(num2);
  scan.close();
  int product=num1*num2;
  System.out.println(num1+" x "+num2+" = "+product);
 }
  
}
