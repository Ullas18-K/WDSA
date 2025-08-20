def invertedstar(n):
    for i in range(n):
        for j in range(n,i,-1): # for j in range(i, n):
            print("* ",end='')
        print()
        
def invertednum(n):
    for i in range(n):
        for j in range(n,i,-1): # for j in range(n - i):
            print(f"{n-j+1} ",end='') #print(j+1)
        print()

invertedstar(5)
invertednum(5)
print(range(4,0))