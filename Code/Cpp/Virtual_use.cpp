#include<iostream>
using namespace std;
class Base
{
    protected:
    int b;
};
class C1: public virtual Base
{
    protected:
    int c1;
};
class C2: public virtual Base
{
    protected:
    int c2;
};
class Ch: public C1,C2
{
    public:
    int ch;
    void read()
    {
        cout<<"Give the input values for b,c1,c2,ch =";
        cin>>b>>c1>>c2>>ch;
    }
    void display()
    {
        cout<<"b="<<b;
        cout<<"\nc1="<<c1;
        cout<<"\nc2="<<c2;
        cout<<"\nch="<<ch;
    }
};
int main()
{
    Ch h;
    h.read();
    h.display();
    return 0;
}
