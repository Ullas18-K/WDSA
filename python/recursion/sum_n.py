
def sum(n):
    if n==1:
        return 1
    return n + sum(n-1)
    
print(sum(10))

def fact(n):
    if n==0 or n==1:
        return 1
    return n*fact(n-1)

print(fact(5))

def reverseArray(arr,blank):
    n=len(arr)-len(blank)
    if n==0:
        return
    blank.append(arr[n-1])
    reverseArray(arr,blank)

def reverseInplace(arr,i,j):
    if j<=i:
        return
    temp=arr[i]
    arr[i]=arr[j]
    arr[j]=temp
    reverseInplace(arr,i+1,j-1)
    
def reverseInplacesingle(arr,i,n):
    if (n-i-1)<=i:
        return
    temp=arr[i]
    arr[i]=arr[n-i-1]
    arr[n-i-1]=temp
    reverseInplacesingle(arr,i+1,n)
  
arr=[2,34,5,1]
blnk=[]
reverseArray(arr,blnk)
print(blnk)

aret=[2,34,5,1]
reverseInplace(aret,0,3)
print(aret)

arett=[2,34,5,1]
reverseInplacesingle(arett,0,len(arr))
print(arett)