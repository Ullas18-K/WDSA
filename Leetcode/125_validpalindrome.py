
class Solution(object):
    def isPalindrome(self, s):
        list1=[]
        for letter in s.lower():
            if letter.isalnum():
                list1.append(letter)
        newstring="".join(list1)
        return True if newstring==newstring[::-1] else False
  
obj1=Solution() 
print(obj1.isPalindrome(" "))  

'''
optimal

class Solution(object):
    def isPalindrome(self, s):
        s = s.replace(" ","")
        for i in string.punctuation:
            s = s.replace(i,"")
        s = s.lower()
        return s[::-1] == s
'''   

