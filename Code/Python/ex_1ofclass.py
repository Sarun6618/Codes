class Person:
    def __init__(self,name,sex,profession):
        self.name=name
        self.sex=sex
        self.profession=profession
    def show(self):
        print("name:",self.name,"sex:",self.sex,"profession:",self.profession)
    def work(self):
        print(self.name,"working as",self.profession)
p1=Person("Sarun","Male","Student")
p2=Person("Sai Teja","Male","Student")
p3=Person("Surya","Male","Student")
p1.show()
p1.work()
p2.show()
p2.work()
p3.show()
p3.work()