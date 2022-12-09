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
int main()
{
    CSE2 c;
    c.fun();//this is belong to parents.
    c.funn();//this is belong to child.
    return 0;
}