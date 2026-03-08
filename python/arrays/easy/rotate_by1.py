arr=[2,45,3,2,65,32,48,65]
n=len(arr)
temp=arr[0]
for i in range(1,n):
    arr[i-1]=arr[i]
print(arr)
arr[n-1]=temp
print(arr)
    