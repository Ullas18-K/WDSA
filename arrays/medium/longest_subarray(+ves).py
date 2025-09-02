arr=[2,-1,-2,1,3,-1,3,1,4,2,3]

#brute
n=len(arr)
k=11
lent=0
for i in range(n):
    sum=0
    cnt=0
    for j in range(i,n):
        sum+=arr[j]
        if sum>k:
            sum-=arr[j]
            break
        else:
            cnt+=1
    if sum==k:      
        lent=max(lent,cnt)

print(lent)

#better - prefix sum using hashmap   
#optimal for both +ve and -ve values
hashtab={}
long=0
#store prefix as key
prefix=0
for i in range(len(arr)):
    prefix+=arr[i]
    
    if prefix==k:
        long=max(long,i+1)
    
    if prefix-k in hashtab:
        long=max(long,i-hashtab[prefix-k])
    
    if prefix not in hashtab:
        hashtab[prefix]=i
print(long) #o(n) 
print(hashtab)
'''
x=0
for i in range(len(arr)):
    x+=arr[i]
    fkey=0
    hashtab[i]=x
    if(x==k):
        long=max(i+1,long)
        break
    for key,value in hashtab.items():
        if value==x-k:
            fkey=key
    if(fkey!=0):
        long=max(i-fkey,long)
print(long)
'''

#optimal - two pointer (sliding window)
som=0
j=0
ler=0
for i in range(len(arr)):
    som+=arr[i]
    
    while(j<=i and som>k):
       som-=arr[j]
       j+=1
    
    if som==k:
        ler=max(ler,i-j+1)
print(ler)

'''
brute
fre=0
for i in range(len(arr)):
    sum=0
    len=0
    for j in range(i,n):
        sum+=arr[j]
        if sum>k:
            break
        else:
            len+=1
        if sum==k:
            fre=max(fre,j-i+1)
            break
print(fre)
'''