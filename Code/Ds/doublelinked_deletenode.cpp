#include<iostream>

using namespace std;
class node
{
    public:
    int data;
    node *next;
    node *prev;
    node(int d)
    {
        data=d;
        next=NULL;
        prev=NULL;
    }
};
class dll
{
    public:
    node *hptr=NULL;
    node *tptr=NULL;
    void append(int d)
    {
        node *temp = new node(d);
        if(hptr==NULL)
        {
            hptr=temp;
            tptr=temp;
        }
        else
        {
            tptr->next=temp;
            temp->prev=tptr;
            tptr=temp;
        }
    }
    void Forward_display()
    {
        cout<<"Forward display"<<endl;
        node *temp=hptr;
        while(temp!=NULL)
        {
            cout<<temp->data<<endl;
            temp=temp->next;
        }
    }
    void reverse_display()
    {
        cout<<"reverse display"<<endl;
        node *temp=tptr;
        while(temp!=NULL)
        {
            cout<<temp->data<<endl;
            temp=temp->prev;
        }
    }
    void del(int d)
    {
        node *temp=hptr;
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
                    temp->prev->next=NULL;
                }
                else
                {
                    temp->prev->next=temp->next;
                    temp->next->prev=temp->prev;
                }

            }
            temp=temp->next;
        }
    }
    
};
int main()
{
    dll a;
    a.append(10);
    a.append(20);
    a.append(30);
    a.append(40);
    a.append(50);
    a.Forward_display();
    a.reverse_display();
    a.del(10);
    a.Forward_display();
    a.reverse_display();
    
    // a.bdisplay();
    
    return 0;
}