#include<iostream>
#include<exception> 
using namespace std; 
void verify(int p) throw(int) 
{
if(p==1) 
throw p; 
cout<<"\nEnd of verify().function( )"; 
} 
int main()
{
try 
{
cout<<"p==1\n";
verify(1);
}
catch(int i)
{
cout<<"Interger exception is caught \n";
}
cout<<"\nEnd of main() function";
//getch();
return 0;
}
/*Output:
P==1 
Integer exception caught 
*/