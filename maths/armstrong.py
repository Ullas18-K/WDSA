import math
class Solution:
    def armstrong(self,n):
        power= int(math.log10(n)) + 1
        original=n
        armstring=0
        while n>0:
            d=n%10
            n=n//10
            armstring+=d**power
        print(armstring)
        return True if armstring==original else False

obj1=Solution()
print(obj1.armstrong(34))