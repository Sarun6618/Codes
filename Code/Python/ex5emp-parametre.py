class employee:
    def __init__(self,name,age,salary):
        self.name=name
        self.age=age
        self.salary=salary
    def show(self):
        print("Name",self.name,"Age",self.age,"Salary",self.salary)
x=employee("Sai Teja",29,1000000)
y=employee("Surya",28,500000)
z=employee("Sarun",27,250000)
x.show()
y.show()
z.show()

