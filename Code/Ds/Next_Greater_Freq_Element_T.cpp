/* Given an array, for each element find the value of nearest element to the right which is having frequency greater than as that of current element. If there does not exist an answer for a position, then make the value '-1'.
Examples:  
Input : a[] = [1, 1, 2, 3, 4, 2, 1] 
Output : [-1, -1, 1, 2, 2, 1, -1]
Explanation:
Given array a[] = [1, 1, 2, 3, 4, 2, 1] 
Frequency of each element is: 3, 3, 2, 1, 1, 2, 3
Lets calls Next Greater Frequency element as NGF
1. For element a[0] = 1 which has a frequency = 3,
   As it has frequency of 3 and no other next element 
   has frequency more than 3 so  '-1'
2. For element a[1] = 1 it will be -1 same logic 
   like a[0]
3. For element a[2] = 2 which has frequency = 2,
   NGF element is 1 at position = 6  with frequency 
   of 3 > 2
4. For element a[3] = 3 which has frequency = 1,
   NGF element is 2 at position = 5 with frequency 
   of 2 > 1
5. For element a[4] = 4 which has frequency = 1,
   NGF element is 2 at position = 5 with frequency 
   of 2 > 1
6. For element a[5] = 2 which has frequency = 2,
   NGF element is 1 at position = 6 with frequency
   of 3 > 2
7. For element a[6] = 1 there is no element to its 
   right, hence -1 
Sample Test Case:
Enter array size
7
Enter array elements
1 1 2 3 4 2 1
Next Greater Freqency
-1 -1 1 2 2 1 -1
*/
#include <stack> 
#include <iostream>
#define __STDC_LIMIT_MACROS
#include<stdint.h>  
using namespace std; 
class Next_Greater_Freq_Ele
{
    public:
    void find_next_Greater_Freq(int arr[], int n, int freq[]) 
    {    
    //write your code here
    stack<int> s;
    s.push(0);
    int res[n];
    for (int i = 1; i < n; i++)
    {
        if (freq[arr[s.top()]] > freq[arr[i]])
        s.push(i);
        else 
        {
            while ( !s.empty()
                   && freq[arr[s.top()]] < freq[arr[i]])
            {
 
                res[s.top()] = arr[i];
                s.pop();
            }
            s.push(i);
        }
    }
    while (!s.empty()) 
    {
        res[s.top()] = -1;
        s.pop();
    }
    for (int i = 0; i < n; i++)
    {
        cout << res[i] << " ";
    }
    }
}; 
int main()
{
    Next_Greater_Freq_Ele ngfe;
    int size;
    cout<<"Enter array size"<<endl;
    cin>>size;
    int arr[size];
    //{1, 1, 2, 3, 4, 2, 1};
    cout<<"Enter array elements"<<endl;
    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }      
    int max = INT16_MAX; 
    //Getting the max element of the array
    for(int i=0;i<size;i++) 
    {         
        if (arr[i] > max) 
        { 
            max = arr[i]; 
        } 
    } 
    int freq[max + 1] ; 
    //Calculating frequency of each element  
    for(int i=0; i<size;i++)
    { 
        freq[arr[i]]++; 
    }
    cout<<"Next Greater Freqency"<<endl;  
    ngfe.find_next_Greater_Freq(arr,size, freq); 
    return 0; 
}
