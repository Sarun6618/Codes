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
class CLL
{
    public:
    Node *last=NULL;
    void append(int d)
    {
        Node *temp=new Node(d);
        if(last==NULL)
        {
            last=temp;
            last->next=temp;
        }
        else
        {
            temp->next=last->next;
            last->next=temp;
            last=temp;
        }
    }
    void display()
    {
        Node *temp=last->next;
        do
        {
            cout<<temp->data<<endl;
            temp=temp->next;
        }while(temp!=last->next);
    }
    void addbegin(int d)
    {
        Node *temp=new Node(d);
        if(last==NULL)
        {
            last=temp;
            last->next=temp;
        }
        else
        {
            temp->next=last->next;
            last->next=temp;
        }
    }
    void middle(int pos,int d)
    {
        int i;
        Node *nptr=new Node(d);
        Node *temp=last->next;
        for(i=1;i<pos-1;i++)
        {
            temp=temp->next;
        }
        nptr->next=temp->next;
        temp->next=nptr;
    }
    void deletefirstNode(int value)
    {
        Node *temp=last->next;
        if(temp->data==value)
        {
            last->next=temp->next;
        }
    }
    void deletelastNode(int value)
    {
        Node *temp=last->next;
        if(temp->data==value)
        {
            last->next=temp->next;
        }
        else 
        {
            if(last->data==value)
            {
                while(temp->next!=last)
                {
                    temp=temp->next;
                }
                temp->next=last->next;
                last=temp;
            }
        }
    }
    void deletemiddleNode(int value)
    {
        Node *temp=last->next;
        if(temp->data==value)
        {
            last->next=temp->next;
        }
        else 
        {
            while(temp->next->data!=value)
            {
                temp=temp->next;
            }
            temp->next=temp->next->next;
        }
    }
};
int main()
{
    CLL cll;
    int fele;
    int lele;
    int mele;
    cll.append(10);
    cll.append(20);
    cll.append(30);
    cll.append(40);
    cll.addbegin(100);
    cll.addbegin(200);
    cll.addbegin(300);
    cll.middle(2,50);
    cll.middle(3,60);
    cll.middle(4,70);
    cll.middle(5,80);
    cll.display();
    cout<<"Enter the first element to delete\n"<<endl;
    cin>>fele;
    cll.deletefirstNode(fele);
    cout<<"After first node deletion"<<endl;
    cll.display();
    cout<<"Enter the last element to delete\n"<<endl;
    cin>>lele;
    cll.deletelastNode(lele);
    cout<<"After last node deletion"<<endl;
    cll.display();
    cout<<"Enter the last element to delete\n"<<endl;
    cin>>mele;
    cll.deletemiddleNode(mele);
    cout<<"After middle node deletion"<<endl;
    cll.display();
    return 0;
}