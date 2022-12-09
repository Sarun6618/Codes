n = input("enter an integer:")
lsum=0
rsum=0

for i in n [::2]:
    lsum+=int(i)
for j  in n [::-2]:
    
   rsum+=int(j)
   
print(abs(lsum-rsum))