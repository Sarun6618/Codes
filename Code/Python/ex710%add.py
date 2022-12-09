class vehicle:
    def __init__(self,name,max_speed,mileage,seating_capacity):
        self.name=name
        self.max_speed=max_speed
        self.mileage=mileage
        self.seating_capacity=seating_capacity
class car(vehicle):
    pass
class car(vehicle):
    def fare(self):
        return self.seating_capacity*100
    def show(self):
        print("name:",self.name,"mileage:",self.mileage,"seating_capacity:",self.seating_capacity)
class bus(vehicle):
    pass
class bus(vehicle):
    def fare(self):
        fare=self.seating_capacity*100
        maintainance=self.seating_capacity*10
        total_fare=fare+maintainance
        return total_fare
    def show(self):
        print("name:",self.name,"mileage:",self.mileage,"seating_capacity:",self.seating_capacity)
x=car("kwid",426,27,5)
y=car("bmw",526,30,5)
z=car("benz",626,72,5)
a=bus("Volve",410,56,40)
b=bus("FAlcon",765,98,40)
x.show()
y.show()
z.show()
a.show()
b.show()
print("the fare is ",x.fare())
print("the fare is ",y.fare())
print("the fare is ",z.fare())
print("the fare is ",a.fare())
print("the fare is ",b.fare())

