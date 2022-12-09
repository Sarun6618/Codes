import java.util.*;
public class Exp1aJava
{ 
public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{ 
for(int j=1;j<=n;j++)
{ 
 if(i==(j+1)*j) 
System.out.println(i); 
} 
}
sc.close(); 
} 
}