import java.util.*;
class demo
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int a=r.nextInt(),b=r.nextInt();
        //System.out.println(++a);
        //System.out.println(a++);//c=r.nextInt(),d=r.nextInt();
        //boolean e,f;
        //int c=(a++)+(a++)+(++b)+(++b);
        //System.out.println(c);
        //e=(a++>b)&(++c<=d);
        //System.out.println(a+" "+b+" "+c+" "+d);
        //f=(a++>b)&&(++c<=d);
        //System.out.println(a+" "+b+" "+c+" "+d);
        //System.out.println(a>>b);
        System.out.println(a&b);
        r.close();
    }
}