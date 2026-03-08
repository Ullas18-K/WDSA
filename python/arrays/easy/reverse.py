#to reverse a part an array

def Reverse(arr,start,end):
    while (start <= end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start+=1
        end-=1;  
