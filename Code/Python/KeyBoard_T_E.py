"""METHOD-1"""
class Words:
    def findWords(self,Words):
        klist=["qwertyuiop","asdfghjkl","zxcvbnm"]
        s=[]
        for w in Words:
            ws=[]
            for p,kl in enumerate(klist):
                for ch in w.lower():
                    if ch in kl:
                        ws.append(p)
            if len(set(ws))==1:
                s.append(w)
        print(s)
w=Words()
l=list(map(str,input("Enter list words:").split()))
print("Same row words",w.findWords(l))
"""METHOD-2"""
words=list(map(str,input("Enter words: ").split()))
result=[]
l1=["q","w","e","r","t","y","u","i","o","p"]
l2=["a","s","d","f","g","h","j","k","l"]
l3=["z","x","c","v","b","n","m"]
a=0
for i in words:
    def myfunc(l,k):
        if i[0] in l:
            for j in i:
                if j in l:
                    k+=1
                else:
                    break
        if(k==len(i)):
            result.append(i)
        k=0
    myfunc(l1,a)
    myfunc(l2,a)
    myfunc(l3,a)
print(result)