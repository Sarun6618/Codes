#include <stdio.h>

int main()
{
    struct ship
    {
        int size;
        char color[10];
    }
    boat1,boat2;
    boat1.size=10;
    boat2=boat1;
    printf("boat2=%d",boat2.size);
    return 0;
}
