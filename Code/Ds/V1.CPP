#include <iostream>
using namespace std;
int main()
{
 int price;
 float sum;
 float average;
 float purchased;
 int biscuits;
 int cake;
 int m;
 int ic;

  while(purchased <= 3)
 {
 cout<<"enter the price of bakery items "<<endl;
 cin>>price;
if(price >0 && price <999 )
 {
 sum=price+sum;
 average=sum/purchased;

 if(price >1 && price <200)
 {
 cout<<"you ordered for cake "<<endl;
 cin>>cake;
 cout<<" you ordered for " <<cake<<" cake "<<endl;
 }

 else if(price >200 && price < 400)
 {
 cout<<"you ordered for biscuits "<<endl;
 cin>>biscuits;
 cout<<" you ordered for " <<biscuits<<" biscuits"<<endl;
 }

 else if(price >400 && price < 700)
 {
 cout<<"you ordered for miscellaneous "<<endl;
 cin>>m;
 cout<<" you ordered for " << m<<" miscellaneous"<<endl;
 }

 else if(price >700 && price < 999)
 {
 cout<<"you ordered for ice cream  "<<endl;
 cin>>ic;
 cout<<" you ordered for " <<ic<<" ice cream"<<endl;
 }
 }
 purchased++;
 }
cout<<"its average is = "<<average<<endl;
}
