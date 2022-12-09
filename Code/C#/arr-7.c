/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

void change(int[]);
int main()
{
    int a[3]={20,30,40};
    change(a);
    printf("%d %d", *a,a[0]);
}
void change(int a[])
{
    a[0]=10;
}
