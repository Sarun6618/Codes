#include<iostream>
using namespace std;
class Decimal
{
    protected:
    int i=1,j=n,n,binaryn=0;
    public:
    Decimal()
    {
        cout<<"Enter Decimal Number:";
        cin>>n;
        for(j=n;j>0;j=j/2)
        {
            binaryn=binaryn+(n%2)*i;
            i=i*10;
            n=n/2;
        }
    }
    friend int show(Decimal);
};
int show(Decimal A)
{
    cout<<"binary number="<<A.binaryn<<endl;
    return 0;
}
int main()
{
    Decimal A;
    show(A);
    return 0;
}