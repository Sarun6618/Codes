#include<iostream>
using namespace std;
class node
{
	public:
		int data;
        node *next;
		node(int d)
		{
			data=d;
			next=NULL;
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
			else{
			     node *temp=hptr;
				 while(temp->next != NULL){
					 temp=temp->next;
                 }
			     node *nptr=new node(d);
			     temp->next=nptr;
			    }
		}
		void display()
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
		void max_min()
		{
			node *temp;
			temp=hptr;
			int max=hptr->data;
			int min=hptr->data;
			while(temp!=NULL)
			{
				if(max<temp->data)
				{
					max=temp->data;
				}
				temp=temp->next;
			}
			while(temp!=NULL)
			{
				if(min>temp->data)
				{
					min=temp->data;
				}
				temp=temp->next;
			}
			cout<<max<<endl;
			cout<<min<<endl;
		}
};
int main()
{
	linkedlist a;
	a.append(10);
	a.append(20);
	a.append(30);
	a.display();
	a.max_min();
}