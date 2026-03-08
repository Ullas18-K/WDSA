#brute
arr=[3,1,2,-2,-5,-4]
hashmap={
    "positive":[],
    "negative":[],
    
}

for i in range(len(arr)):
    if arr[i]>0:
        hashmap["positive"].append(arr[i])
    else:
        hashmap["negative"].append(arr[i])

print(hashmap)
j=0
for i in range(int(len(arr)/2)):
    arr[j]=hashmap["positive"][i]
    j+=1
    arr[j]=hashmap["negative"][i]
    j+=1
print(arr)


#optimal
arr1=[3,1,2,-2,-5,-4]
arrx=[0]*len(arr1)
p=0
n=1
for i in range(len(arr1)):
    if arr1[i]>0:
        arrx[p]=arr1[i]
        p+=2
    else:
        arrx[n]=arr1[i]
        n+=2
print(arrx)