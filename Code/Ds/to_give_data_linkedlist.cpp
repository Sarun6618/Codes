#include<iostream>
using namespace std;
class Node
{
	public:
	int data;
	Node *next;
	Node(int d)
	{
		data=d;
		next=NULL;
	}
};
class Linkedlist
{
	public:
	Node *head=NULL;
	void create(int d)
	{
	if(head==NULL)
	{
		Node *temp=new Node(d);
		head=temp;
	}
	else
	{
		Node *temp=head;
		while(temp->next!=NULL)
		{
			temp=temp->next;
		}
		Node *nptr=new Node(d);
		temp->next=nptr;
	}
    }
    void display()
    {
    	Node *t=head;
    	while(t!=NULL)
    	{
    		cout<<t->data;
    		t=t->next;
    		
		}
	}
};
int main()
{
	Linkedlist l;
	int x,ch;
	    while(1)
	{
		cout<<"\n1.create\n";
		cout<<"\n2.display\n";
		cout<<"\n3.exit\n";
		cout<<"Enter choice\n";
		cin>>ch;
		switch(ch)
		{
			
			case 1:cout<<"Enter a value\n";
			       cin>>x;
			       l.create(x);
			            break;
			case 2: l.display();
			            break;
			case 3:exit(0);
		}
	}
}
