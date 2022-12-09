import java.util.*;
class Exp9aJava
{ 
public static void main(String args[])
 { 
 Scanner input = new Scanner(System.in); 
 System.out.print("Enter a string : ");
 String str = input.next(); 
 
 Map<Character, Integer> result = new HashMap<Character, Integer>();
 result = fCount(str);
 
 for(int i = 0; i<str.length(); i++)
 { 
 if(result.get(str.charAt(i)) != 0)
 { 
System.out.print(str.charAt(i)+"-"+result.get(str.charAt(i)) + " ");
result.put(str.charAt(i), 0);
 } 
 } 
 
 input.close(); 
 } 
public static Map<Character, Integer>fCount(String str)
 { 
 Map<Character, Integer> map = new HashMap<Character, Integer>();
 
for(int i = 0; i<str.length(); i++)
 { 
 if(map.containsKey(str.charAt(i)))
 { 
 map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
 } 
 else
 { 
 map.put(str.charAt(i), 1);
 } 
 } 
 return map; 
 } 
}