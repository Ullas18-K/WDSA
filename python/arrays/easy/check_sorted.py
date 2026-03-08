arr=[2,45,3,2,65,32,48,65]
for i in range(len(arr)-1):
    if arr[i]>arr[i+1]:
        print("not sorted")
        break