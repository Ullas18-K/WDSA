#brute 
arr=[8,6,4,2,3,5,7,0,1]
for i in range(len(arr)+1):
    if i not in arr:
        print(i)
#o(n^2)

arr2=[8,6,4,2,9,5,7,0,1]
hashtable=[0]*(len(arr2)+1)
for i in range(len(arr2)):
    hashtable[arr2[i]]=1
for i in range(len(hashtable)):
    if hashtable[i]==0:
        print(i)
        break  #o(n+(n+1))

#optimal
arr1=[9,6,4,2,3,5,7,0,1]
arr1.sort()
for i in range(len(arr1)+1):
    if i==len(arr1):
        if i!=arr1[len(arr1)-1]:
            print(i)
            break
    if i!=arr1[i]:
        print(i)
        break
    
    
