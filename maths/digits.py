import math
class Solution:
    def countDigit(self, n):
        self.count=0
        while n>0:
            self.count+=1
            n = int(n/10) #orr n=n//10
        return self.count
    # orr
    # return len(str(n))
    def countlog(self,n):
        return int(math.log10(n)) + 1  #standard way of getting count
    
obj1=Solution()
print(obj1.countDigit(125463))
print(obj1.countlog(125463))