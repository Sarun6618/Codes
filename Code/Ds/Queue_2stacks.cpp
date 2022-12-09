// CPP program to implement Queue using
// two stacks with costly enQueue()
#include<iostream>
#include<stack>
using namespace std;

class Queue 
{
    public:
	stack<int>s1,s2;
    void enQueue(int x)
	{
		while (!s1.empty()) 
        {
			s2.push(s1.top());
			s1.pop();
		}
		s1.push(x);
		while (!s2.empty()) 
        {
			s1.push(s2.top());
			s2.pop();
		}
	}
	int deQueue()
	{
		if (s1.empty()) 
        {
			cout << "Q is Empty";
			exit(0);
		}
		int x = s1.top();
        cout<<x<<endl;
		s1.pop();
		return x;
	}
};

int main()
{
    Queue myq;
	int ch,ele;
	while(1)
	{
		cout<<"\n1.Enqueue(insertion) 2.Dequeue(deletion) 3.display 4.exit\nEnter ur choice: ";
		cin>>ch;
		switch(ch)
		{
			case 1:cout<<"enter the element: ";
			       cin>>ele;
			       myq.enQueue(ele);
				   cout<<myq.deQueue()<<'\n';
			       break;
			case 2:myq.deQueue();
			break;
			case 3:exit(0);
		}
	}
	return 0;
}
