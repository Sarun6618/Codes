str=input()
count1=0
count2=0
for i in range(len(str)):
    if(str[i].isalpha()):
        count1=count1+1
    elif(str[i].isdigit()):
        count2+=1
print(count1)
print(count2)
