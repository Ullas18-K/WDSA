def squares(n):
    for i in range(n):
        for j in range(i+1):
            print("* ",end='')
        print()
        
def nums(n):
    for i in range(n):
        for j in range(i+1):
            print(f"{j+1} ",end='')
        print()
        
def samenums(n):
    for i in range(n):
        for j in range(i+1):
            print(f"{i+1} ",end='')
        print()



squares(4)
nums(5)
samenums(5)
