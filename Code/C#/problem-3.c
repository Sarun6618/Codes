#include <stdio.h>
struct node 
{
int data1;
char data2;
struct node* link;
};
int main()
{
struct node ob1;
ob1.link = NULL;
ob1.data1 = 10;
ob1.data2 = 20;
struct node ob2;
ob2.link = NULL;
ob2.data1 = 30;
ob2.data2 = 40;
ob1.link = &ob2;
printf("%d", ob1.link->data1);
printf("\n%d", ob1.link->data2);
return 0;
}