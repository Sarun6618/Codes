/*evaluate postfix 
Test case:
i/p:Enter Postfix Expression
231*+9- 
o/p: -4
*/
#include<iostream>
#include<stack>
#include<string>
using namespace std;
class EPF
{
	public:
		bool isOperator(char c)
		{
			if(c=='+' || c=='-' || c=='*' || c=='/')
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		int evalPostfix(string str)
		{
			stack <int> st;
			int res,a,b;
			for(int i=0;i<str.length();i++)
			{
				if(!isOperator(str[i]))
				{
					st.push(str[i]-'0');
				}
				else
				{
					b=st.top();
					st.pop();
					a=st.top();
					st.pop();
					switch(str[i])
					{
						case '+':res=a+b;break;
						case '-':res=a-b;break;
						case '*':res=a*b;break;
						case '/':res=a/b;break;
						
					}
					st.push(res);
				}
			}
			return st.top();
		}
};
int main()
{
	EPF epe;
	string exp;
	cout<<"Enter Postfix Expression"<<endl;
	cin>>exp;
	cout<<epe.evalPostfix(exp);
	return 0;
}