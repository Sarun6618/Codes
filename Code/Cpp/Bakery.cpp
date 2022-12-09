/*1. Write a C++ program which takes the price of bakery items ranging from 0-999
if you enter PKR 1-200 it should show cakes
if PKR 200 – 400 SHOW BISCUITS
if PKR 400- 700 show miscellaneous
if PKR 700 – 999 show ice cream
your program  should run 3 times using While loop
in the end also take the average of all items price */
#include<iostream>
using namespace std;
int main()
{
    int price;
    int items;
    int n;
    cout<<"Enter the number of items:";
    cin>>n;
    while(items<n)
    {
        cout<<"price of bakery items:";
        cin>>price;
        if(price<=200)
        {
            cout<<"cakes"<<endl;
        }
        else if(price>200 && price<=400)
        {
            cout<<"biscuits"<<endl;
        }
        else if(price>400 && price<=700)
        {
            cout<<"miscellaneous"<<endl;
        }
        else
        {
            cout<<"icecream"<<endl; 
        }
        items++;
    }
}
