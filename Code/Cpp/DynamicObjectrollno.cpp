#include<stdio.h>
#include<iostream>
using namespace std;
class Student
{
    long rollnum[20];
    char Name[20];
    public:
    void getrollnum()
    {
        cout<<"Enter Rollnum:\n";
        cin>>roll_num;//cin>>rollnum(Diff of cin and gets is space can't taken in cin but gets can work with that)//
        cout<<"Enter Name\n";
        cin>>Student_Name;
    }
    void showrollnum()
    {
        cout<<"Rollnum: "<<roll_num<<endl;
        cout<<"Name: "<<Student_Name<<endl;
    }
};
int main()
{
    int i,n;
    Student *a;
    cout<<"Enter how many entries you wanna make\n";
    cin>>n;
    a=new Student[n];
    for(i=0;i<n;i++)
    {
        a[i].getName();
        a[i].showName();
    }
}