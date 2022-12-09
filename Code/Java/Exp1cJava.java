import java.util.*;
public class Exp1cJava
{ 
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("has the player played for india[y/n]?:"); 
 String ch=sc.next(); 
 System.out.println("enter the no of test matches he has played:"); 
 int test_matches=sc.nextInt();
 System.out.println("enter the no of ODI matches he has played:"); 
 int ODI_matches=sc.nextInt();
 System.out.println(" no of man of the matches he has won:");
 int man_of_the_matches=sc.nextInt(); 
 float amount=0.0f; 
 if(test_matches>10 &&ODI_matches>100){
 amount+=50000; 
 sc.close();
 } 
 else if(test_matches>10){
 amount+=25000; 
 
 } 
 else if(ODI_matches>100){
 amount+=15000; 
 } 
 else if(ch.equals('y')){
 amount+=10000; 
 } 
 amount=amount+(amount*(man_of_the_matches*0.25f)); 
 System.out.println(amount); 
 } 
} 