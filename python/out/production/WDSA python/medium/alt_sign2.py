arr=[2,3,-5,-4,1,9,-7,-8]  #unequal
# arr=[3,2,5,6,4,3,2]
#brute
p=[]
n=[]
for i in range(len(arr)):
    if arr[i]>0:
        p.append(arr[i])
    else:
        n.append(arr[i])

maxi=max(len(p),len(n))
mini=min(len(p),len(n))

for i in range(mini):
    arr[2*i]=p[i]
    arr[2*i+1]=n[i]

ind=mini*2

for i in range(mini,maxi):
    if len(p)>len(n):
        arr[ind]=p[i]
    else:
        arr[ind]=n[i]
    ind+=1
print(arr)

