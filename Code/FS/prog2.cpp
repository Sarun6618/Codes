/*
There are two lines of electrical outlets, these outlets support different 
voltages range from -100v to 100v. The volatges of the outlets in each line
are arranged in the ascending order as a singly linked lists, list1 and list2.
Your task is to combine these two lists into one list of outlets, and the 
arrangement of outlets should be in the ascending order of their volatges.
NOTE: use singly linked list concept. 
Sample Node:
============
class Node{    
    int data;    
    Node next;    
    public Node(int data) {    
        this.data = data;    
        this.next = null;    
    }    
}    
INPUT FORMAT:
-------------
Line-1: space separated integers, voltages of outlets in list-1
Line-2: space separated integers, voltages of outlets in list-2
OUTPUT FORMAT:
--------------
Space separated integers, voltages of outlets in ascending order.
SAMPLE INPUT-1:
---------------
1 3 5 7
2 4 6
SAMPLE OUTPUT-1:
----------------
1 2 3 4 5 6 7
SAMPLE INPUT-2:
---------------
-10 -5 -4 3 5 6
-6 -5 3 4 6 8
SAMPLE OUTPUT-2:
----------------
-10 -6 -5 -5 -4 3 3 4 5 6 6 8
*/
#include<bits/stdc++.h>
#include<sstream>
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
    void display()
    {
        cout<<data<<" ";
    }
};
class prog2
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
    void show()
    {
        Node *temp=hptr;
        while(temp!=NULL)
        {
            temp->display();
            temp=temp->next;
        }
    }
    Node * Merge(Node *n1,Node *n2)
    {
        if(n1==NULL)
        {
            return n2;
        }
        if(n2==NULL)
        {
            return n1;
        }
        else
        {
            n2->next=Merge(n1,n2->next);
            return n2;
        }
    }
};
int main()
{
    prog2 l1,l2,res;
    string s1,s2,a1,a2;
    getline(cin,s1);
    stringstream p1(s1);
    while(getline(p1,a1,' '))
    {
        l1.append(stoi(a1));
    }
    getline(cin,s2);
    stringstream p2(s2);
    while(getline(p2,a2,' '))
    {
        l2.append(stoi(a2));
    }
    res.hptr=res.Merge(l1.hptr,l2.hptr);
    res.show();
    return 0;
}
