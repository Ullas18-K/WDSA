#print the matrix in spiral order

arr=[[1,2,3,4],[5,6,7,8],[9,10,11,12]]
spy=[]

top=0
left=0
bottom=len(arr)-1
right=len(arr[0])-1

while top<=bottom and left<=right:
    for i in range(left,right+1):
        print("done1")
        spy.append(arr[top][i])
    top+=1
    
    for i in range(top,bottom+1):
        print("done2")
        spy.append(arr[i][right])
    right-=1
        
    if top<=bottom: #for only 1 row case
        for i in range(right,left-1,-1):
            print("done3")
            spy.append(arr[bottom][i])
        bottom-=1
    
    if left<=right: #for only one column case
        for i in range(bottom,top-1,-1):
            print("done4")
            spy.append(arr[i][left])
        left+=1
   
print(spy)     