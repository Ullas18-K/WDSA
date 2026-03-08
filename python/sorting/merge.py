
def merge(arr,low,mid,high):
    i=low
    j=mid+1
    b=[0]*len(arr)
    k=low
    while i<=mid and j<=high:
        if arr[i]<arr[j]:
            b[k]=arr[i]
            k+=1
            i+=1
        else:
            b[k]=arr[j]
            k+=1
            j+=1
    
    while i<=mid:
        b[k]=arr[i]
        k+=1
        i+=1
        
    while j<=high:
        b[k]=arr[j]
        k+=1
        j+=1
    
    for i in range(low,high+1): #need to update only specific part ie from low to high only of both b and arr , including high+1 since we need last elem too
        arr[i]=b[i]
    
        

def merge_sort(arr,low,high):
    if low<high: #no equalty to avoid infinite recurrsion
        mid=int((low+high)/2)
        merge_sort(arr,low,mid)
        merge_sort(arr,mid+1,high)
        merge(arr,low,mid,high)

arr=[1,34,2,5,1,6,53,25]
merge_sort(arr,0,len(arr)-1)
print(arr)

'''

def merge(arr, low, mid, high):
    i = low
    j = mid + 1
    b = []

    while i <= mid and j <= high:
        if arr[i] < arr[j]:
            b.append(arr[i])
            i += 1
        else:
            b.append(arr[j])
            j += 1

    while i <= mid:
        b.append(arr[i])
        i += 1

    while j <= high:
        b.append(arr[j])
        j += 1

    # copy back
    for p in range(low, high + 1):
        arr[p] = b[p - low] #logic changed coz b is now storing the sorted subarrays starting from 0 index

def merge_sort(arr, low, high):
    if low < high:
        mid = (low + high) // 2
        merge_sort(arr, low, mid)
        merge_sort(arr, mid + 1, high)
        merge(arr, low, mid, high)

arr = [1, 34, 2, 5, 1, 6, 53, 25]
merge_sort(arr, 0, len(arr) - 1)
print(arr)

'''