#leader is an element in arr on whose right there exist no element greater than itself
import sys
# brute 
arr=[10,22,4,5,6,3,1]
lead=[]
for i in range(len(arr)):
    found=0
    for j in range(i,len(arr)):
        if arr[i]<arr[j]:
            found=1
    if found==0:
        lead.append(arr[i])
print(lead)

#optimal
leader=[]
maxi=-sys.maxsize-1
for i in range(len(arr)-1,-1,-1):
    if arr[i]>maxi:
        leader.append(arr[i])
        maxi=arr[i]
print(leader) #change order if needed
print(leader[::-1])