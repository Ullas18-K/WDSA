
def sidetriangle(n):
    for i in range(n):
        for j in range(i+1):
            print("*",end='')
        print()  
        
def doubleside(n):
    for i in range(n):
        stars="*" * (i+1)
        print(stars)
     
    for i in range(1,n):
        stars="*" * (n-i)
        print(stars)

sidetriangle(5)
print()
doubleside(5)