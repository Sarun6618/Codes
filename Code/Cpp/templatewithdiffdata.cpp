#include<iostream>
using namespace std;
template<class v,class c>
int fun(v a,c b)//Here we can use v or void at int fun without return
{
    cout<<a<<endl<<b<<endl;
    return 0;
}
int main()
{
    fun(10,'s');
    fun('b',"Sarun");
    fun("Sarun",true);
    return 0;
}