#include<iostream>
using namespace std;
int main()
{
int p,q;
cout<<"\nEnter the values of p and q:\n";
cin>>p>>q;
int j;
j=p>q?0:1; //condition operator that determines whether p>q, if yes assign j=0 else j=1
try
{
if(j==0) //condition that verifies whether j-0 or not
{
cout<<"substration of (p-q)"<<"\n"; //perform sbustration j=0
}
else
{
throw(j); //throw exception if j?0
}
}
catch(int i)
{
cout<<"the exception is caught: j="<<j<<"\n"; //display the detected exception on screen
}
return 0;
}
