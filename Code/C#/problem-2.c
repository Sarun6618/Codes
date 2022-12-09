#include<stdio.h>
int main()
{
register int i;
int A[3];
for(i=0;i<3;i++)
scanf("%d",&A[i]);
printf("Values are\n");
for(i=2;i>=0;i--)
printf("%d\n",A[i]);
return 0;
}