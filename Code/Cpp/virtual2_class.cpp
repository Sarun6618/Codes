#include<iostream>
#include<string>
using namespace std;
class student
{
   public:
   string name;
   student()
   {
      cout<<"Enter student name:";
      cin>>name;
   }
};
class F2M: virtual public student
{
   public:
   int attendance1;
   void first2months()
   {
      cout<<"Enter attendance of first 2-months:";
      cin>>attendance1;
   }
};
class N2M: virtual public student
{
   public:
   int attendance2;
   void second2months()
   {
      cout<<"Enter attendance of second 2-months:";
      cin>>attendance2;
   }
};
class average: public F2M, public N2M
{
   public:
   int total=61;
   int attendance,result;
   void avg()
   {
      attendance=attendance1+attendance2;
      result=(attendance/total)*100;
      if(result>75)
      {
         cout<<"eligble"<<endl;
      }
      else if(result>65 & result<75)
      {
         cout<<"pass out"<<endl;
      }
      else
      {
         cout<<"detained"<<endl;
      }
   }
};
int main()
{
   string name;
   int attendance,attendance1,attendance2;
   int total=61;
   float result;
   average a;
   a.first2months();
   a.second2months();
   a.avg();
   return 0;

}