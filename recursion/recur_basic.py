
def name(n,namo):
    if n==0:
        return
    n-=1
    name(n,namo)
    print(namo)

def linear(i,n):
    if i>n:
        return
    print(i)
    linear(i+1,n)
    
name(10,"yo")
linear(1,10)