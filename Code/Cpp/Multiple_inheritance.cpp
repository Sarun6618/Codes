#include<iostream>
using namespace std;
class CSE1//parents is the dervied class.
{
    public:
    void fun()
    {
        cout<<"\nI'm the parent1";
    }
};
class CSE2//parents is the dervied class.
{
    public:
    void funn()
    {
        cout<<"\nI'm the parent2";
    }
};
class CSE3: public CSE1,public CSE2//child class dervied class with both parents access.
{
    public:
    void Chill()
    {
        cout<<"\nI'm the Child";
    }
};
int main()
{
    CSE3 c;
    c.fun();//this is belong to parent1.
    c.funn();//this is belong to parent2.
    c.Chill();
    return 0;
}