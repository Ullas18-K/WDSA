#brute
arr=[2,45,3,2,65,32,48,65]
arr.sort()
i=len(arr)-1
while(arr[i]==arr[i-1]):
    i-=1
print("second largest: ",arr[i-1])  #o(nlogn)


#better
arrt=[2,45,3,2,65,32,48]
max=arr[0]
second_max=arr[0]
for i in range(len(arrt)):
    if arrt[i]>max:
        max=arr[i]

for i in range(len(arrt)):
    if arrt[i]>second_max and arrt[i]!=max:
        second_max=arrt[i]
print(second_max)  #takes o(2n)


#optimal
import sys
arro=[2,45,3,2,65,65,32,48]
maxi=arro[0]
second_large=-sys.maxsize-1
for i in range(len(arro)):
    if arro[i]>maxi:
        second_large=maxi
        maxi=arro[i]
    elif arro[i]>second_large and arro[i]<maxi:
        second_large=arro[i]    
print(second_large)     #o(n)


#optimal second_smallest
arrs=[2,45,3,2,65,65,32,48]
small=arrs[0]
second_small=sys.maxsize
for i in range(len(arrs)):
    if arrs[i]<small:
        second_small=small
        small=arrs[i]
    elif arrs[i]<second_small and arrs[i]>small:
        second_small=arrs[i]    
print("second small",second_small)     #o(n)