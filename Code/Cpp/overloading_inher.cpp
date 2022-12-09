#include<iostream>
using namespace std;
class CSE1
{
    public:
    void fun(float a)
    {
        cout<<"\nI'm the parent";
    }
};
class CSE2: public CSE1 //child is the dervied class
{
    public:
    void fun(int a)
    {
        cout<<"\nI'm the Child";
    }
};
int main()
{
    CSE2 c;
    c.fun(20);//this is belong to parents.
    c.fun(10.234);//this is belong to child.
    return 0;//its not possible overloading but it can over ride.
}