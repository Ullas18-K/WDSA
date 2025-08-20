
def incresingTriangle(n):
    count=0
    for i in range(n):
        for j in range(1,i+2):
            count+=1
            print(count,end=' ')
        print()
        
def increasingLetter(n):
    for i in range(n):
        for j in range(i+1):
            print(chr(65 + j),end=' ')
        print()
        
def decreasingLetter(n):
    for i in range(n):
        for j in range(n-i):
            print(chr(65 + j),end=' ')
        print()

def sameletter(n):
    for i in range(n):
        for j in range(i+1):
            print(chr(65 + i),end=' ')
        print()    

incresingTriangle(5)
print()
increasingLetter(5)
print()
decreasingLetter(5)
print()
sameletter(5)