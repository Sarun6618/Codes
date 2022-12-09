/* Write a CPP program to multiply using friend class.
     Sample Input-Output:
     Multiplication: 50 */
#include <iostream>
using namespace std;
     
// forward declaration
class ClassY;
    
class ClassX 
{
    private:
    int num1;
    // friend class declaration
    friend class ClassY;
    //code here
    public:
    // constructor to initialize num1 to 10
    ClassX() : num1(10) {}
};
class ClassY 
{
    private:
    int num2;
    public:
    // constructor to initialize num2 to 5
    ClassY() : num2(5) {}
    // member function to multiply num1
    // from ClassX with num2 from ClassY
    int multiply() 
    {
        //write code here
        ClassX objectX;
        return objectX.num1*num2;
    }
};
    
int main() 
{
    //code here
    ClassY objectB;
    cout<<"Multiplication: "<<objectB.multiply();
    return 0;
}