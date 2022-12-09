#include<iostream>
using namespace std;
class Apple
{
    public:
    int operator +(int x)
    {
        int s=x;
        cout<<x<<endl;
        return 0;
    }
    int operator -()
    {
        cout<<"class of IT"<<endl;
        return 0;
    }
    int operator ++()
    {
        cout<<"class of CSE"<<endl;
        return 0;
    }
};
int main()
{
    Apple a;
    a.operator +(10);
    a.operator -();
    a.operator++();
    return 0;
}
