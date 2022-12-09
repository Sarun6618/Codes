/*
     Write a C++ program to
     
        define a base class Polygon contains width and height and readdata member function to initialize them
         define a derived class Triangle from Polygon with area as a member function to find the area of triangle
         in main 
     Expected Output:
     Enter width and height of a triangle : 6 4                                                                              
     Area of triangle = 12                                                                                                   
     
    */
    #include <iostream> 
    using namespace std;

    class Polygon 
    {
        public:
        int w,h;
        void pol()
        {
            cout<<"Enter width and height of a triangle : ";
            cin>>w>>h;
        }
    
    };
    class Triangle:public Polygon  
    {
        public:
        int dol()
        {
            double f=(w*h)/2;
            return f;
        }
    };
    
    
    int main()
    {
    Triangle t;
    t.pol();//call the readdata using object of triangle class
    cout << "Area of triangle = "<<t.dol()<<endl; // find the area and display;
    }