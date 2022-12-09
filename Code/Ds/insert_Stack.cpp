#include <iostream>
#include <stack>
using namespace std;
int main()
{
	stack<int>stack;
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.pop();
	while(!stack.empty())
	{
		cout<<stack.top()<<" ";
		stack.pop();
	}
}