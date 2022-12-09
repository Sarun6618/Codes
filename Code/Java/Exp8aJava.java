import java.util.*;
class Exp8aJava 
{ 
public static void main(String[] args) 
 { 
 ArrayList<Employee>ar = new ArrayList<Employee>();
ar.add(new Employee("John",5)); 
ar.add(new Employee("Nic",3)); 
ar.add(new Employee("Roma",9)); 
 System.out.println("Unsorted Emp List"); 
 for (int i = 0; i<ar.size(); i++)
System.out.println(ar.get(i).toString());
 Collections.sort(ar, new Sortbyexp());
 System.out.println("Sorted by Experience"); 
 for (int i = 0; i<ar.size(); i++)
System.out.println(ar.get(i).toString());
 } 
} 
class Employee
{ 
 String empname; 
 int exp; 
 Employee(String empname, int exp) 
 { 
 this.empname= empname; 
 this.exp=exp; 
 } 
public String toString()
 { 
 return this.empname + " " + this.exp ; 
 } 
} 
class Sortbyexp implements Comparator<Employee> { 
 public int compare(Employee a, Employee b) 
 { 
 return a.exp - b.exp; 
 } 
} 
