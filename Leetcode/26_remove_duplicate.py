class Solution(object):
    def removeDuplicates(self, nums):
        left=0
        k=1
        for right in range(1,len(nums)):
            if nums[right]!=nums[left]:
                left+=1
                k+=1
                nums[left]=nums[right]
        return k

obj1=Solution()
print(obj1.removeDuplicates([0,0,1,1,1,2,2,3,3,4]))