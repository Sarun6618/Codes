class MyRectangle
{ 
    public int v1x;
    public int v1y;
    public int v2x;
    public int v2y;
    public MyRectangle(int ver1x,int ver1y,int ver2x,int ver2y)
    {
        v1x=ver1x;
        v1y=ver1y;
        v2x=ver2x;
        v2y=ver2y;
    }
    public int area()
    {
        int area =Math.abs((v1x-v2x)*(v2y-v1y));
        return area;
    }
    Class MySquare: [(10,30);(15,35)];
    Area = 25;
    public MyRectangleoverlap(MyRectanglerect)
    {
        int x1=Math.max(v1x ,rect.v1x); 
        int y1=Math.max(v1y ,rect.v1y);
        int x2=Math.min(v2x ,rect.v2x);
        int y2=Math.min(v2y ,rect.v2y);
        if(x1>x2 || y1>y2)
        {
            MyRectangle m1=new MyRectangle(0,0,0,0);
            System.out.println("why");
            return m1;
        }
        else
        {
            MyRectangle m2=new MyRectangle(x1,y1,x2,y2);
            return m2;
        }
    } 
}
class Exp5Java extends MyRectangle 
{
    public int xcor;
    public int ycor;
    public int length;
    public Exp5Java(int xcord,int ycord,int leng)
    {
        xcor=xcord;
        ycor=ycord;
        length=leng; 
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int len=sc.nextInt();
        Exp5Java square =new Exp5Java(x,y,len);
        System.out.println(square.area());
    }
    public int area()
    {
        int area = len*len;
        return area;
    }
    public void toString()
    {
        System.out.println("Class MySquare:[(x,y);(x+len,y+len)]");
        System.out.println(square.area());
    } 
}