arr=[7,2,4,5,6]
#brute
maxi=0
for i in range(1,len(arr)):
    diff=0
    for j in range(i+1,len(arr)):
        diff=arr[j]-arr[i]
        maxi=max(maxi,diff)
print(maxi)

#optimal
mini=arr[0]
profit=0
for i in range(len(arr)):
    diff=arr[i]-mini
    profit=max(profit,diff)
    mini=min(mini,arr[i])
print(profit)