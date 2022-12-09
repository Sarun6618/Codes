#include<iostream>
using namespace std;
void func_a() throw (int) 
{
cout<<"\n func_a() Start ";
throw 50;
cout<<"\nfunc_a() End "; 
}
void func_b() throw(int)
{
cout<<"\n func_b() Start";
func_a();
cout<<"\n func_b() End";
}
void func_c() throw(int)
{
cout<<"\n func_c Start";
try
{
func_b();
}
catch(int i)
{
cout<<"\n Caught Exception:"<<i;
}
cout<<"\n func_c() End";
}
int main()
{
func_c();
getchar();
return 0; 
}

/*Output:
func_c() Start
func_b() Start
func_a() Start
Caught Exception :50
Func_c end.         
*/
