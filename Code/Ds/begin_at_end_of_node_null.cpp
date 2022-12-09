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
        else
        {
            node *temp=hptr;
            while(temp->next!=NULL)
            {
                temp=temp->next;
            }
            node *nptr=new node(d);
            temp->next=nptr;
        }
    }
    void begin(int d)
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
};
int main()
{
    linkedlist a;
    a.append(15);
    a.append(20);
    a.begin(30);
    a.append(20);
    a.begin(18);
    a.display();
}
