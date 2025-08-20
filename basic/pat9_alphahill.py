
def alphaHill(n):
    for i in range(n):
        print((" " * (n-i-1)),end='')
        for j in range(i+1):
            print(chr(65+j),end='')
        for j in range(i-1,-1,-1):
            print(chr(65+j),end='')
        print()

def invertalphaHill(n):
    for i in range(n):
        k=n-i-1
        for j in range(i+1):
            print(chr(65+k),end='')
            k+=1
        print()
        
alphaHill(5)
print()
invertalphaHill(5)