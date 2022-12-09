#include <stdio.h>
#include<string.h>
int main()
{
    char a[100];
    printf("Enter name: ");
    fgets(a,100,stdin);
    printf("Name: ");
    puts(a);
}