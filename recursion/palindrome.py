
def ispalindrome(string,i,j):
    #just check left half and right half
    if j>=i:  #coz even after reachinf middle if string[i]!=string[j] has not executes then it's sure everything is equal
        if string[i]!=string[j]:
            return False
        else:
            return ispalindrome(string,i+1,j-1)
    else:
        return True
stre="uy564465yu"
print(ispalindrome(stre,0,len(stre)-1))