/* write a CPP program to perform arithmatic operations on the given two integers
    Expected Output:
     Enter two integers: 4 2                                                                                                
     a+b = 6                                                                                                                 
     a-b = 2                                                                                                                 
     a*b = 8                                                                                                                 
     a/b = 2                                                                                                                 
     a%b = 0                                                                                                                 
*/
#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"Enter two integers: ";
    cin>>a>>b;
    cout<<"a+b = "<<(a+b)<<endl;
    cout<<"a-b = "<<(a-b)<<endl;
    cout<<"a*b = "<<(a*b)<<endl;
    cout<<"a/b = "<<(a/b)<<endl;
    cout<<"a%b = "<<(a%b)<<endl;
}