#include<iostream>
#include<algorithm>
#include<list>
using namespace std;
int main()
{
    list<int>my_list={12,5,10,9};
    my_list.push_front(11);
    my_list.push_back(18);
    auto it=find(my_list.begin(),my_list.end(),10);
    if(it!=my_list.end())
    {
        my_list.insert(it,21);
    }
    for(int x:my_list)
    {
        cout<<x<<'\n';
    }
}