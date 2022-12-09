#include<iostream>
using namespace std;
class Function
{
    public:
    static void fun();
};
void Function::fun()
{
    cout<<"We are in static function";
}
int main()
{
    Function f;
    Function::fun();
    return 0;
}