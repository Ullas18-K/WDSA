class Solution(object):
    def rotate(self, nums, k):
        n=len(nums)
        k=k%n
        temp=[]
        for i in range(n-k,n):
            temp.append(nums[i])
        for i in range(n-k-1,-1,-1):
            nums[i+k]=nums[i]
        for i in range(k):
            nums[i]=temp[i]

obj1=Solution()
arr=[1,2,3,4,5,6,7]
obj1.rotate(arr,3)
print(arr)

'''
#optimal with o(1) space
arrt=[2,45,3,2,65,32,48,65]
arrt[:k]=reversed(arrt[:k]) #arr[:k].reverse() doesn't work
arrt[k:]=reversed(arrt[k:])
arrt.reverse()
print(arrt)
'''