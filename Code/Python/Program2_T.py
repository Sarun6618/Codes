"""Make a class called Restaurant. The __init__() method for Restaurant should store two
attributes: a restaurant_name and a cuisine_type. Make a method called
describe_restaurant() that prints these two pieces of information, and a method called
open_restaurant() that prints a message indicating that the restaurant is open. Create three
different instances from the class, print the two attributes individually, and then call both
methods for each instance.
Sample input & output 1:
Enter the Restaurant name: Minerva
Enter the Cuisine: South Indian Cuisine
Welcome to Minerva
South Indian Cuisine
Restaurant Open
Sample input & output 2:
Enter the Restaurant name: Paradise
Enter the Cuisine: Indian Cuisine
Welcome to Paradise
Indian Cuisine
Restaurant Closed
"""
from datetime import datetime
class Restaurant:
    def __init__(self,name,cuisine):
        self.name=name
        self.cuisine=cuisine
    def describe_Restaurant(self):
        print("Welcome to %s\n%s"%(self.name,self.cuisine))
    def open_Restaurant(self):
        time=datetime.now()
        hr=int(time.strftime("%H"))
        if(hr >=11 and hr <=23):
            print("Restaurant Open")
        else:
            print("Restaurant Closed")
name=input("Enter the Restaurant name: ")
cuisine=input("Enter the Cuisine: ")
ob=Restaurant(name,cuisine)
ob.describe_Restaurant()
ob.open_Restaurant()
