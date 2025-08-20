class Solution(object):
    def maxFrequency(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        #sliding window
        nums.sort()
        maxfreq=1
        start=0
        Window_sum=0
        for i in range(start,len(nums)):
            Window_sum+=nums[i]
            requiredOps=nums[i]*(i-start+1) - Window_sum
            #current window_size=i-start+1
            if requiredOps>k:
                Window_sum-=nums[start]
                start+=1
                continue
            maxfreq=max(maxfreq,i-start+1) 
        return maxfreq
    
obj1=Solution()
print(obj1.maxFrequency([3,9,6],2))
            