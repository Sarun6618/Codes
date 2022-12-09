def roundup(x):
  return x if x % 100 == 0 else x + 100 - x % 100
x=int(input("Enter a value:"))
print(roundup(x))