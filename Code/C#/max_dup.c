#include <stdio.h>

int main()
{
    int n,a[1000],i,max,c=0;
    printf("enter the no of poles: ");
    scanf("%d",&n);
    printf("enter the heights: ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    max=a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    for(i=0;i<n;i++)
    {
        if(max==a[i])
        {
            c++;
        }
    }
    printf("number of lamps he can break is %d",c);
    return 0;
}