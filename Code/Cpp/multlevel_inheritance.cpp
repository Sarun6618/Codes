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
class CSE2: public CSE1 //child is the dervied class
{
    public:
    void funn()
    {
        cout<<"\nI'm the Child";
    }
};
class CSE3: public CSE2//grandchild class dervied class
{
    public:
    void Chill()
    {
        cout<<"\nI'm the GrandChild";
    }
};
int main()
{
    CSE3 c;
    c.fun();//this is belong to parents.
    c.funn();//this is belong to child.
    c.Chill();
    return 0;
}