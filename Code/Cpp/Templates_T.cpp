/* WAC++ Program for function templates
     Sample Input-Output:
     7
     7
     g
     
     */
     
    #include <iostream>
    using namespace std;
    
    // One function works for all data types. This would work
    // even for user defined types if operator '>' is overloaded
    template <typename T>
    T myMax(T x, T y)
    {
        cout<<x<<endl;
        return 0;
    }
    
    int main()
    {
     // Call myMax for int
     myMax(7,7);
    // call myMax for double
    myMax(7,9);
    // call myMax for char
    myMax('g','f');
    
    return 0;
    }
