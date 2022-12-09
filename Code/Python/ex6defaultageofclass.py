class CSE_e:
    def __init__(self,name,age=19):
        self.name=name
        self.age=age
    def show(self):
        print("Name",self.name,"Age",self.age)
x=CSE_e("Sai Teja")
y=CSE_e("Surya")
z=CSE_e("Sarun",18)
x.show()
y.show()
z.show()

