arr=[1,1,0,0,0,1,1,1,0,1,1,1,0,1,1]
max1=0
i=0
while(i<len(arr)):
    freq=0
    if arr[i]==1:
        while(i<len(arr) and arr[i]!=0):
            freq+=1
            i+=1
        if freq>max1:
            max1=freq
    else:
        i+=1
print(max1)

#optimal
maxi=0
cnt=0
for i in range(len(arr)):
    if arr[i]==1:
        cnt+=1
        maxi= max(maxi,cnt)
    else:
        cnt=0
print(maxi)