#rotate an array by 90 clock wise
#brute

'''
#this is shallow copy, the sublists inside arr1 still point to the same memory where arr sublists are stored 
for i in range(len(arr)):
        arr1.append(arr[i])

#instead you duplicate every element
for row in arr:
    arr1.append(row[:])
    
#orrr
for i in range(len(arr)):
    arr1.append(arr[i][:])  

arr1[1][2]=54
print(arr1)
print(arr)  now different copies
'''   
arr=[[1,2,3],[4,5,6],[7,8,9]]
arr1=[]
for row in arr:
    arr1.append(row[:])

'''
k=0
for i in range(len(arr1)-1,-1,-1):
    for j in range(len(arr1[i])):
        arr[j][k]=arr1[i][j]
    k+=1
'''  

#eliminate k using indexes
n=len(arr1)
for i in range(len(arr1)-1,-1,-1):
    for j in range(len(arr1[i])):
        arr[j][n-1-i]=arr1[i][j]

print(arr)


#optimal - o(1) space
arr2=[[1,2,3],[4,5,6],[7,8,9]]
#flip the array upside down
n=len(arr2)
for i in range(int(len(arr2)/2)):
    for j in range(len(arr2[i])):
        arr2[i][j] , arr2[n-1-i][j] = arr2[n-1-i][j] , arr2[i][j]
  
'''
orr
arr2.reverse()

for i in range(len(arr)//2):
    arr[i], arr[n-1-i]= arr[n-1-i],arr[i]

'''

for i in range(len(arr2)):
    for j in range(len(arr2[i])):
        if i!=j and j>i:
            arr2[i][j],arr2[j][i] = arr2[j][i],arr2[i][j]

print(arr2)