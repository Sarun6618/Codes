
 #include<iostream>    
 using namespace std;
     
 class integer
{
    private:
    int a, b;
    public:
    void set_value()
    {
        a=50;
        b=30;
    }
    friend int mean(integer s);  //declaration of friend function
};
//friend function definition
int mean(integer s)
{
    //code here
    return int(s.a+s.b)/2;
}
int main()
{
    //code here
    integer s;
    s.set_value();
    cout<<"Mean value:"<<mean(s);
    return 0;
}