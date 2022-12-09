/*Sample Output:
Enter no of students:
6
Enter Percentages of students
65 98 36 75 62 99
Topper 1 percentage:99
Topper 2 percentage:98
*/
#include <iostream>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;
 
int main()
{
	int size;
	cout<<"Enter no of students"<<endl;

	cin>>size;
	vector<int> v;
	cout<<"Enter Percentages of students"<<endl;
	for(int i =0;i<size;i++)
	{
		int n;
		cin>>n;
		v.push_back(n);
	}
	sort(v.begin(),v.end());
	cout<<"Topper 1 percentage:"<<v[size-1]<<endl;
	cout<<"Topper 2 percentage:"<<v[size-2]<<endl;	
}