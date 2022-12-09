#include<iostream>
using namespace std;
class Relative;//forward decleration
class Family
{
    private:
    long mob_no;
    public:
    friend void show_mob(Family,Relative);
};
class Relative
{
    private:
    long p_no;
    public:
    friend void show_mob(Family,Relative);
};
void show_mob(Family son,Relative d)
{
    son.mob_no=767359835;
    d.p_no=665544899;
    cout<<son.mob_no<<endl<<d.p_no;
}
int main()
{
    Family son;
    Relative d;
    show_mob(son,d);
}