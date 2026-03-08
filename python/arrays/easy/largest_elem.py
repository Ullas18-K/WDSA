#brute
arr=[2,45,3,2,65,32,48]
arr.sort()
print(f'max={arr[len(arr)-1]}') #nlogn()

#better,optimal
arrw=[2,45,3,2,65,32,48]
max=arrw[0]
for i in range(len(arrw)):
    if arr[i]>max:
        max=arr[i]
print(max)  #o(n)