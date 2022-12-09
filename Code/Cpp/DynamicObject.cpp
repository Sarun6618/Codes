#include<stdio.h>
#include<iostream>
using namespace std;
class Actor
{
    char Actor_name[20];
    char Actor_movie[20];
    public:
    void getName()
    {
        cout<<"Enter Actor name\n";
        cin>>Actor_name;//cin>>Actor_name(Diff of cin and gets is space can't taken in cin but gets can work with that)//
        cout<<"Enter Actor movie\n";
        cin>>Actor_movie;
    }
    void showName()
    {
        cout<<"Actor_name: "<<Actor_name<<endl;
        cout<<"Movie: "<<Actor_movie<<endl;
    }
};
int main()
{
    int i,n;
    Actor *a;
    cout<<"Enter how many entries you wanna make\n";
    cin>>n;
    a=new Actor[n];
    for(i=0;i<n;i++)
    {
        a[i].getName();
        a[i].showName();
    }
}