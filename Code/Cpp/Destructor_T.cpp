/*
     WAC++ Program to demonstrate the concept of Destructors
     Sample Input-Output:
     
     Inside Constructor                                                                                                      
     num1 = 10                                                                                                               
     num2 = 20                                                                                                               
     Inside Destructor                                  
     
                         
    
    */
#include<iostream>
using namespace std;
class CSE1
{
    public:
    CSE1()
    {
        int num1=10,num2=20;
        cout<<"Inside Constructor"<<endl;
        cout<<"num1 = "<<num1<<endl;
        cout<<"num2 = "<<num2<<endl;
    }
    ~CSE1()
    {
        cout<<"Inside Destructor"<<endl;
    }
};
int main()
{
    CSE1 E;
    return 0;
}
