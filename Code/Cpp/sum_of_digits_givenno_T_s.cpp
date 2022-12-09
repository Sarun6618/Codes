/*Shyam is waiting in a room and he saw some numbers,he wants to calculate all possible sum of that number but he finds difficulty in calculate possible sum of it.help hime by writing suitable program.
Note:Consider number as string
example:345=3+4+5+34+45+345*/
#include<iostream>
#include<string>
#include<math.h>
using namespace std;
int main()
{
    string num;
    cout<<"Enter the string number:";
    cin>>num;
    int s,i,l,sum=0,j,k;
    l=num.length();
    for(int k=1;k<=l;k++)
    {
        s=stoi(num);//string to integer
        int p=pow(10,k);
        while(s>=(p/10))
        {
            i=s%(p);
            sum+=i;
            s=s/(10);
        }
    }
    cout<<sum;
}