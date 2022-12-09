// 2.	Write a program to perform the following operations on doubly linked list:
// i)	Creation	ii)Insertion	iii)Deletion	iv)Traversal	v)Print the list in reverse

#include<iostream>
using namespace std;

class Node
{
    public:
  	  int data;
      Node *next;
 	  Node *prev;
  
       Node(int d)
       {
	     data=d;
       	 next=NULL;
       	 prev=NULL;
       }
       void display()
       {
  	      cout<<data<<endl;   
       }
};
class DLL
{
      public:
      Node *hptr=NULL;
      Node *tptr=NULL;
    
      void create(int d)
      {
           Node *nptr = new Node(d);
           if(hptr == NULL)
           {
                hptr = tptr = nptr;
           }
           else
           {
                tptr->next = nptr;
                nptr->prev = tptr;
                tptr = nptr;
           }
      }
     // add node at front / Beginning function
     void addatbeg(int d)
     {
           Node *nptr = new Node(d); // new allocate new node of type Node and return address in nptr
           if(hptr == NULL)
           {
                hptr = tptr = nptr;
           }
            else
           {
              hptr->prev = nptr;       // previous first node point to new node
             nptr->next = hptr;       // new node next point to previous first node whose address is in head                 
             hptr = nptr;              // head point to new node
           }
     }

    void delete_node(int d)
    {
        if(hptr->data == d){
            Node *temp = hptr;
            temp->next->prev = NULL;
            hptr = temp->next;
        }
        else
        {
          if(tptr->data == d)
          {
            Node *temp = tptr;
            temp->prev->next = NULL;
            tptr = temp->prev;
          }
          else
          {
            Node* temp = hptr;
            while(temp!=NULL)
            {
                if(temp->next!=NULL && temp->next->data == d)
                {
                    temp->next = temp->next->next;
                    temp->next->prev = temp;
                    break;
                }
                temp = temp->next;
                
            }
            if(temp == NULL)
            cout<<"Element Not Found!"<<endl;
          }
        }
    }
    void forward_display(){
        Node *temp = hptr;
        while(temp!=NULL){
            temp->display();
            temp = temp->next;
        }
    }
    void reverse_display()
    {
        Node *temp = tptr;
        while(temp!=NULL)
        {
            temp->display();
            temp = temp->prev;
        }
    }
};
int main()
{
    DLL dll;
    int ch, x , ele;
    while(1)
	{
		cout<<"\n1.Create\n";
		cout<<"2.Display\n";
		cout<<"3.Insertion_at_begin\n";
		cout<<"4.Insert_at_position\n";
		cout<<"5.Delete\n";
		cout<<"6.Print in reverse\n";
		cout<<"7.exit\n";
		cout<<"Enter choice\n";
		cin>>ch;
		switch(ch)
		{
			case 1:cout<<"Enter a value\n";
					cin>>x;
					dll.create(x);;
	 				break;
			case 2: cout<<"Elements of List "<<endl;
			        dll.forward_display();
			        break;
			case 3:cout<<"Enter a value\n";
				    cin>>x;
				     dll.addatbeg(x);
	 			     break;
	     	     /*   case 4: cout<<"Enter a value\n";
				   cin>>x;
				   cout<<"enter the position\n";
				   cin>>pos;
				   l.addatpos(x,pos);
	 			   break;	*/		
			case 5: cout<<"Enter a element to delete\n";
			                 cin>>ele;
        		              dll.delete_node(ele);				
                              break;
			case 6: cout<<"Reverse Display"<<endl;
                        dll.reverse_display();
   			             break;
			case 7:exit(0);
			       
		}
	}
	return 0;
}


