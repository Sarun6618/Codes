#include <stdio.h>
const int CITY = 2;
const int WEEK = 7;
int main()
{
    int GRADUATES[CITY][WEEK];
    int i,j;
    for(i=0;i<CITY;i++)
    {
        for(j=0;j<WEEK;j++)
        {
            printf("City[%d],Day[%d]: ",i+1,j+1);
            scanf("%d",&GRADUATES[i][j] );
        }
        printf("\n");
    }
    printf("Displaying Values:\n\n");
    for(i=0;i<CITY;i++)
    {
        for(j=0;j<WEEK;j++)
        {
            printf("City[%d],Day[%d]:%d\n",i+1,j+1,GRADUATES[i][j]);
        }
        printf("\n");
    }
    return 0;
}

