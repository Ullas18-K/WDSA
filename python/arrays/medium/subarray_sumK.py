#optimal -sliding window doesnt work for negative numbers
# arr=[1,1,2,3,4,11,6,7,9]
arr=[-1,-1,1]
k=-1
x=0
'''
sum=0
left=0
for right in range(len(arr)):
    sum+=arr[right]
    
    if sum==k:
        x+=1
        print(left,right)
        
    if sum>k:
        while sum>k and left<right:
            sum-=arr[left]
            left+=1
            
            if sum==k:
                print(left,right)
                x+=1
                break

print(x)
'''
hashtab={0:1}
prefix=0
d=0
for i in range(len(arr)):
    prefix+=arr[i]
    
    # if prefix == k:
    #     d+=1
    
    if prefix-k in hashtab:
        d+=hashtab[prefix-k]
    
    hashtab[prefix]=hashtab.get(prefix,0)+1
print(hashtab)
print(d)