import java.util.*;
public class ReverseString
{
    public static void main(String[] args) 
    {
        //create object
        Scanner s=new Scanner(System.in);
        //declare string
        String str;
        System.out.println("Enter string: ");
        //read the string
        str=s.next(); 
        s.close();
        int j=str.length()-1;
        //call the function
        System.out.println("The reversed string is: " + reverseString(str,j));
    }
    public static String reverseString(String str,int j)
    {
        //logic
        char []ch=str.toCharArray();
        if(j<0){
            return "";
        }
        
        return ""+ch[j]+reverseString(str,j-1);
 
    }
}