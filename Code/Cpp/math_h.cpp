#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    double x;
    cout<<"Enter the value to get values:";
    cin>>x;
    cout<<"Sine value:"<<sin(x)<<endl;
    cout<<"Cosine value:"<<cos(x)<<endl;
    cout<<"Tangent value:"<<tan(x)<<endl;
    cout<<"Tangent value:"<<sqrt(x)<<endl;
    cout<<"Absolut value:"<<abs(x)<<endl;
    cout<<"Floor value:"<<floor(x)<<endl;
    cout<<"Absolute value:"<<fabs(x)<<endl;
    cout<<"arc cosine value:"<<acos(x)<<endl;
    cout<<"arc sine value:"<<asin(x)<<endl;
    cout<<"arc Tangent value:"<<atan(x)<<endl;
    cout<<"ceiling value:"<<ceil(x)<<endl;
    cout<<"Hyperbolic Cosine value:"<<cosh(x)<<endl;
    cout<<"Hyperbolic tangent value:"<<tanh(x)<<endl;
    cout<<"Log value:"<<log(x)<<endl;
    int y,z;
    cout<<"Enter the value to get power:";
    cin>>y>>z;
    cout<<"Power value:"<<pow(y,z)<<endl;
    cout<<"Hypotenuse:"<<hypot(y,z)<<endl;
    return 0;
}