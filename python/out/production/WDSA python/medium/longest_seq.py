#ind the longest consecutive sequence possible from the given array
#brute  --> wrong
# arr=[102,4,100,103,104,3,101,2,1,200,103]
# maxi=-1
# j=1
# arr.sort()
# print(arr)
# for i in range(len(arr)-1):
#     if arr[i+1]-arr[i]==1 or arr[i+1]-arr[i]==0 :
#         j+=1
#         if i+1 == len(arr)-1:
#             j+=1
#             maxi=max(j,maxi)
#     else:
#         maxi=max(j,maxi)
#         j=1
# print(maxi)

#brute
arr1=[102,4,100,100,103,104,3,101,2,1,200,103]

long=0
for i in range(len(arr1)):
    cnt=1
    x=arr1[i]
    while arr1.__contains__(x+1):  #can use "set" for o(1) lookup
        cnt+=1
        x+=1
    long=max(cnt,long)       
print(long)

#brute v2 -->wihtout .contains
maxi=0
for i in range(len(arr1)):
    cnt=1
    x=arr1[i]
    while True:
        found=0
        for elem in arr1:
            if elem==x+1:
                found=1
                break
        if found:
            x+=1
            cnt+=1
        else:
            break
    maxi=max(maxi,cnt)
print(maxi)


#better
arr2=[102,4,100,104,0,0,5,6,103,3,101,2,1,200,103]
# arr2=[0,3,7,2,5,8,4,6,0,1]
arr2.sort()
lastsmall=float('-inf') #better than -sys.maxsize
maxim=0
cnt=1
for i in range(len(arr2)):
    if arr2[i]-1 == lastsmall:
        cnt+=1
        lastsmall=arr2[i]
        maxim=max(cnt,maxim)
    else:
        if arr2[i]!=lastsmall:
            cnt=1
            lastsmall=arr2[i]
print(maxim)

#optimal
arr3=[102,4,100,104,0,0,5,6,103,3,101,2,1,200,103]

Hashset= set(arr3)
longg=1
for val in Hashset:
    x=val
    cnt=1
    if x-1 not in Hashset:
        while x+1 in Hashset:
            x+=1
            cnt+=1
        longg=max(longg,cnt)
print(longg)
        

