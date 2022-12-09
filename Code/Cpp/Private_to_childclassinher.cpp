#include<iostream>
using namespace std;
class CSE1
{
    private:
    void fun()//private fun
    {
        cout<<"\nI'm the parent";
    }
    public:
    void out()//public fun bring fun as public.
    {
        fun();//then it became public.
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
    c.out();//this is belong to parents.
    c.funn();//this is belong to child.
    return 0;
}