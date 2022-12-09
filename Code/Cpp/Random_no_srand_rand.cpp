#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;
int main()
{
    srand(time(0));
    for(int i=1;i<=5;i++)
    {
        cout<<rand()<<endl;
    }
    for(int i=1;i<=5;i++)
    {
        cout<<rand()<<endl;
    }
}