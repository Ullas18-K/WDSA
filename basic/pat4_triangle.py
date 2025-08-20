
def triangle(n):
    for i in range(n):
        spaces=' ' * (n-i-1)
        stars="*" * ((2*i)+1)
        print(spaces+stars)
        
def triangleComplex(n):
    for i in range(n):
        for j in range(n-i-1):
            print(" ",end='')
        
        for j in range((2*i)+1):
            print("*",end='')
        
        for j in range(n-i-1):
            print(" ",end='') 
        
        print()

def downwardT(n):
    for i in range(n):
        spaces=' '*i
        stars="*" * (2*(n-i)-1)
        print(spaces+stars)   

triangle(5)
triangleComplex(5)
print()
downwardT(5)