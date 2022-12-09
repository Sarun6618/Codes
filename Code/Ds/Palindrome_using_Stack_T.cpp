/* C++ program to check whether the given string is Palindrome using Stack 
Sample Test Case:
Enter a string
madam
Palindrome
Sample Test Case:
Enter a string
hyderabad
Not Palindrome
*/
#include <iostream>
#include<stack>
using namespace std;
class Check_Palindrome{
    public:
    bool isPalindrome(string s){
            //write your code here
    for (int i = 0; i < s.length() / 2; i++) 
    {
        if (s[i] != s[s.length() - i - 1]) 
        {
            return false;
        }
    }
    return true;
        }   
};
int main(){
    Check_Palindrome cpl;
    string str;
    cout<<"Enter a string"<<endl;
    cin>>str;
    if (cpl.isPalindrome(str)) {
        cout << "Palindrome";
    }
    else {
        cout << "Not Palindrome";
    }
    return 0;
}