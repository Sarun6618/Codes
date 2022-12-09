//Check whether a number is even or odd using if...else
/*
Enter a number: 7                                                                                                       
7 is odd                                                                                                                
                                                                                                                        
  
*/
import java.util.Scanner;
public class Evenodd {  
    public static void main(String[] args) {
       //write code here
       Scanner in =new Scanner(System.in);
       System.out.println("Enter a number: ");
       int a=in.nextInt();
       in.close();
       if(a%2==0)
       {
           System.out.println(a+" is even");
       }
       else
       {
           System.out.println(a+" is odd");
       }
    }
}
