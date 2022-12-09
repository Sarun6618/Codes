#include<iostream>
using namespace std;
class CSE1
{
    public:
    CSE1()
    {
        cout<<"\nI'm the parent";
    }
};
class CSE2: public CSE1 //child is the dervied class
{
    public:
    CSE2()
    {
        cout<<"\nI'm the Child";
    }
};
int main()
{
    CSE2 c;
    return 0;
}