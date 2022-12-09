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
		void addatbegin(int d)
		{
			if(hptr==NULL)
			{
				node *temp=new node(d);
				hptr=temp;
			}
			else
			{
				node *nptr=new node(d);
				nptr->next=hptr;
				hptr=nptr;
			}
		}
		void append(int d)
		{
			if(hptr==NULL)
			{
				node *temp=new node(d);
				hptr=temp;
			}
			else
			{
			    node *temp=hptr;
				while(temp->next != NULL)
				{ 
				    temp=temp->next;
                }
			    node *nptr=new node(d);
			    temp->next=nptr;
				nptr->next=NULL;
			}
		}
	    void print()
        {
			node *temp = hptr;
            while (temp != NULL)
			 {
            cout << temp->data << " "<<endl;
            temp = temp->next;
        	}
        }
		void sumlen()
		{
			node *temp;
			temp=hptr;
			int s=0,c=0;
			while(temp!=NULL)
			{
				s+=temp->data;
				c++;
				temp=temp->next;
			}
			cout<<"\n sum of data "<<s<<endl;
			cout<<"\n length of linked list "<<c<<endl;
		}
		void max()
		{
			node*temp;
			temp=hptr;
			int max=hptr->data;
			while(temp!=NULL)
			{
				if(max<temp->data)
				{
					max=temp->data;
				}
				temp=temp->next;
			}
			cout<<"\n max element is :"<<max<<endl;
		}
		void min()
		{
			node*temp;
			temp=hptr;
			int min=hptr->data;
			while(temp!=NULL)
			{
				if(min>temp->data)
				{
					min=temp->data;
				}
			temp=temp->next;
			}
			cout<<"\n min element is :"<<min<<endl;
		}
		void reverse()
		{
			node *current=hptr,*prev=NULL,*next=NULL;
			while(current!=NULL)
			{
				next=current->next;
				current->next=prev;
				prev=current;
				current=next;
			}
			hptr=prev;
			cout<<"list revesed \n";
		}
		 void altele()
        {
			node *temp = hptr;
            while (temp != NULL) 
			{
            cout << temp->data << " "<<endl;
            temp = temp->next->next;
        	}
        }
};
int main()
{
	linkedlist a;
	/*
	a.append(5);
	a.addatbegin(60);
	a.addatbegin(50);
	a.append(10);
	a.append(20);
	a.append(30);
    a.append(40);
	a.display();
	a.max();
	a.min();*/
	int x,ch;
	while(1)
	{
		cout<<"\n 1.append\n 2.addatbegin\n 3.sum&lenth \n 4.print \n 5.max\n 6.min\n 7.reverse\n 8.for alternate data \n 9.exit \n enter your option :";
		cin>>ch;
	  switch(ch)
	  {
		case 1 : cout<<"\n enter any data to append = \n";
				 cin>>x;
				 a.append(x);
				 break;
		case 2 : cout<<"\n enter any value to be append at first = \n";
		         cin>>x;
				 a.addatbegin(x); 
				 break;
		case 3 : a.sumlen();
				 break;
	    case 4 : a.print();
				 break;
		case 5 : a.max();
				 break;
		case 6 : a.min();
				 break;
		case 7 : a.reverse();
		         break;
		case 8 : cout<<"alternate data are \n";
		         a.altele();
		         break;
		case 9 : exit(0);
		         break; 
	  }
	}
}