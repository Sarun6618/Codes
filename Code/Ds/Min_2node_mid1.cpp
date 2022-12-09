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
class SLL
{
    public:
    node *hptr=NULL;
    void create(int d)
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
    void display()
    {
        node *temp=hptr;
        while(temp!=NULL)
        {
            cout<<temp->data;
            temp=temp->next;
        }
    }
    /*void max()
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
	}*/
};
int main()
{
    int d,m;
    SLL s;
    cout<<"Enter no of students"<<endl;
    cin>>m;
    cout<<"Enter Marks:";
    for(int i=1;i<m;i++)
    {
        cin>>d;
    }
    s.create(d);
    s.display();
    //s.max();
}