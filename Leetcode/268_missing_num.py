class Solution(object):
    def missingNumber(self, nums):
            nums.sort()
            n=len(nums)
            for i in range(n+1):
                if i==n:
                    if nums[n-1]!=i:
                        return i
                else:
                    if i!=nums[i]:
                        return i

'''
arr2=[8,6,4,2,9,5,7,0,1]
hashtable=[0]*(len(arr2)+1)
for i in range(len(arr2)):
    hashtable[arr2[i]]=1
for i in range(len(hashtable)):
    if hashtable[i]==0:
        print(i)
        break  #o(n+(n+1))
'''