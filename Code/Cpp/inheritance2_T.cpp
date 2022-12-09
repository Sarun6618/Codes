/*
Write a C++ program to
    define a base class Polygon contains width and height
    define a derived class Rectangle from Polygon which finds the area of rectangle
    define another derived class Triangle from Polygon which finds the area of triangle
Expected Output:
Enter width and height of a rectangle : 4 6                                                                             
Enter width and height of a triangle : 5 9                                                                               
Area of rectangle = 24                                                                                                  
Area of triangle = 22.5                                                                                                 
                                                                                                                        
}
*/
#include <iostream> 
using namespace std;
class Polygon {
public:
int w,h;
void rec()
{
    cout<<"Enter width and height of a rectangle : ";
    cin>>w>>h;
}
void tri()
{
    cout<<"Enter width and height of a triangle : ";
    cin>>w>>h;
}
};
class Rectangle: public Polygon  {
public:
int Rec()
{
    double f=w*h;
    return f;
}
};
class Triangle: public Polygon  {
public:
double Tri()
{
    float e=float (w*h)/2;
    return e;
}
};
int main() {
    Rectangle r;
    Triangle t;
    r.rec();
    t.tri();
    cout << "Area of rectangle = " << r.Rec() << endl;
    cout << "Area of triangle = " << t.Tri() << endl;
    return 0;
}