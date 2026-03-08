#brute
arrt=[1,2,2,2,3,3,3,3,4,4,5]
setS=set()
for i in arrt:
    setS.add(i)  #takes n time
print(setS)

arr=[1,2,2,2,3,3,3,3,4,4,5]
k=1
index=0
for i in range(1,len(arr)):
    if arr[index]!=arr[i]:
        index+=1
        k+=1
        arr[index]=arr[i]    
print(arr)
print(k)
    

