class Solution(object):
    def singleNumber(self, nums):
        mydict={}
        for num in nums:
            mydict[num]=mydict.get(num,0)+1
        for num in mydict:
            if mydict[num]==1:
                return num

'''
num=0
for i in arr:
    num^=i
print(num)
'''
  