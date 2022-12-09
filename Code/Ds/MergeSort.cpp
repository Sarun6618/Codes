#include<iostream>
using namespace std;
void merge(int a[],int s,int e)
{
    int mid = (s+e)/2;
    int k = s;
    int i=s,j = mid+1;
    int temp[100];
    while(i<=mid && j<=e)
    {
        if(a[i]>a[j])
        {
            temp[k++] = a[j++];
        }
        else
        {
            temp[k++] = a[i++];
        }
    }
    while(i<=mid)
    {
        temp[k++] = a[i++];
    }
    while(j<=e)
    {
        temp[k++] = a[j++];
    }
    for(int i=0;i<=e;i++)
    {
        a[i] = temp[i];
    }
}
void mergesort(int a[],int s,int e)
{
    if(s>=e)
    {
        return;
    }
    int m = (s+e)/2;
    mergesort(a,s,m);
    mergesort(a,m+1,e);
    merge(a,s,e);
}
int main()
{
    int arr[] = {5,4,3,2,1,6};
    mergesort(arr,0,5);
    for(int i=0;i<=5;i++)
    {
        cout<<arr[i]<<endl;
    }
}