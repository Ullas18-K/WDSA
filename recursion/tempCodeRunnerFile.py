def reverseInplacesingle(arr,i,n):
    if (n-i-1)<=i:
        return
    temp=arr[i]
    arr[i]=arr[n-i-1]
    arr[n-i-1]=temp
    reverseInplace(arr,i+1,n)