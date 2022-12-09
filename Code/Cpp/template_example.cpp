#include<iostream>
using namespace std;
template<class v>
void fun(v a)
{
    cout<<a<<endl;
}
int main()
{
    fun(10);
    fun('b');
    fun("Sarun");
}