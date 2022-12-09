/*Write Cpp program to convert infix expression to postfix
sample test case:
Enter expression
input=a+b*c/d-e
output=postfix form: abc*d/+e-
*/
#include<iostream>
#include<stack>
#include<string>
using namespace std;
class ITFConverstion
{
    public:
    int prec(char c)
    {
        if(c=='+'|| c=='-')
        {
            return 1;
        }
        if(c=='*'||c=='/')
        {
            return 2;
        }
        return 0;
    }
    bool isOperator(char c)
    {
        if(c=='+'||c=='-'||c=='*'||c=='/')
        {
            return true;
        }
        else{
            return false;
        }
    }
    string infixToPostfix(string s)
    {
        stack<char> st;
        string res;
        for(int i=0;i<s.length();i++)
        {
            if(!isOperator(s[i]))
            {
                res=res+s[i];
                continue;
            }
            if(st.empty())
            {
                st.push(s[i]);
            }
            else
            {
                while(!st.empty() && prec(st.top())>=prec(s[i]))
                {
                    res=res+st.top();
                    st.pop();
                }
                st.push(s[i]);
            }
        }
        while(!st.empty())
        {
            res=res+st.top();
            st.pop();
        }
        return res;
    }
};
int main()
{
    ITFConverstion itf;
    string exp;
    cout<<"Enter expression"<<endl;
    cin>>exp;
    cout<<"Postfix form: "<<itf.infixToPostfix(exp)<<endl;
    return 0;
}
/*
#include<bits/stdc++.h>
using namespace std;


int prec(char c) {
	if(c == '^')
		return 3;
	else if(c == '/' || c=='*')
		return 2;
	else if(c == '+' || c == '-')
		return 1;
	else
		return -1;
}


void infixToPostfix(string s) {

	stack<char> st; 
	string result;

	for(int i = 0; i < s.length(); i++) {
		char c = s[i];

		
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
			result += c;

		
		else if(c == '(')
			st.push('(');

		
		else if(c == ')') {
			while(st.top() != '(')
			{
				result += st.top();
				st.pop();
			}
			st.pop();
		}

	
		else {
			while(!st.empty() && prec(s[i]) <= prec(st.top())) {
				result += st.top();
				st.pop();
			}
			st.push(c);
		}
	}


	while(!st.empty()) {
		result += st.top();
		st.pop();
	}

	cout << result << endl;
}


int main() {
	string exp;
	cin>>exp;
	infixToPostfix(exp);
	return 0;
}
*/