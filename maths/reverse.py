class Solution(object):
    def reverse(self, x):
        int_max=2**31 - 1
        in_min=-2**31   
        print(int_max)     
        rev=0
        sign=-1 if x<0 else 1
        x=abs(x)
        
        while x>0:
            d=x%10
            x=x//10
            
            if rev>int_max//10 or (rev==int_max and d>7) :
                return 0
            rev=rev*10 + d
            
        return sign*rev
   
obj1=Solution()
print(obj1.reverse(-1534237833))

#complexity - o(log10(n))