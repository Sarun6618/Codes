#include<iostream>
using namespace std;
int main()
{
	int n,a[1000],i,max,c=0;
	cout<<"enter the number of poles: ";
	cin>>n;
	cout<<"enter the heights: ";
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	max=a[0];
	for(i=0;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	for(i=0;i<n;i++)
	{
	    if(max==a[i])
	    {
	        c++;
	    }
	}
	cout<<"number of lamps he can break is: "<<c;
	return 0;
}