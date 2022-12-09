class Solution:
  def groupAnagrams(self,strs):
    result={}
    for i in strs:
      x="".join(sorted(i))
      if x in result:
        result[x].append(i)
      else:
        result[x] = [i]
    return list(result.values())
strs=[]
n=int(input("Enter no of words:"))
for i in range(n):
  x=str(input())
  strs.append(x)
obj1=Solution()
a=obj1.groupAnagrams(strs)
print("list of Anagrams :",a)