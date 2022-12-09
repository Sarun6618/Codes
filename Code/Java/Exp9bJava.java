import java.util.*;
class Exp9bJava
{
public static void main(String args[])
 { 
 Scanner input = new Scanner(System.in); 
 
 HashMap<String, String>mapOne = new HashMap<String, String>();
 HashMap<String, String>mapTwo = new HashMap<String, String>(); 
 
 System.out.print("Enter how many pairs in HashMap 1 : "); 
 int mapOneSize = input.nextInt();
 input.nextLine(); 
 
 System.out.println("Enter your " + mapOneSize + " pair of String ");
 for(int i = 0; i<mapOneSize; i++)
 { 
 System.out.println("Enter Pair " + (i+1));
 String pairs[] = input.nextLine().split(" ");
 mapOne.put(pairs[0],pairs[1]); 
 } 
 
 System.out.print("Enter how many pairs in HashMap 2 : "); 
 int mapTwoSize = input.nextInt();
 input.nextLine(); 
 System.out.println("Enter your " + mapTwoSize + " pair of String ");
 for(int i = 0; i<mapTwoSize; i++)
 { 
 System.out.println("Enter Pair " + (i+1));
 String pairs[] = input.nextLine().split(" ");
 mapTwo.put(pairs[0],pairs[1]); 
 } 
 int result = commonKeyValuePairs(mapOne,mapTwo); 
 
 System.out.println("The number of key/value pairs are : " + result);
 
 input.close(); 
 } 
public static int commonKeyValuePairs(HashMap<String, String> map1 , 
HashMap<String, String> map2) 
 { 
 int count = 0; 
 for(Map.Entry m1:map1.entrySet())
 { 
 for(Map.Entry m2:map2.entrySet()) 
 { 
 if(m1.getKey().equals(m2.getKey())&&m1.getValue().equals(m2.getValue())) 
 { 
 count++; 
 } 
 } 
 } 
 return count;
 } 
}