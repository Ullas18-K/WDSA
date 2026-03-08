arr1=[2,2,1,1,1,2,2]
hashmap={}
for i in arr1:
    hashmap[i]=hashmap.get(i,0)+1
for key in hashmap:
    if hashmap[key]>(len(arr1)//2):
        print(key)
        break
    #o(2n) , o(1)
    
#optimal  o(nlogn)+o(n)
arr=[2,2,1,1,1,2,2]
arr.sort()
j=0
count=0
for i in range(len(arr)):
    if arr[i]==arr[j]:
        count+=1
    else:
        if count>(len(arr)//2):
            print(arr[j])
            break
        j=i
        count=1
if count>(len(arr)//2):
        print(arr[j])   

#moore's voting algo
arr2=[3,3,4,5,3,3,3,5,6]
count1=0
el=0
for i in range(len(arr2)):
    if count1==0:
        el=arr2[i]
        count1+=1
    elif arr2[i]==el:
        count1+=1
    else:
        count1-=1

count2=0
for i in range(len(arr2)):
    if arr2[i]==el:
        count2+=1
    if count2>(len(arr2)//2):
        print(el)
        break
