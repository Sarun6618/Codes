//1.Write a program to perform the following operations on singly linked list:
//i)Creation	ii) Insertion	iii) Deletion	iv) Traversal	v) length of the linked list

#include<iostream>
using namespace std;
class Node
{
 public:
 int data;
 Node *next;

 Node(int d)
 { data=d;
   next=NULL;
 }
 };
 
 class Linkedlist
 { 
   public:
   Node *hptr=NULL;
   
   void create(int d)
   {
      if(hptr==NULL)
   { Node *temp=new Node(d);
     hptr=temp;
   }
     else
	 {
     	 Node *temp=hptr;
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
    	Node *t=hptr;
    	while(t!=NULL)
    	
    	 { 
    	  cout<<t->data<<"->";
    	  t=t->next;
    	} 
	}
	void  deletenode(int x)
	
	{
		
	if(hptr==NULL)
	{
		cout<<"List is empty\n";
		return;
	}
	Node *temp=hptr,*prev;
	while(temp!=NULL)
	{
		if(temp->data==x)
		{
			if(temp==hptr)
			{
				hptr=temp->next;
			}
			else
			{
				prev->next=temp->next;
			}
			cout<<"Node deleted\n";
			delete temp;
			return;
		}
		prev=temp;
		temp=temp->next;
	}
	cout<<"Element not found\n";
}
   
   void addatbeg(int x)
{
	Node *temp=hptr;
	Node *nn=new Node(x);
	
	if(nn==NULL)
	{
		cout<<"Unable to create node\n";
		return; 
	}
	  nn->next=temp;
	  hptr=nn;
	  
}

void addatpos(int x,int p)
{
	Node *temp=hptr;
	Node *nn=new Node(x);
	for(int i=1;i<p;i++)
	{
		temp=temp->next;
		if(temp==NULL)
		{
			create(x);
			return;
		}
	}
	nn->next=temp->next;
	temp->next=nn;
}
 void length()
    {
    	Node *t=hptr;
    	int len=0;
    	while(t!=NULL)
    	
    	 { 
    	  //cout<<t->data<<"->";
    	  t=t->next;
    	  len++;
    	} 
    	cout<<"length of the list:"<<len;
	}

};
 
 int main()
 { 
    Linkedlist l;
    int x,ch,ele,pos;
		
        while(1)
	{
		cout<<"\n1.Create\n";
		cout<<"2.Display\n";
		cout<<"3.Insertion_at_begin\n";
		cout<<"4.Insert_at_position\n";
		cout<<"5.Delete\n";
		cout<<"6.length\n";
		cout<<"7.exit\n";
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
			case 3:cout<<"Enter a value\n";
					cin>>x;
					l.addatbeg(x);
	 			        break;
	     	        case 4: cout<<"Enter a value\n";
				   cin>>x;
				   cout<<"enter the position\n";
				   cin>>pos;
				   l.addatpos(x,pos);
	 			   break;			
			case 5: cout<<"Enter a element to delete\n";
					cin>>ele;
        		                l.deletenode(ele); 
					break;
			
			case 6:l.length();
			        break;
			case 7:exit(0);
		}
	}
	return 0;
}