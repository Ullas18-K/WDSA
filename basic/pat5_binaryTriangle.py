
def swap(n):
    # if n==1:
    #     return 0
    # else:
    #     return 1
    return 0 if n==1 else 1
    
def bintri(n):
    for i in range(n):
        # if i%2 == 0:
        #     biNum=1
        # else:
        #     biNum=0
        biNum=1 if i%2 == 0 else 0
        for j in range(i+1):
            print(biNum,end='')
            biNum= swap(biNum)
        print()
    

#orr
'''
 biNum ^= 1   # flip 0 -> 1 or 1 -> 0
 or
 if i+j%2==0:
    print(1)
 else print(0)
'''
bintri(5)