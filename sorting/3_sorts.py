def selection_sort(arr,n):
    for i in range(n):
        min=i
        for j in range(i+1,n):
            if arr[j]<arr[min]:
                min=j
        arr[i],arr[min]=arr[min],arr[i]
    return arr
arr=[32,4,3,2,6,33,25]
print(selection_sort(arr,len(arr)))
print(arr)

def bubble_sort(arr,n):
    didSwapped=0 
    for i in range(n):
        for j in range(n-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
                didSwapped=1
        if didSwapped==0:
            break
        
#best case=o(n) (using didswapped) , avg=o(n^2)
arrt=[32,4,3,2,6,33,25]
bubble_sort(arrt,len(arrt))
print(arrt)

#it's like creating sub sorted array and adding the next element in the right position
def insertion_sort(arr,n):
    didswapped=0
    for i in range(n):
        for j in range(i,0,-1):
            if arr[j]<arr[j-1]:
                arr[j],arr[j-1]=arr[j-1],arr[j]
                didswapped=1
        if didswapped==0:
            break
#
arrtb=[32,4,3,2,6,33,25]
insertion_sort(arrtb,len(arrtb))
print(arrtb)