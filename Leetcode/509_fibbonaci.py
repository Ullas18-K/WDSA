
class Solution(object):
    def fib(self, n):
        if n==0:
            return 0
        if n==1:
            return 1
        
        return self.fib(n-1)+self.fib(n-2)

obj1=Solution() 
print(obj1.fib(4))

'''
class Solution:  //o(n)
    def fib(self, n):
        if n < 2:
            return n
        a, b = 0, 1
        for _ in range(2, n + 1):
            a, b = b, a + b
        return b
        

'''

'''
If each function call spawns 1 recursive call, you usually get linear complexity (O(n)).

If each function call spawns k>1 recursive calls, you usually get exponential (O(k^n), or smaller if overlapping work can be avoided with DP).
coz for each call k times the function is called , so it's k * k * k*k*k*.... that's why it's k^n if depth is n
'''
    
       
        
