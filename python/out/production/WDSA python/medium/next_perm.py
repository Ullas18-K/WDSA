nums=[3,2,1]
print(nums.reverse)
n=len(nums)
found=False
for i in range(n-2,-1,-1):
            if nums[i]<nums[i+1] :
                    found=True
                    j=n-1
                    x=0
                    while nums[j-x]<=nums[i]: #core part
                        x+=1
                    temp=nums[i]
                    nums[i]=nums[j-x]
                    nums[j-x]=temp
                    left=i+1
                    right=n-1
                    while left<right:
                        temp=nums[left]
                        nums[left]=nums[right]
                        nums[right]=temp
                        left+=1
                        right-=1
                    break

if found==False:
                    left=0
                    right=n-1
                    while left<right:
                        temp=nums[left]
                        nums[left]=nums[right]
                        nums[right]=temp
                        left+=1
                        right-=1
            
print(nums)