/*
Write a c++ program to delete a node from doubly linked list at any position(beggining,middle,and ending)
Example: 
Doubly Linked List: 59<->101<->67<->2<->389<->41<->896<->10<->4<->365
        x = 365(at the end)
        Result: 59 101 67 2 389 41 896 10 4
Doubly Linked list:10<->45<->36<->27<->15
        x = 36(middle)
        Result: 10 45 27 15
Doubly Linked list:10<->45<->36<->27<->15
        x = 10(beggining)
        Result: 45 36 27 15
Doubly Linked List: 59<->101<->67<->2<->389<->41<->896<->10<->4<->365
        x = 200(no element)
        Result: Element Not found!
Related Topics: Doubly LinkedList
---------------------------------
Test Case1:
10
enter elements
59 101 67 2 389 41 896 10 4 365
Enter node to be delete
389
After Deletion
59
101
67
2
41
896
10
4
365
Test Case2:
enter size of list
9
enter elements
9 5 34 6 7 2 3 79 56
Enter node to be delete
56
After Deletion
9
5
34
6
7
2
3
79
Test Case3:
enter size of list
5
enter elements
1 2 3 4 5
Enter node to be delete
1
After Deletion
2
3
4
5
Test Case4:
enter size of list
5
enter elements
3 6 4 8 9
Enter node to be delete
10
Element Not Found
After Deletion
3
6
4
8
9
*/
#include<iostream>
using namespace std; 
class Node
{
public:
int data; 
Node* next;
Node* prev;
Node(int d)
{
data = d;
next = NULL;
prev = NULL;
}
void display()
{
cout<<data<<endl;
}
};
class DLL
{
public:
Node *hptr = NULL;
Node *tptr = NULL;
void addNode(int d)
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
void deleteNode(int d){
if(hptr->data == d){
Node* temp = hptr;
temp->next->prev = NULL;
hptr = temp->next;
}
else if(tptr->data == d){
Node *temp = tptr;
temp->prev->next = NULL;
tptr = tptr->prev;
}
else{
Node *temp = hptr;
while(temp!=NULL){
if(temp->next!=NULL && temp->next->data == d){
temp->next = temp->next->next;
temp->next->prev = temp;
return;
}
temp = temp->next;
}
cout<<"Element Not Found"<<endl;
}
}
void forwardDisplay(){
Node *temp = hptr;
while(temp!=NULL){
temp->display();
temp = temp->next;
}
}
};
int main(){
DLL dll;
int s,ele,del;
cout<<"enter size of list"<<endl;
cin>>s;
cout<<"enter elements"<<endl;
for(int i=0;i<s;i++){
cin>>ele;
dll.addNode(ele);
}
cout<<"Enter node to be delete"<<endl;
cin>>del;
dll.deleteNode(del);
cout<<"After Deletion"<<endl;
dll.forwardDisplay();
}


/*
Given a linked list and two integers M and N. Traverse the linked list such 
that you retain M nodes then delete next N nodes, continue the same till end of 
the linked list and display the retained linked list.
For example, consider the following list:
1 —> 2 —> 3 —> 4 —> 5 —> 6 —> 7 —> 8 —> 9 —> 10 —> null
If M = 1, N = 3  
1 —>     2 —> 3 —> 4—>    5 —>     6 —> 7 —>8 —>      9 —>        10 —> null
After deletion of 3(N) consecutive nodes by retainning 1(M) node
1 —> 5 —> 9 —> null
Related Topics:LinkedList
------------------------
Test Case1:
enter size of list                                                                                                      
15                                                                                                                      
enter node values                                                                                                       
101 123 456 789 103 987 654 321 105 258 369 147 107 357 159                                                             
enter M and N values
1 3
retaining nodes are                                                                                               
101->103->105->107->                                                                                                    
Test Case2:
enter size of list                                                                                                      
5                                                                                                                                                                                                                                             
enter node values                                                                                                       
1 2 3 4 5                                                                                                               
enter M and N values                                                                                                    
1 3                                                                                                                       
retaining nodes are                                                                                                     
1->5->
Test Case3:
enter size of list                                                                                                      
10                                                                                                                      
enter node values                                                                                                       
1 2 3 4 5 6 7 8 9 10                                                                                                    
enter M and N values                                                                                                    
2 1                                                                                                                     
retaining nodes are                                                                                                     
1->2->4->5->7->8->10->                                                                                                                                                                                                              
                                                                                                                                      
Test Case4:
enter size of list                                                                                                      
12                                                                                                                      
enter node values                                                                                                       
12 56 32 47 89 63 14 35 75 98 42 64                                                                                     
enter M and N values                                                                                                    
2 2                                                                                                                 
retaining nodes are                                                                                                     
12->56->89->63->75->98->                                                                                                
                          
*/


/* 
You are given string exp(infix expression),your task is to convert infix expression to postfix
Example:
Enter expression                                                                                                        
a+b*(c^d-e)^(f+g*h)-i                                                                                                   
Postfix form: abcd^e-fgh*+^*+i- 
Related topic:Stack
-------------------
Test Case1:
Enter expression
A*B+C
Postfix form: AB*C+
Test Case2:
Enter expression
(A+B)*C+(D-E)/F+G
Postfix form: AB+C*DE-F/+G+
Test Case3:
Enter expression
A*(B*C+D*E)+F
Postfix form: ABC*DE*+*F+
Test Case4:
Enter expression
a+b*(c^d-e)^(f+g*h)-i
Postfix form: abcd^e-fgh*+^*+i-
*/



/*
Given a class room there are N no of students are registred for class IX ,
the class teacher wants to write student names in the register for attendance.
The teacher noticed there are few students names are common in that roll list, 
The teacher wants to check a particular name how many students are having  
in the class(count of particular name).
Your task is to:
- read size of register.
- read the names of students and store into a register.
- find(count) how many students are having same name in the class.
- print the count.
Example:
LinkedList: ["abc","def","efg","def","hij"]
            X = def
            output= 2
Note: There are more than one name repeated but you need to find only searching name (X) count.
      Carefully refer the test cases
Related Topic:LinkedList(Singly LinkedList)
--------------------------------------------
Test Case1:
No of students                                                                                                          
10                                                                                                                      
Enter students names                                                                                                    
abc def efg def ijk lmn def afgk def lor                                                                                
Enter name you want to find                                                                                             
def                                                                                                                     
Count : 4                                                                                                                                                                                                                           
Test Case2:
No of students                                                                                                          
15                                                                                                                      
Enter students names                                                                                                    
a b c d e f g h i g j k l n h                                                                                           
Enter name you want to find                                                                                             
g                                                                                                                       
Count : 2                                                                                                                
Test Case3:
No of students                                                                                                          
50                                                                                                                      
Enter students names                                                                                                    
a b c d e f g h i j k l m n o p q r t u v w x y z ab cd ef gh ij kl mn op qr tu vw xy z abc def ghi jkl mno z abcd efgh ijkl mnop z qrst                                                                                                                  
Enter name you want to find                                                                                             
z                                                                                                                       
Count : 4                                                                                                               
*/
