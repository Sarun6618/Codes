/*Write a program to print first two toppers percentage in a class.
The student information is stored in SLL.
Note: create a SLL containing percentage as integer value say 93, 99, 94, 90, 91, 89, 97, 92
*/
/* Sample Data
Case: 1
Enter number of students: 8 
Enter a percentage of 8 Students 
91
68
95
93
88
90
81
89 
Topper 1 percentage:95
Topper 2 percentage:93
*/
#include<iostream>
using namespace std;
class node
{
// write code
    public:
    int data;
    node *next;
    node(int d)
    {
        data=d;
        next=NULL;
    }
};
class Linkedlist
{
    // write code
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
    void findtopper ()
  {
   // write code
   node *temp=hptr;
            int max=temp->data;
            int max2=temp->data;
            while(temp!=NULL)
            {
                if(max<temp->data)
                {
                    max2=max;
                    max=temp->data;
                }
                temp=temp->next;
            }
            cout<<"Topper 1 percentage:"<<max<<endl;
            cout<<"Topper 2 percentage:"<<max2<<endl;
  }
};
int main ()
{
  Linkedlist l;
  // write code
  int n,x;
  cout<<"Enter number of students: ";
  cin>>n;
  cout<<"Enter a percentage of "<<n<<" Students:\n";
  for(int i=0;i<n;i++)
  {
      cin>>x;
      l.addatbegin(x);
  }
  l.findtopper();
                 
  return 0;
}
