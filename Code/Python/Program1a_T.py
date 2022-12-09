"""Write the following classes with class variables, instance variable and illustration the self
variable Robot (to greet the world)”””
TestCase:
Input:
Enter your name: ASHA
Output:
Robot says hello to ASHA.
"""
class Robot:
    def __init__(self):
        self.name=str(input("Enter your name: "))
    def greet(self):
        print("Robot says hello to ",self.name)
c=Robot()
c.greet()