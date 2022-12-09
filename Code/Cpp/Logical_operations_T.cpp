/* write a CPP program to perform logical operations on the given two integers
     Expected Output:
     Enter two integers: 7 0                                                                                                
     a&&b = 0                                                                                                                
     a||b = 1                                                                                                                
     !(a&&b) = 1   
 */
#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cout<<"Enter two integers: ";
    cin>>a>>b;
    cout<<"a&&b = "<<(a&&b)<<endl;
    cout<<"a||b = "<<(a||b)<<endl;
    cout<<"!(a&&b) = "<<!(a&&b)<<endl;
    return 0;
}
