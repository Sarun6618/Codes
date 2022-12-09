#include<iostream>
using namespace std;
class test
{
    int a,b;
    public:
    void read()
    {
        a=10;
        b=20;
    }
    void show()const//const is a keyward to constant number function
    {
        cout<<"a="<<a<<endl;
        cout<<"b="<<b<<endl;
    }
};
int main()
{
    test t;
    t.read();
    t.show();
    return 0;
}