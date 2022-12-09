#include<iostream>
using namespace std;
class base1
{
    public:
    void show()
    {
        cout<<"Hello"<<endl;
    }
    virtual void print()
    {
        cout<<"1print"<<endl;
    }
};
class child1: public base1
{
    public:
    void show()
    {
        cout<<"Hi"<<endl;
    }
    void print()
    {
        cout<<"2print"<<endl;
    }
};
/*other*/
class base2
{
    public:
    virtual void show()
    {
        cout<<"Hello"<<endl;
    }
    void print()
    {
        cout<<"1print"<<endl;
    }
};
class child2: public base2
{
    public:
    void show()
    {
        cout<<"Hi"<<endl;
    }
    void print()
    {
        cout<<"2print"<<endl;
    }
};
int main()
{
    base1 *s1;
    child1 c1;
    s1=&c1;
    // virtual function, binded at runtime
    s1->show();
    // Non-virtual function, binded at compile time
    s1->print();
    /*other*/
    base2 *s2;
    child2 c2;
    s2=&c2;
    // virtual function, binded at runtime
    s2->show();
    // Non-virtual function, binded at compile time
    s2->print();
    return 0;
}