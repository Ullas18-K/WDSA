#if an elem is 0 ,set all elements in it's rows and coloums as zero

#brute
arr = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
jval=set()  #to avoid duplicate col values

for i in range(len(arr)):
    found=0
    for j in range(len(arr[i])):
        if arr[i][j]==0:
            jval.add(j)
            found=1
    
    if found:
        for k in range(len(arr[i])):
            arr[i][k]=0

for i in range(len(arr)):
    for j in range(len(arr[i])):
        if j in jval:
            arr[i][j]=0

print(jval)
print(arr)


#optimal - without using extra space, use first row to store zero information
arr1 = [[1,0,1],
 [1,1,1],
 [1,1,0]]
# jval=set()  #to avoid duplicate col values
globe=0

for val in arr1[0]:
    if val==0:
        globe=1

for i in range(1,len(arr1)):
    found=0
    for j in range(len(arr1[i])):
        if arr1[i][j]==0:
            found=1
            arr1[0][j]=0
    
    if found:
        for k in range(len(arr1[i])):
            arr1[i][k]=0

for i in range(1,len(arr1)):
    for j in range(len(arr1[i])):
        if arr1[0][j]==0:
            arr1[i][j]=0

if globe:
    for k in range(len(arr1[0])):
        arr1[0][k]=0
        
print(arr1)