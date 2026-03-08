arr=[1,3,2,3,1,5,4,5,4]
#brute
for i in arr:
    cnt=0
    for j in arr:
        if j==i:
            cnt+=1
    if cnt==1:
        print(i) #o(n^2)


# better
mydict={}
for elem in arr:
    mydict[elem]=mydict.get(elem,0)+1
for num in mydict:
    if mydict[num]==1:
        print(num)
print(mydict)

#optimal
n=0
for i in range(len(arr)-1):
    n=arr[i]^arr[i+1]
print(n)
