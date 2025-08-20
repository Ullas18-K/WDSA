
#brute
arr=[2,45,3,2,65,32,48,65]
n=len(arr)
k=5

k=k%n
temp=[]
for i in range(k):
    temp.append(arr[i])
for i in range(k,n):
    arr[i-k]=arr[i]
for i in range(n-k,n):
    arr[i]=temp[i-(n-k)]
print(arr)


#optimal with o(1) space
arrt=[2,45,3,2,65,32,48,65]
arrt[:k]=reversed(arrt[:k]) #arr[:k].reverse() doesn't work
arrt[k:]=reversed(arrt[k:])
arrt.reverse()
print(arrt)

 