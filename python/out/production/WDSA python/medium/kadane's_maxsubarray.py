arr=[2,-5,6,-1,8]
#brute
maxi=0
start=0
end=0
for i in range(len(arr)):
    sum=0
    for j in range(i,len(arr)):
        sum+=arr[j]
        if sum>maxi:
            maxi=sum
            start=i
            end=j
for i in range(start,end+1):
    print(arr[i])
print("sum: ",maxi)


#optimal - kadane's algo
arr2=[2,-5,6,-1,8]
maxit=0
sum=0
s=0
e=0
for i in range(len(arr2)):
    if sum<0:
        sum=0  
        e=i+1
    sum+=arr[i]
    if sum>maxit:
        maxit=sum
        e=i
print(maxit)
print(e)
     