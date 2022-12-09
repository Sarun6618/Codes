#include<iostream>
#define MAX_SIZE 3
using namespace std;
class Queue
{
	private:
	int myqueue[MAX_SIZE],front,rear;
	public:
	Queue()
	{
		front=-1;
		rear=-1;
	}
	bool isFull()
	{
		if(front == 0 && rear == MAX_SIZE-1)
		{
			return true;
		}
		return false;
	}
	bool isEmpty()
	{
 		if(front == -1) return true;
		else return false;
	}
	void enQueue(int value)
	{
		if(isFull())
		{
			cout<<endl<<"Queue is full!!";
		}
		else
		{
			if(front == -1) front =0;
			rear++;
			myqueue[rear]=value;
			cout<<value<<" ";
		}
	}
	int deQueue()
	{
		int value;
		if(isEmpty())
		{
			cout<<"Queue is empty!!"<<endl;return(-1);
		}
		else
		{
			value=myqueue[front];
			if(front>=rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
			cout<<endl<<"Deleted=>"<<value<<"from myqueue";
			return(value);
		}
	}
	void displayQueue()
	{
		int i;
		if(isEmpty())
		{
			cout<<endl<<"Queue is empty!"<<endl;
		}
		else
		{
			cout<<endl<<"front=" <<front;
			cout<<endl<<"Queue elements:";
			for(i=front;i<=rear;i++)
			cout<<myqueue[i]<<"\t";
			cout<<endl<<"rear="<<rear<<endl;
		}
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
			       break;
			case 2:myq.deQueue();
			       break;
			case 3:myq.displayQueue();
			       break;
			case 4:exit(0);
		}
	}
	return 0;
}