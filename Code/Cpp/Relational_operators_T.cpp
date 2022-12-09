/* write a CPP program to perform relational operations on the given two integers
     Expected Output:
     Enter two integers: 5 2                                                                                                 
     a<b => 0                                                                                                                
     a>b => 1                                                                                                                
     a<=b => 0                                                                                                               
     a>=b => 1                                                                                                               
     a==b => 0                                                                                                               
     a!=b => 1 
*/
#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"Enter two integers: ";
    cin>>a>>b;
    cout<<"a<b => "<<(a<b)<<"\n";
    cout<<"a>b => "<<(a>b)<<"\n";
    cout<<"a<=b => "<<(a<=b)<<"\n";
    cout<<"a>=b => "<<(a>=b)<<"\n";
    cout<<"a==b => "<<(a==b)<<"\n";
    cout<<"a!=b => "<<(a!=b)<<"\n";
    return 0;
}