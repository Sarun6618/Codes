/*
Write a C++ program to
    define a base class Internals contains internal marks of 3 subjects
    define another base class Externals contains external marks of 3 subjects
    define a class Result derived from Internals and Externals, which finds 3 subject totals, total marks and average marks.
Expected Output:
Enter internal marks of 3 subjects : 24 23 22                                                                           
Enter external marks of 3 subjects : 70 56 88                                                                           
Three subject totals : 94 79 110                                                                                        
Total marks : 283                                                                                                       
Average marks : 94.3333            
*/
#include <iostream>
using namespace std;
class Internals {
//contains internal marks of 3 subjects
public:
int s1,s2,s3;
void in()
{
    cout<<"Enter internal marks of 3 subjects : ";
    cin>>s1>>s2>>s3;
}
};
class Externals {
//contains external marks of 3 subjects
public:
int e1,e2,e3;
void ex()
{
    cout<<"Enter external marks of 3 subjects : ";
    cin>>e1>>e2>>e3;
}
};
class Result: public Internals,public Externals{
//finds 3 subject totals, total marks and average marks.
public:
void add()
{
    int a=s1+e1,b=s2+e2,c=s3+e3;
    float f=a+b+c;
    float x=f/3;
    cout<<"Three subject totals : "<<a<<" "<<b<<" "<<c<<endl;
    cout<<"Total marks : "<<f<<endl;
    cout<<"Average marks : "<<x<<endl;
    
}
};
int main() {
    Result r;
    r.in();
    r.ex();
    r.add();
    return 0;
}