#include<stdio.h>  
int main()
{
    int a[3][3],i,j,s1=0,s2=0;
    printf("\nEnter Elements");
    for(i=0;i<3;i++)
    for(j=0;j<3;j++)
    scanf("%d",&a[i][j]);
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            if(a[i][j]%2==0)
            s1=s1+a[i][j];
            else
            s2=s2+a[i][j];
        }
    }
    printf("\nEven Sum=%d\nOdd Sum=%d",s1,s2);
    return 0;
}    