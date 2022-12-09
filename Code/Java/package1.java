//save by A.java  
package com.pack;  
public class A {  
    public void msg() {
        System.out.println("Hello");
    }  
}  

//save by B.java   
class package1 {  
    public static void main(String args[]) {  
        pack.A obj = new pack.A();  //using fully qualified name  
        obj.msg();  
    }  
}
