from datetime import datetime
class  Restaurant:
    def __init__(self,restaurant_name,cuisine_type):
        self.restaurant_name=name
        self.cuisine_type=cuisine
    def describe_restaurant(self):
        print("welcome to %s\n%s"%(self.restaurant_name,self.cuisine_type))
    def open_restaurant(self):
        time=datetime.now()
        hr =int(time.strftime("%H"))
        if(hr >=9  and hr <= 22):
            print("Restaurant open")
        else:
            print("Restaurant close")
name=input("enter the Restaurant name: ")
cuisine=input("enter the cuisine type: ")
ob=Restaurant(name,cuisine)
ob.describe_restaurant()
ob.open_restaurant()