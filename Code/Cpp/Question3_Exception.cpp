#include<iostream> 
using namespace std; 
void number(int p) //defining a function called number with single argument 
{
try 
{
 if(p==0)
{
//if p is equal to zero throw exception 
throw 'p';
}
else 
if(p>0) 
{
throw 'q';
} 
else
if(p<0)
{
throw 'r';
}
cout<<"Try Block \n";
}
catch(char ch) //defining single catch block 
{
cout<<"\n Exception caught\n";
}
}
int main()
{
number(0);
number(5);
number(-2);
return 0;
}
/*
Output
Exception caught
Exception caught
Exception caught
*/