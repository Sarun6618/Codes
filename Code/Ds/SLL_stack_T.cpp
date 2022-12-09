// C++ program to Implement a stack
//using singly linked list
/*Sample Output:
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
1
Enter Value:
10
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
1
Enter Value:
20
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
1
Enter Value:
30
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
4
30 20 10
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
3
Element at top is : 30
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
2
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
4
20 10 
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
2
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
4
10 
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
2
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
4
Stack is Empty
1.Push 2.Pop 3.showTop 4.displayStack 5.exit
5
*/
#include<iostream>
using namespace std;
//Structure of the Node
class Node
{
public:
int data;
Node *link;
};
class Stack1
{
    public:
// top pointer to keep track of the top of the stack
Node *top = NULL;
//Function to check if stack is empty or not
bool isempty()
{
 if(top == NULL)
 {
         return true;
 }
else
return false;
}
//Function to insert an element in stack
void push (int value)
{
    // Create new node temp and allocate memory
    struct Node* temp;
    temp = new Node();
 
    // Check if stack (heap) is full.
    // Then inserting an element would
    // lead to stack overflow
    if (!temp)
    {
        cout << "\nHeap Overflow";
        exit(1);
    }
 
    // Initialize data into temp data field
    temp->data = value;
 
    // Put top pointer reference into temp link
    temp->link = top;
 
    // Make temp as top of Stack
    top = temp;
}
//Function to delete an element from the stack
void pop ( )
{
        Node* temp;
 
    // Check for stack underflow
    if (top == NULL)
    {
        cout << "\nStack Underflow" << endl;
        exit(1);
    }
    else
    {
         
        // Top assign into temp
        temp = top;
 
        // Assign second node to top
        top = top->link;
 
        // Destroy connection between
        // first and second
        temp->link = NULL;
  
        // Release memory of top node
        free(temp);
    }
}
// Function to show the element at the top of the stack
void showTop()
{
        // Check for empty stack
    if (!isempty())
        cout<<"Element at top is : "<<top->data;
    else
        exit(1);
}
// Function to Display the stack
void displayStack()
{
 if ( isempty() )
  cout<<"Stack is Empty";
 else
 {
  Node *temp=top;
  while(temp!=NULL)
  {   cout<<temp->data<<" ";
   temp=temp->link;
  }
  cout<<"\n";
 }
 }
};
// Main function
int main()
{
  Stack1 s;
 int choice, flag=1, value;
 //Menu Driven Program using Switch
 while( flag == 1)
 {
 cout<<"\n1.Push 2.Pop 3.showTop 4.displayStack 5.exit\n";
 cin>>choice;
 switch (choice)
 {
 case 1: cout<<"Enter Value:\n";
         cin>>value;
         s.push(value);
         break;
 case 2: s.pop();
         break;
 case 3: s.showTop();
         break;
 case 4: s.displayStack();
         break;
 case 5: flag = 0;
         break;
 }
 }
   return 0;
}

/*
#include <iostream>
using namespace std;
//Structure of the Node
class Node
{
public:
int data;
Node *link;
};
class Stack1
{
    public:
// top pointer to keep track of the top of the stack
Node *top = NULL;
//Function to check if stack is empty or not
bool isempty()
{
 if(top == NULL)
 return true; else
 return false;
}
//Function to insert an element in stack
void push (int value)
{
    struct Node* temp;
    temp = new Node();
    if (!temp)
    {
        cout << "\nHeap Overflow";
        exit(1);
    }
    temp->data = value;
    temp->link = top;
    top = temp;
}
//Function to delete an element from the stack
void pop ( )
{
    Node* temp;
    if (top == NULL)
    {
        cout << "\nStack Underflow" << endl;
        exit(1);
    }
    else
    {
        temp = top;
        top = top->link;
        temp->link = NULL;
        free(temp);
    }
}
// Function to show the element at the top of the stack
void showTop()
{
    if (!isempty())
        cout<<"Element at top is : "<<top->data;
    else
        exit(1);
}
// Function to Display the stack
void displayStack()
{
 if ( isempty() )
  cout<<"Stack is Empty";
 else
 {
  Node *temp=top;
  while(temp!=NULL)
  {   cout<<temp->data<<" ";
   temp=temp->link;
  }
  cout<<"\n";
 }
 }
};
// Main function
int main()
{
  Stack1 s;
 int choice, flag=1, value;
 //Menu Driven Program using Switch
 while( flag == 1)
 {
 cout<<"\n1.Push 2.Pop 3.showTop 4.displayStack 5.exit\n";
 cin>>choice;
 switch (choice)
 {
 case 1: cout<<"Enter Value:\n";
         cin>>value;
         s.push(value);
         break;
 case 2: s.pop();
         break;
 case 3: s.showTop();
         break;
 case 4: s.displayStack();
         break;
 case 5: flag = 0;
         break;
 }
 }
   return 0;
}
*/
