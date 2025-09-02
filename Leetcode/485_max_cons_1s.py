class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        max=0
        i=0
        while(i<len(nums)):
            freq=0
            if nums[i]==1:
                while(i<len(nums) and nums[i]!=0):
                    freq+=1
                    i+=1
                if freq>max:
                    max=freq
            else:
                i+=1