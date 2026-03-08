
def hollowDiamond(n):
    for i in range(n,0,-1):
        stars='*'*i
        spaces= " " * (2*(n-i))
        print(stars,end='')
        print(spaces,end='')
        print(stars,end='')
        print()
    
    for i in range(n):
        stars='*' * (i+1)
        spaces= " " * (2*(n-i) - 2)
        print(stars,end='')
        print(spaces,end='')
        print(stars,end='')
        print()

def butterfly(n):
    for i in range(n):
        stars='*' * (i+1)
        spaces= " " * (2*(n-i) - 2)
        print(stars,end='')
        print(spaces,end='')
        print(stars,end='')
        print()
    
    for i in range(n):
        stars="*"*(n-(i+1))
        spaces=" "*(2*(i+1))
        print(stars,end='')
        print(spaces,end='')
        print(stars,end='')
        print()

def hollowRectangle(n):
     for i in range(n):
        if i==0 or i==n-1:
             print("*"*n,end='')
             print()
             continue
        print("*",end='')
        print(" "*(n-2),end='')
        print("*",end='')
        print()
            
                
        
hollowDiamond(5)
print()
butterfly(5)
print()
hollowRectangle(6)