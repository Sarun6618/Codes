#include<iostream>
using namespace std;
class CSE1
{
    public:
    void fun()
    {
        cout<<"\nI'm the parent";
    }
};
class CSE2: public CSE1//child is the dervied class
{
    public:
    void funn()
    {
        cout<<"\nI'm the Child";
    }
};
class CSE3: public CSE1//grandchild class dervied class
{
    public:
    void Chill()
    {
        cout<<"\nI'm the GrandChild";
    }
};
int main()
{
    CSE2 c;
    CSE3 c1;
    c.fun();//this is belong to parents.
    c.funn();//this is belong to child.
    c1.fun();
    c1.Chill();
    return 0;
}