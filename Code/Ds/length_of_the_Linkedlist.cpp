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
		void lengthlist()
		{
			node *temp;
			temp=hptr;
			int s=0,c=0;
			while(temp!=NULL)
			{
				cout<<temp->data<<endl;
				s+=temp->data;
				c++;
				temp=temp->next;
			}
			cout<<"sum of data "<<s<<endl;
			cout<<"length of linked list "<<c<<endl;
		}
};
int main()
{
	linkedlist a;
	a.append(10);
	a.append(20);
	a.append(30);
	a.lengthlist();
}



