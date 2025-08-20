'''
So, what we can observe from the above examples is that on the perimeter of the square, there is an integer no. N which decreases by 1 as we move inside the square level-wise. Since this cannot be printed directly, we print it in reverse fashion (0’s at the border of the square, then 1 in the inner perimeter, then 2, and so on ) and then subtract the whole pattern by N at the end which just makes the outermost perimeter filled with the number N, inner perimeter with N-1 and finally the centermost element with the integer 1. The outer and the inner loop will run for the same number of times ( since we have to print square) i.e, 2*N-1 times and the inner loop would print the numbers based on the logic as described below ( for N = 4 ):

Input Format: N = 3
Result: 
3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 so for these kind you need to create a matrix which would look like

0 0 0 0 0 
0 1 1 1 0
0 1 2 1 0
0 1 1 1 0
0 0 0 0 0 and subtract each n every element from n in order to get the pattern

The distance of the current cell from the top can be written as the row number i.e, i.
The distance of the current cell from the left can be written as the column number i.e, j.
The distance of the current cell from the right can be written as (2*n-2) - j.
The distance of the current cell from the bottom can be written as (2*n-2) - i.
find the min distance and that's your number and subtract from n 
'''

def matrix(n):
    for i in range((2*n)-1):
        for j in range((2*n)-1):
            num= min(i,j,((2*n)-2)-i,((2*n)-2)-j)
            print(n-num,end='')
        print()

matrix(3)