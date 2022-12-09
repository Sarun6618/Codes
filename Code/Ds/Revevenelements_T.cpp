/*Append odd position nodes in reverse at the end of even positioned nodes in a Linked List
Difficulty Level : Easy
Last Updated : 27 May, 2021
Given a linked list. The task is to segregate its even and odd position nodes in such a way that odd position nodes appear before even positioned nodes all the even positioned nodes must be in reverse order.
Output=
1 2 3 4 5 6                                                                                                             
after reversing the even nodes and appending to odd nodes                                                               
1 3 5 6 4 2 */                                                                                                        
// C++ program to rearrange a linked list in such a
// way that all odd positioned node are stored before
// all even positioned nodes
#include<iostream>
using namespace std;

class Node
{
  public:
  int data;
  Node *next;

  
  Node(int d)
  {data=d;
   next=NULL;
   
  }
  
};
class Linkedlist
{
	public:
	Node *hptr=NULL;

	
	  void append(int d)
	{ 
	 
	  if(hptr==NULL)
	  
	  {
	  	 Node *temp=new Node(d);
	  	 hptr=temp;
	  }
	    
	 else{
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
	    Node *temp=hptr;
	 	while(temp!=NULL)
			 {
			  cout<<temp->data<<" ";
		 	  temp=temp->next;
		 	
		 }
		 
	}
	Node* rearrangeEvenOdd()
    {
    Node *head=hptr;
    // Corner case
    if (head == NULL)
        return NULL;
 
    // Initialize first nodes of even and
    // odd lists
    Node* odd = head;
    Node* even = head->next;
 
    // Remember the first node of even list so
    // that we can connect the even list at the
    // end of odd list.
    Node* evenFirst = even;
 
    while (1) {
 
        // If there are no more nodes, then connect
        // first node of even list to the last node
        // of odd list
        if (!odd || !even || !(even->next)) {
            break;
        }
 
        // Connecting odd nodes
        odd->next = even->next;
        odd = even->next;
 
        // If there are NO more even nodes after
        // current odd.
        if (odd->next == NULL) {
            even->next = NULL;
            break;
        }
 
        // Connecting evenevenFirs nodes
        even->next = odd->next;
        even = odd->next;
    }
 
    // Reversal of even linked list
    Node* current = evenFirst;
    Node* prev = NULL;
    Node* front = NULL;
 
    // Iterate in the complete linked list
    while (current != NULL) {
        front = current->next;
        current->next = prev;
        prev = current;
        current = front;
    }
 
    evenFirst = prev;
 
    // Attach the reversed even linked
    // list to odd linked list
    odd->next = evenFirst;
    return head;
}
};	

int main()
{
	Linkedlist l;
	Node* head;
   	l.append(1);
	l.append(2);
	l.append(3);
	l.append(4);
	l.append(5);
	l.append(6);
	l.display();
	head=l.rearrangeEvenOdd();
	cout<<"\nafter reversing the even nodes and appending to odd nodes"<<endl;
	l.display();

	
    return 0;
}