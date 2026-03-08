arr=[2,4,5,13,6,7,3]
k=13
#brute
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        if arr[i]+arr[j]==k:
            print("yes",i,j)
            break
        

#better
#hashing- if target - i'th element exist in hashtable then yes
hashmap={}
for i in range(len(arr)):
    hashmap[arr[i]]=i

for i in range(len(arr)):
    if k-arr[i] in hashmap and hashmap[k-arr[i]]!=i:
        print("yeep",i,hashmap[k-arr[i]])
        break
#hashmap[k-arr[i]]!=i  very important to check to ensure it doesnt point to same index    


#optimal
i=0
j=len(arr)-1
arr.sort()
while(i<j):
    if arr[i]+arr[j]==k:
        print("yoop",i,j)
    if arr[i]+arr[j]<k:
        i+=1
    else:
        j-=1