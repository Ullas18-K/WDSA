#brute
arr=[1,23,0,3,4,0,0,34,5,0,2]
n=len(arr)
temp=[0]*len(arr)
j=0
for i in range(n):
    if arr[i]!=0:
        temp[j]=arr[i]
        j+=1
for i in range(n):
    arr[i]=temp[i]
print(arr)  #takes o(n) space and tc= n + n

#optimal
arrt=[1,23,0,3,4,0,0,34,5,0,2]
n=len(arr)
left=-1
for i in range(n):
    if arrt[i]==0:
        left=i
        break

if(j!=-1):
    for right in range(left,n-1):
        if arrt[right]==0 and arrt[right+1]!=0:
            arrt[left],arrt[right+1]=arrt[right+1],arrt[left]
            left+=1
else:
    print(arrt)
print(arrt)  
