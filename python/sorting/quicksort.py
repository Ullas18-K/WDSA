
def partition(arr,low,high):
    pivot=arr[low]
    i=low
    j=high
    while True:
        while i<=high and arr[i]<=pivot:
            i+=1
        
        while j>=low and arr[j]>pivot:
            j-=1
    
        if i<j:
            arr[i],arr[j]=arr[j],arr[i]
        else:
            arr[low],arr[j]=arr[j],arr[low]
            return j
    

def quick_sort(arr,low,high):
    if low<high:
        p=int(partition(arr,low,high))
        quick_sort(arr,low,p-1) #coz j th element already in it's correct position
        quick_sort(arr,p+1,high)
    
arr=[1,34,2,5,1,6,53,25]
arrt=[4,4,4,4,4,4]
quick_sort(arr,0,len(arr)-1)
print(arr)
# quick_sort(arrt,0,len(arrt)-1)
# print(arrt)

'''
standard hoarhe partition for first element as pivot
def partition(arr, low, high):
    pivot = arr[low]
    i = low + 1
    j = high
    
    while True:
        while i <= high and arr[i] <= pivot:
            i += 1
        while j >= low and arr[j] > pivot:
            j -= 1
        if i < j:
            arr[i], arr[j] = arr[j], arr[i]
        else:
            arr[low], arr[j] = arr[j], arr[low]  # put pivot in place
            return j

'''