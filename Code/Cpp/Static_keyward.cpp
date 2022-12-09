#include<iostream>
using namespace std;
class A
{
    public:
    static int a;
};
int A::a=10;
int main()
{
    A b;
    cout<<A::a;//b.a instead of scope we can call b.a by object//
    return 0;
}