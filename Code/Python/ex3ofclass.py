class vehicle:
    def __init__(self,name,max_speed,mileage):
        self.name=name
        self.max_speed=max_speed
        self.mileage=mileage
class bus(vehicle):
    pass
x=vehicle("kwid",426,27) 
y=vehicle("bmw",526,30)
z=vehicle("benz",626,72)
print(x.name,x.max_speed,x.mileage)
print(y.name,y.max_speed,y.mileage)
print(z.name,z.max_speed,z.mileage)
