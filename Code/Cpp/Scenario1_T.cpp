/*
Mr. Arjun has an portrait photo with size M*N pixels, 
where M is the length of the portrait and N is width of the portrait.
You are given an integer S in pixels,
Your task is to help Mr. Arjun to find the actual values 
[M, N] using the following specifications:
    - The size of portrait should be equal to S. i.e., S = M*N.
    - N is always smaller than in M, i.e., N <= M
    - The diffrence between length and width, (M-N) should be minimum.
    And print the result as a pair [M, N]
NOTE: S is always a positive integer.
Input Format:
-------------
Line-1 -> An integer S, size of the portrait. 
Output Format:
--------------
Print the result as a pair of integers.
case=1
input=24
output=6 4
case=2
input=55
output=25 22
*/
#include<iostream>
using namespace std;
int main()
{
    int n,i,j;
    cin>>n;
    for(i=1;i<n;i++)
    {
        for(j=1;j<n;j++)
        {
            if(n==i*j)
            {
                if(i>j)
                {
                    goto func;
                  
                }
            }
           
        }
    }
 func:
    n==i*j;
    cout<<i<<" "<<j;
}