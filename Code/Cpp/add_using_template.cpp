#include<iostream>
using namespace std;
template<class v>
class A
{
    public:
    v num1=5.66;
    v num2=6.55;
    void add()
    {
        cout<<"Addition of num1 and num2:"<<num1+num2<<endl;
    }
};
int main()
{
    A<double> d;
    d.add();
}