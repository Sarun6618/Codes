class vehicle:
    colour="White"
    def __init__(self,name,max_speed,mileage):
        self.name=name
        self.max_speed=max_speed
        self.mileage=mileage
class bus(vehicle):
    pass
class car(vehicle):
    pass
x=car("kwid",426,27)
y=car("bmw",526,30)
z=car("benz",626,72)
a=bus("Volve",410,56)
b=bus("FAlcon",765,98)
print("Vehicle name",x.name,x.max_speed,x.mileage,x.colour)
print("Vehicle name",y.name,y.max_speed,y.mileage,y.colour)
print("Vehicle name",z.name,z.max_speed,z.mileage,z.colour)
print("Vehicle name",a.name,a.max_speed,a.mileage,a.colour)
print("Vehicle name",b.name,b.max_speed,b.mileage,b.colour)
