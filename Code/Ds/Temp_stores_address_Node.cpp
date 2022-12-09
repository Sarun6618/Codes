#include<iostream>
using namespace std;
class node
{
	public:
		int data;node *next;
		node(int d)
		{
			data=d;
			next=NULL;
		}
		void display()
		{
			cout<<data<<endl;
		}
};
class linkedlist
{
	public:
		node *hptr=NULL;
		void append(int d)
		{
			if(hptr==NULL)
			{
				node *temp=new node(d);
				hptr=temp;
			}
			node *temp=hptr;
			while(temp->next!=NULL)
			{
				temp=temp->next;
			}
			node *nptr=new node(d);
			temp->next=nptr;
		}
		void display()
		{
			node *temp;
			temp=hptr;
			while(temp!=NULL)
			{
				temp->display();// can use this cout<<temp->data<<endl;
				temp=temp->next;
			}
		}
};
int main()
{
	linkedlist a;
	a.append(10);
	a.append(20);
	a.append(30);
	a.display();
}

