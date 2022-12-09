#to import threading use "import space" or as given "from threading import *"
from threading import *
#to get delay in output time of every class use "from time import sleep"
from time import sleep
#give argument as Thread to a class to work as thread
class Hello(Thread):
  def run(self):
    for i in range(5):
      print("Hello")
#sleep to get delay time here with (2)- 2 sec
      sleep(2)
class Hi(Thread):
  def run(self):
    for i in range(5):
      print("Hi")
      sleep(2)
obj1=Hello()
obj2=Hi()
obj1.start()
#here sleep with (1) gives the speed of time total working
sleep(1)
obj2.start()
#join to end and work with main thread
obj2.join()
print("Bye")