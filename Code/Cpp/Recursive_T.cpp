/* Write a CPP program to find the fatorial of a given number using recursive function
     Expected Output:
     Enter any positive integer: 5                                                                                           
    Factorial = 120   
     */
#include<iostream>
using namespace std;
//declare the function
int factorial(int n);
int main()
{
    int i,N;
    cout<<"Enter any positive integer: ";
    cin>>N;
    cout << "Factorial = "<< factorial(N);
    return 0;
}
//define the function to find the factorial
int factorial(int N)
{
    if(N > 1)
        return N * factorial(N - 1);
    else
        return 1;
}