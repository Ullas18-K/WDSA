arr = [2,0,2,1,1,0]

hashmap={}
j=0
for i in range(len(arr)):
    hashmap[arr[i]]=hashmap.get(arr[i],0)+1
for key in hashmap:
    while hashmap[key]>0:
        arr[j]=key
        j+=1
        hashmap[key]-=1
print(hashmap)
print(arr) # o(2n) , o(n)space


#optimal - dutch-french algo
arr1 = [2,0,1]
low=0
mid=0 #iterator
high=len(arr1)-1
while(mid<=high):
    if arr1[mid]==0:
        arr1[low],arr1[mid]=arr1[mid],arr1[low]
        low+=1
        mid+=1
    elif arr1[mid]==1:
        mid+=1
    else:
        arr1[mid],arr1[high]=arr1[high],arr1[mid]
        high-=1
print(arr1) #o(n)