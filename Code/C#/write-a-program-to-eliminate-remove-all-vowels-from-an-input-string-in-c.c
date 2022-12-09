#include <stdio.h>
#define MAX 100


int main()
{
    char isVowel(char ch)
    {
        if (ch=='A'||ch=='a'||
        ch=='E'||ch=='e'||
        ch=='I'||ch=='i'||
        ch=='O'||ch=='o'||
        ch=='U'||ch=='u')
        return 0;
        else
        return 1;
    }
    
    void eliminateVowels(char *buf)
    {
        int i=0,j=0;
        while(buf[i]!='\0')
        {
            if(isVowel(buf[i])==0)
            {
                for(j=i;buf[j]!='\0';j++)
                buf[j]=buf[j+1];
            }
            else
            i++;
        }    
    }
    char str[MAX]={0};
    printf("Enter string: ");
    scanf("%[^\n]s",str);
    eliminateVowels(str);
    printf("After eliminating vowels string: %s\n",str);
    return 0;
}
