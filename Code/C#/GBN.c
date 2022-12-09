#include<stdio.h>
int main()
{
    int windowsize,sent=0,ack,i;
    printf("Enter windows size:");
    scanf("%d",&windowsize);
    while(1)
    {
        for(i=0;i<windowsize;i++)
        {
            printf("Frame %d has been transmitted\n",sent);
            sent++;
            if(sent==windowsize)
            break;
        }
        printf("\nPlease enter the last AcknowLedgement received.\n");
        scanf("%d",&ack);
        if(ack==windowsize)
        break;
        else
        sent=ack;
    }
    return 0;
}