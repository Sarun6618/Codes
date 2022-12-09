"""
Given a list of strings, write a python program to group anagrams together.
Note: An anagram is a word or phrase that's formed by rearranging the letters of another word or phrase
case 1:
Enter no of words:7
ate
tenet
tea
bat
eentt
ball
eat
list of anagrams : [['ate', 'tea', 'eat'], ['tenet', 'eentt'], ['bat'], ['ball']]
case2:
Enter no of words:3                                                                                                     
bat                                                                                                                     
ball                                                                                                                    
tenet                                                                                                                   
list of anagrams : [['bat'], ['ball'], ['tenet']] 
"""
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
print("list of anagrams :",a)