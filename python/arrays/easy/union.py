
arr=[1,1,2,2,3,4,4,4,5,22,24]
arr1=[1,2,3,3,4,5,6,7,7,21]

#brute
set=set()
for i in arr:
    set.add(i)
for i in arr1:
    set.add(i)
union=[]
for i in set:
    union.append(i)
print(union)   #takes o(n1+n2) + o(n1+n2) in worst case,, space--> o(2(n1+n2))

#optimal
i=0
j=0
index=0
n1=len(arr)
n2=len(arr1)
print(n1,n2)
union1=[]
print(not union1)
while(i<n1 and j<n2):
    if arr[i]<=arr1[j]:
        if not union1 or arr[i]!=union1[-1]:
            union1.append(arr[i])
        i+=1
    else:
        if not union1 or arr1[j]!=union1[-1]:
            union1.append(arr1[j])
        j+=1
 
while(i<n1):
        if not union1 or arr[i]!=union1[-1]:
            union1.append(arr[i])
        i+=1

while(j<n2):
        if not union1 or arr1[j]!=union1[-1]:
            union1.append(arr1[j])
        j+=1
    
print(union1)