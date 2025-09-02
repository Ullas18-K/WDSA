class Solution(object):
    def check(self,nums):
        n=len(nums)
        count=0
        for i in range(n):
            if nums[i]>nums[(i+1)%n]:
                count+=1
        return True if count<=1 else False  

obj1=Solution()
print(obj1.check([3,4,5,1,2]))

'''
#brute
    def check(self, nums):
        original=sorted(nums)
        for x in range(len(nums)):
            flag=0
            for i in range(len(nums)):
                if nums[i]!=original[(i+x)%len(nums)]:
                    flag=1
                    break
            if flag==0:
                return True
        return False
'''