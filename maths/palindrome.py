class solution:
    def ispalindrome(self,n):
        stringified=str(n)
        if stringified == stringified[::-1]:
            return True
        else:
            return False

obj1=solution()
print(obj1.ispalindrome(-123321))

#complexity - o(log10(n))
#whenever there's division happening to the input var and if iteration depends on it , the complexity would always be log(base the number you're dividing with)n