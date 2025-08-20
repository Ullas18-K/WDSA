
def diamond(n):
    for i in range(n):
        spaces=' ' * (n-i-1)
        stars="*" * ((2*i)+1)
        print(spaces+stars)
        
    for i in range(1,n):
        spaces=' '*(i)
        stars='*' * (2*(n-(i)) - 1)
        print(spaces+stars)
        
diamond(5)