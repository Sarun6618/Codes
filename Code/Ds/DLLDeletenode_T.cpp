/*  Write a program to delete a node from DLL*/
/*Sample output
case 1
Forward Display                                                                                                         
10                                                                                                                      
20                                                                                                                      
30                                                                                                                      
Enter element value to delete 40                                                                                        
Element Not Found!                                                                                                      
Elements of DLL are                                                                                                     
10                                                                                                                      
20                                                                                                                      
30 
Case 2
Forward Display                                                                                                         
10                                                                                                                      
20                                                                                                                      
30                                                                                                                      
Enter element value to delete 10                                                                                        
Elements of DLL are                                                                                                     
20                                                                                                                      
30  
Case 3
Forward Display                                                                                                         
10                                                                                                                      
20                                                                                                                      
30                                                                                                                      
Enter element value to delete 30                                                                                        
Elements of DLL are                                                                                                     
10                                                                                                                      
20
Case 4
Forward Display                                                                                                         
10                                                                                                                      
20                                                                                                                      
30                                                                                                                      
Enter element value to delete 20                                                                                        
Elements of DLL are                                                                                                     
10                                                                                                                      
30
*/
#include<iostream>
using namespace std;
class Node{
  public:
  int data;
  Node *next;
  Node *prev;
  
  Node(int d){
      data=d;
      next=NULL;
      prev=NULL;
  }
  void display(){
    cout<<data<<endl;   
  }
};
class DLL{
    public:
    Node *hptr=NULL;
    Node *tptr=NULL;
    
    void add(int d){
        Node *nptr = new Node(d);
        if(hptr == NULL){
            hptr = tptr = nptr;
        }
        else{
            tptr->next = nptr;
            nptr->prev = tptr;
            tptr = nptr;
        }
    }
    void delete_node(int d){
        Node *temp=hptr;
        int flag=0;
        while(temp!=NULL)
        {
            if(temp->data==d)
            {
                if(temp==hptr)
                {
                    hptr=temp->next;
                    hptr->prev=NULL;
                }
                else if(temp==tptr)
                {
                    tptr=temp->prev;
                    tptr->next=NULL;
                }
                else
                {
                    temp->prev->next=temp->next;
                    temp->next->prev=temp->prev;
                }
                flag++;
            }
            temp=temp->next;
        }
        if(flag==0)
        {
            cout<<"Element Not Found"<<endl;
        }
    }
    void forward_display(){
        Node *temp = hptr;
        while(temp!=NULL){
            temp->display();
            temp = temp->next;
        }
    }
    void reverse_display(){
        Node *temp = tptr;
        while(temp!=NULL){
            temp->display();
            temp = temp->next;
        }
    }
};
int main(){
    DLL dll;
    int x;
    dll.add(10);
    dll.add(20);
    dll.add(30);
    cout<<"Forward Display"<<endl;
    dll.forward_display();
    cout<<"Enter element value to delete ";
    cin>>x;
    dll.delete_node(x);
    cout<<"Elements of DLL are"<<endl;
    dll.forward_display();
}