#include<iostream>
using namespace std;
int main()
{
    float Units,EC;
    cout<<"enter the number of units:";
    cin>>Units;
    if(Units>=1 && Units<100)
    {
        EC=Units*2;
        cout<<"Electric charges are:"<<EC<<endl;
    }
    else if(Units>=100 && Units<200)
    {
        EC=Units*3.50;
        cout<<"Electric charges are:"<<EC<<endl;
    }
    else
    {
        EC=Units*4.50;
        cout<<"Electric charges are:"<<EC<<endl;
    }
    return 0;
}