#include<iostream>
using namespace std;
class Me
{
    private:
    char name[10]="Mom";
    public:
    friend class Sarun;
};
class Sarun
{
    public:
    void namedisp(Me a)
    {
        cout<<a.name;
    }
};
int main()
{
    Me a;
    Sarun c;
    c.namedisp(a);
    return 0;
}