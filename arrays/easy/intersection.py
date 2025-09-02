arr=[1,1,2,2,3,4,4,4,5,22,24]
arr1=[1,2,3,3,3,4,4,5,6,7,7,21]

#brute
set=set()
for i in arr:
    if i in arr1:
        set.add(i)
intersect=list(set)
print(intersect)

#brute --> including dupluctes
introset=[]
visitedset=[0]*len(arr1)
for i in range(len(arr)):
    for j in range(len(arr1)):
        if arr[i]==arr1[j] and visitedset[j]==0:
            visitedset[j]=1
            introset.append(arr[i])
            break
print(introset)



#optimal -->including duplicates
i=0
j=0
n1=len(arr)
n2=len(arr1)
intersection=[]
while i<n1 and j<n2:
    if arr[i]==arr1[j]:
        intersection.append(arr[i])
        i+=1
        j+=1
    else:
        if arr[i]<arr1[j]:
            i+=1
        else:
            j+=1
print(intersection)

#optimal --> excluding duplicates
i1=0
j1=0
n1=len(arr)
n2=len(arr1)
intersection1=[]
while i1<n1 and j1<n2:
    if arr[i1]==arr1[j1]:
        if not intersection1 or arr[i1]!=intersection1[-1]:
            intersection1.append(arr[i1])
        i1+=1
        j1+=1
    else:
        if arr[i1]<arr1[j1]:
            i1+=1
        else:
            j1+=1
print(intersection1)