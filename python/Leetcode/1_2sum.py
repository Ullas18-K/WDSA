class Solution(object):
    def twoSum(self, nums, target):
        pairs=[(value,index) for index,value in enumerate(nums)]
        pairs.sort()
        i=0
        j=len(nums)-1
        while(i<j):
            val1,ind1=pairs[i]
            val2,ind2=pairs[j]
            if val1+val2==target:
                return [ind1,ind2]
            if val1+val2<target:
                i+=1
            else:
                j-=1
            
obj1=Solution()
print(obj1.twoSum([2,7,11,15],9))


'''
class Solution(object):
    def twoSum(self, nums, target):
        hashmap={}
        for i in range(len(nums)):
            if target-nums[i] in hashmap:
                return [hashmap[target-nums[i]],i]
            hashmap[nums[i]]=i
            '''