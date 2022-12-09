#include <stdio.h>
int main()
{
    int rowCountOne,columnCountOne,rowCountTwo,columnCountTwo,i,j,k,sum=0;
    int firstMatrix[10][10],secondMatrix[10][10],resultMatrix[10][10];
    printf("Number of rows in first matrix:");
    scanf("%d",&rowCountOne);
    printf("Number of columns in first matrix:");
    scanf("%d",&columnCountOne);
    printf("Elements of first matrix:\n");
    for(i=0;i<rowCountOne;i++)
    for(j=0;j<columnCountOne;j++)
    scanf("%d",&firstMatrix[i][j]);
    printf("Number of rows of seconds matrix:");
    scanf("%d",&rowCountTwo);
    printf("Number of columns of seconds matrix:");
    scanf("%d",&columnCountTwo);
    if(columnCountOne!=rowCountTwo)
    printf("Matrices with entered orders cannot be multiplied.\n");
    else
    {
        printf("Elements of second matrix:\n");
        for(i=0;i<rowCountTwo;i++)
        for(j=0;j<columnCountTwo;j++)
        scanf("%d",&secondMatrix[i][j]);
        for(i=0;i<rowCountOne;i++)
        {
            for(j=0;j<columnCountTwo;j++)
            {
                for(k=0;k<rowCountTwo;k++)
                {
                    sum=sum+firstMatrix[i][k]*secondMatrix[k][j];
                }
                resultMatrix[i][j]=sum;
                sum=0;
            }
        }
        printf("After Multiplication,the result is:\n");
        for(i=0;i<rowCountOne;i++)
        {
            for(j=0;j<columnCountTwo;j++)
            printf("%d\t",resultMatrix[i][j]);
            printf("\n");
        }
    }
    return 0;
}
