/* C++ program to sort a stack using an auxiliary stack
Sample Input and Output:
Enter value to be pushed:                                                                                               
10                                                                                                                      
Do you want to add another element : press[y for yes and n for no]:y                                                    
Enter value to be pushed:                                                                                               
56                                                                                                                      
Do you want to add another element : press[y for yes and n for no]:y                                                    
Enter value to be pushed:                                                                                                
32                                                                                                                      
Do you want to add another element : press[y for yes and n for no]:y                                                    
Enter value to be pushed:                                                                                               
50                                                                                                                      
Do you want to add another element : press[y for yes and n for no]:n                                                    
Sorted numbers are:                                                                                                     
56 50 32 10                                                                                                         
            
.*/
#include <iostream>
#include<stack>
using namespace std;
stack<int> sortStack(stack<int> &input){
    
    //write your code here
    stack<int> tmpStack; 
  
    while (!input.empty()) 
    { 
        // pop out the first element 
        int tmp = input.top(); 
        input.pop(); 
  
        // while temporary stack is not empty and top 
        // of stack is greater than temp 
        while (!tmpStack.empty() && tmpStack.top() > tmp) 
        { 
            // pop from temporary stack and push 
            // it to the input stack 
            input.push(tmpStack.top()); 
            tmpStack.pop(); 
        } 
  
        // push temp in tempory of stack 
        tmpStack.push(tmp); 
    } 
    return tmpStack; 
};
int main()
{
    stack<int> input;
    char ans;
    int val;
    do{
        cout<<"Enter value to be pushed:"<<endl;
        cin>>val;
        input.push(val);
        cout<<"Do you want to add another element : press[y for yes and n for no]:"; 
        cin>>ans;
    } while(ans=='y');  
    stack<int> tmpStack = sortStack(input);
    cout << "Sorted numbers are:\n";
    while (!tmpStack.empty()){
        cout << tmpStack.top()<< " ";
        tmpStack.pop();
    }
}