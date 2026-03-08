
hashTable=[0]*13

arr=[1,3,2,0,1,5,3,4,6,0,2,3,3]

for i in range(len(arr)):
    hashTable[arr[i]]+=1

print(hashTable)
print(f"count of {5} is {hashTable[5]}")
print(f"count of {3} is {hashTable[3]}")
print(f"count of {2} is {hashTable[2]}")
print(f"count of {12} is {hashTable[12]}")


#more optimal
hashDict={}
arrt=[1,3,2,0,1,5,3,4,6,0,2,3,3]

for i in arrt:
    hashDict[i]=hashDict.get(i,0)+1

print(hashDict)
print(f"count of {5} is {hashDict[5]}")
print(f"count of {3} is {hashDict[3]}")
print(f"count of {2} is {hashDict[2]}")
print(f"count of {12} is {hashDict.get(12,0)}")




