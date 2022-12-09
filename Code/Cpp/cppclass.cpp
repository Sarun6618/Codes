#include<iostream>
using namespace std;
class Movie
{
	public:
	void ticket()
	{
		cout<<"\nGet ticket first\n";
	}
	Movie()
	{
		cout<<"\nWe are in the constructor\n";
	}
	Movie(int x)
	{
		cout<<x;
	}
	~Movie()
	{
		
	}
};
int main()
{
	Movie m,a(10);
	m.ticket();
	cout<<"We just came out of the constructor";
	return 0;
}
