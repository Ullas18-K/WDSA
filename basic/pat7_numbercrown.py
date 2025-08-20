
def numcrown(n):
    for i in range(n):
        for j in range(1,i+2):
            print(j,end='')
        
        spaces=" " * 2 * (n-i-1)
        print(spaces,end='')
        
        for j in range(i+1,0,-1):
            print(j,end='')
        
        print()    
            

numcrown(5)