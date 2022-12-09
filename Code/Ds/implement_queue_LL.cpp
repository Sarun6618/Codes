#include <iostream>
using namespace std;

class QNode 
{
    public:
	int data;
	QNode* next;
	QNode(int d)
	{
		data = d;
		next = NULL;
	}
};

class Queue 
{
    public:
	QNode *front, *rear;
	Queue()
	{
		front = rear = NULL;
	}

	void enQueue(int x)
	{
		QNode* temp = new QNode(x);
		if (rear == NULL) 
        {
			front = rear = temp;
			return;
		}
		rear->next = temp;
		rear = temp;
	}
	void deQueue()
	{
		if (front == NULL)
        cout<<"Queue is empty!!"<<endl;
		QNode* temp = front;
        cout<<temp->data<<endl;
		front = front->next;
		if (front == NULL)
			rear = NULL;
		delete (temp);
	}
    void displayQueue()
    {
        QNode* temp=front;
        if((front==NULL)&&(rear=NULL))
		{
			cout<<"Queue is empty!"<<endl;
            return;
		}
        cout<<"Queue elements are: ";
        while(temp!=NULL)
        {
            cout<<temp->data<<" ";
            temp=temp->next;
        }
        cout<<endl;
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
