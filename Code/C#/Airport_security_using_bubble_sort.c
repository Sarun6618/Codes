#include <stdio.h>

int main()
{
    int arr[7],n,i,j,temp;
    printf("Enter number of items: ");
    scanf("%d",&n);
    printf("Enter the items risk sevirity in the dump box: ");
    for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printf("risk sevirity of the items in sorted are ");
    for(i=0;i<n;i++)
    printf("%d",arr[i]);
    return 0;
}
