#include <stdio.h>

int main()
{
    #if(!10>=5)
    int a=15;
    #elif -15
    int a=20;
    #else
    int a=25;
    #endif
    printf("%d",a);
    return 0;
}
