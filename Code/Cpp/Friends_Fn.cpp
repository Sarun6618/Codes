#include<iostream>
using namespace std;
class Frnd
{
    private:
    int mo_no;
    public:
    friend void show(Frnd);
};
void show(Frnd s)
{
    s.mo_no=123456789;
    cout<<s.mo_no;
}
int main()
{
    Frnd s;
    show(s);
}