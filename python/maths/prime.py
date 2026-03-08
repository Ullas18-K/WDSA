import math
class Solution:
    def isPrime(self, n):
        #your code goes here
        for i in range(2,int(math.sqrt(n)) + 1):
            if n%i==0:
                return False
        return True


obj1 = Solution()
print(obj1.isPrime(29))  # True