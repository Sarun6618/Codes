#include<iostream>
using namespace std;
class CSE
{
    public:
    void fu()
    {
        cout<<"\nI'm the parent1";
    }
};
class CSE1
{
    public:
    void fun()
    {
        cout<<"\nI'm the parent2";
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
class CSE3: public CSE1,public CSE//hybrid child class dervied class
{
    public:
    void Chill()
    {
        cout<<"\nI'm the Hybrid child";
    }
};
int main()
{
    CSE2 c;
    CSE3 c1;
    c1.fu();
    c1.fun();//this is belong to parents.
    c.funn();//this is belong to child.
    c1.Chill();
    return 0;
}