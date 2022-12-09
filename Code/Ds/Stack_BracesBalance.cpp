/* C++ Program to Check for Balanced Brackets in an expression (well-formedness)
using Stack 
Sample Test Cases:
Input:
Enter expression
{{[[(())]]}}
Output:
Braces are balanced
Input:
Enter expression
{[(])}
Output:
Braces are imbalanced
*/
//to check if the brackets are balanced using stack

#include <iostream>
#include <stack>
using namespace std;
class BracesBalance
{
	public:
		bool areBalancedBraces(string str)
		{
			int i;
			char c;
			int n=str.length();
			stack<char>st;   //librarynamedstack <datatye> nameofstack5
			for(i=0;i<n;i++)
			{
				c=str.at(i);
				if(st.empty())
				{
					st.push(c);
				}
				else if(st.top()=='('&&c==')'||st.top()=='{'&&c=='}'||st.top()=='['&&c==']')
				{
					st.pop();
				}
				else
				st.push(c);
			}
			if(st.empty())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
};
int main()
{
	BracesBalance bb;
	string expr;
	cout<<"Enter expression"<<endl;
	cin>>expr;
	if(bb.areBalancedBraces(expr))
		cout<<"Braces are balanced";
	else 
		cout<<"not balanced";
	return 0;
}