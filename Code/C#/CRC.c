#include<stdlib.h>
#include<stdio.h>
#include <conio.h>
void main()
{
int i,j,n,g,a,arr[20],gen[20],b[20],q[20];
printf("Transmitter side:");
printf("\nEnter no. of data bits:");
scanf("%d",&n);	
printf("Enter data:");
for(i=0;i<n;i++)
scanf("%d",&arr[i]);

printf("Enter size of generator:");
scanf("%d",&g);	
do
{
printf("Enter generator:");
for(j=0;j<g;j++)
scanf("%d",&gen[j]);
}while(gen[0]!=1);

printf("\n\tThe generator matrix:");
for(j=0;j<g;j++)	
printf("%d",gen[j]);	

a=n+(g-1);	
printf("\n\tThe appended matrix is:");
for(i=0;i<j;++i)		
arr[n+i]=0;	

for(i=0;i<a;++i)
printf("%d",arr[i]);

for(i=0;i<n;++i)
q[i]= arr[i];		

for(i=0;i<n;++i)
{
	if(arr[i]==0)
	{
		for(j=i;j<g+i;++j)		
		arr[j] = arr[j]^0;
	}
	else
	{
		for(j=0;j<g;j++)
		{
			arr[i+j] = arr[i+j]^gen[j];
		}
		
	} 
}

printf("\n\tThe CRC is :");
for(i=n;i<a;++i)		
printf("%d",arr[i]);

for(i=n;i<a;i++)		
q[i]=arr[i];
			
printf("\n");

printf("Transmitter code for CRC%d is: ",g-1);
for(i=0;i<a;i++)
printf("%d",q[i]);
getch();
}
/*
Output-1: for CRC-8
Transmitter side:
Enter no. of data bits:8
Enter data:1 0 1 1 1 0 1 1
Enter size of generator:9
Enter generator:1 1 0 1 1 1 0 1 1
        The generator matrix:110111011
        The appended matrix is:1011101100000000
        The CRC is :00000010
Transmitter code for CRC8 is: 1011101100000010

Output-2 : CRC4
Transmitter side:
Enter no. of data bits:8
Enter data:1 0 1 1 1 0 1 1
Enter size of generator:5
Enter generator:1 1 0 0 1
        The generator matrix:11001
        The appended matrix is:101110110000
        The CRC is :0011
Transmitter code for CRC4 is: 101110110011
*/
