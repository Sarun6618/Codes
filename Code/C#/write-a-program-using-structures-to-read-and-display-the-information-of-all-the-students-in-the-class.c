#include<stdio.h>
#include<string.h>
struct student
{
    int roll;
    char name[100];
    int fees;
    char dob[100];
};
void main( )
{
    int a,i;
    char b[100],c[100];
    printf("enter number of students: ");
    scanf("%d",&a);
    struct student details[a];
    for(i=0;i<a;i++)
    {
        printf("enter %d student details:\n",i+1);
        printf("enter roll number: ");
        scanf("%d",&details[i].roll);
        printf("enter name: ");
        scanf(" %[^\n]%*c",b);
        strcpy(details[i].name, b);
        printf("enter the fee: ");
        scanf("%d",&details[i].fees);
        printf("enter the date of birth[dd-mm-yyyy]: ");
        scanf(" %[^\n]%*c",c);
        strcpy(details[i].dob, c);
    }
    for(i=0;i<a;i++)
    {
        printf("Details of %d student\n",i+1);
        printf("\tRoll Number = %d\n",details[i].roll);
        printf("\tname = %s\n",details[i].name);
        printf("\tfees = %d\n",details[i].fees);
        printf("\tdate of birth = %s\n",details[i].dob);
        
    }
}