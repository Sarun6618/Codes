/*program-1
1. Ayaan Sidd is a sharp shooter. He is given a row of lamp posts with different heights,
And He can shoot only lamps on top of the lamp posts.
Due to heights are different he can shoot the lamps, whose height is maximum.
In a single shot, he can break any number of lamps.
Find out and print the number of lamps, he can successfully break.
Sample Input-1: 
---------------
4
3 2 1 3
Sample Output-1:
----------------
2
Sample Input-2:
---------------
10
18 90 90 13 90 75 90 8 90 43
Sample Output-2:
----------------
5
*/
#include<iostream>
using namespace std;
main()
{
    int n,a[50],max=0,c=0;
    cin>>n;
    for( int i=0;i<n;i++)
    {
        cin>>a[i];
        if(max<a[i])
        max=a[i];
    }
    for(int i=0;i<n;i++)
    if(max==a[i])c++;
  cout<<c;
}
/*program-2
Given two strings s1 and s2, find if s1 is a substring of s2. If yes,
 return the index of the first occurrence, else return -1.
Testcse:
Input: 
Enter String
kmitkmec
Enter SubString  
it
Output: 2
Explanation:
String "it" is present as a substring of s2.
Input: 
Enter String
kmitkmec
Enter SubString
ic
Output: -1.
Explanation:
There is no occurrence of "ic" in
"kmitkmec"
*/
#include <bits/stdc++.h>
using namespace std;

int Substr(string s2, string s1)
{
	int counter = 0; // pointing s2
	int i = 0;
	for(;i<s1.length();i++)
	{
		if(counter==s2.length())
			break;
		if(s2[counter]==s1[i])
		{
			counter++;
		}
	else
		{
			// Special case where character preceding the i'th character is duplicate
			if(counter > 0)
			{
				i -= counter;
			}
			counter = 0;
		}
	}
	return counter < s2.length()?-1:i-counter;
}


int main()
{
	string s1,s2;
	cout <<"Enter String"<<endl;
	cin>>s1;
	cout <<"Enter SubString"<<endl;
	cin>>s2;

	cout << Substr(s2, s1);
	return 0;
}
/* program-3
A happy number is a number defined by the following process:
 Starting with any positive integer, replace the number by the sum of the
 squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or 
it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Input: n = 19
Output: true
Explanation:
12 + 92 = 82 
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
case=1
Enter a number: 82
82 is a Happy number
case=2
Enter a number: 37
37 is not a Happy number
case=3
Enter a number: 19
19 is a Happy number
case=4
Enter a number: 153
153 is not a Happy number
*/
#include<iostream>
using namespace std;
int SumOfSquNum(int givno)
{
    int SumOfSqr = 0;
    while (givno)
    {
        SumOfSqr += (givno % 10) * (givno % 10);
        givno /= 10;
    }
    return SumOfSqr;
}
bool checkHappy(int chkhn)
{
    int slno, fstno;
    slno = fstno = chkhn;
    do
    {
        slno = SumOfSquNum(slno);
        fstno = SumOfSquNum(SumOfSquNum(fstno));
    }
    while (slno != fstno);
    return (slno == 1);
}
int main()
{
int hyno;
 cout << " Enter a number: ";
 cin >> hyno;

    if (checkHappy(hyno))
        cout << hyno << " is a Happy number\n";
    else
        cout << hyno << " is not a Happy number\n";
}
/* program 4
Write a C++ program to print sum of all substring of a number represented as a string
Testcase:
Enter String(num)
1234
Output:
1670
*/
#include<iostream>
#include<string> 
#include<math.h>
using namespace std;
int main()
{
    string num;
    cout<<"Enter String(num):\n";
    cin>>num;
    int s,i,l,sum=0,j,k;
    l=num.length();
    for(int k=1;k<=l;k++)
    {
        s=stoi(num);
        int p=pow(10,k);
        while(s>=(p/10))
        {
            i=s%(p);
            sum+=i;
            s=s/(10);
        }
    }
    cout<<sum;
}