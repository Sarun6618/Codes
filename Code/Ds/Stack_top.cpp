//implementing stack basic operations using arrays
#include <bits/stdc++.h>
using namespace std;
#define MAX 10
class Stack
{
	int top;
	public:
		int a[MAX];  //maximum size of stack
		Stack()
		{
			top=-1;
		}
		void push(int x);
		int pop();
		int peek();
		bool isEmpty();
		void display()
		{
			cout<<"The elements of stack are \n";
			int i;
			for(i=top;i>=0;i--)
			{
				cout<<a[i]<<endl;
			}
		}
};
void Stack::push(int x)
{
	if(top>=(MAX-1))
	{
		cout<<"Stack overflow";
	}
	else
	{
		a[++top]=x;
		cout<<x<<" pushed into stack \n";
	}
}
int Stack::pop()
{
	if(top<0)
	{
		cout<<"Stack underflow ";
		return 0;
	}
	else
	{
		int x= a[top--];
		return x;
	}
}
int Stack::peek()
{
	if(top<0)
	{
		cout<<"stack is empty";
		return 0;
	}
	else
	{
		int x=a[top];
		cout<<"the top element of stack "<<x;
	}
	return 0;
}
int main()
{
	Stack s;
	int ch,ele;
	while(1)
	{
		cout<<"\n1. push 2. pop  3. display  4. peek  5.exit\n";
		cin>>ch;
		switch(ch)
		{
			case 1: cout<<"enter the element";
					cin>>ele;
					s.push(ele);
					break;
			case 2: cout<<"deleted "<<s.pop()<<endl;
					break;
			case 3: s.display();
			        break;
			case 4: s.peek();
			        break;
			case 5: exit(0);
	
		}
	}
}
