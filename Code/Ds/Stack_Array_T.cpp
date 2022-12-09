/* C++ program to implement basic stack
operations using Array */
/*Sample Output:
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 1
enter the element 10
10 pushed into stack
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 1
enter the element 20
20 pushed into stack
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 1
enter the element 30
30 pushed into stack
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 1
enter the element 40
Stack Overflow
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 3
The elements of stack are 
30
20
10
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 2
deleted element: 30
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 3
The elements of stack are 
20
10
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 4
20:The top element of stack
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 2
deleted element: 20
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 
2
deleted element: 10
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 2
Stack Underflow
1.push  2.pop  3.display  4. peek 5.exit
Enter ur choice 5
*/
#include <bits/stdc++.h>
using namespace std;
#define MAX 3
class Stack {
      int top;
public:
    int a[MAX]; // Maximum size of Stack
    Stack() 
    { top = -1; 
    }
    void push(int x);
    int pop();
    int peek();
    bool isEmpty();
    void display() {
        cout<<"The elements of stack are \n";
        for(int i=top;i>=0;i--){
            cout<<a[i]<<endl;
        }
    }
};
void Stack::push(int x)
{
    if(top==MAX-1)
    {
        cout<<"Stack Overflow\n";
    }
    else
    {
        a[++top] = x;
        cout << x << " pushed into stack\n";
    }
}
int Stack::pop()
{
    int temp;
    if(top==-1)
     {
        cout<<"Stack Underflow\n";
        return(0);
     }
    else
    {
        temp=a[top];
        top=top-1;
        cout<<"deleted element: " <<temp<<endl;
    }
    return(temp);
}
int Stack::peek()
{
    if (top < 0) 
    {
        cout << "Stack is Empty";
        return 0;
    }
    else 
    {
        int x = a[top];
        cout<<x<<":The top element of stack";
        return 0;
    }
}
bool Stack::isEmpty()
{
    return (top < 0);
}
// Driver program to test above functions
int main()
{
    Stack s;
    int  ch,ele;
    while(1)
    {
         cout<<"\n1.push  2.pop  3.display  4. peek 5.exit\nEnter ur choice ";
         cin>>ch;
         switch(ch)
         {
            case 1: cout<<"enter the element ";
                    cin>>ele;
                    s.push(ele);
                    break;
            case 2: s.pop();
                    break;
            case 3: s.display();
                    break;
            case 4: s.peek();
                    break;
            case 5: exit(0);
         }
    }
    return   0;
}