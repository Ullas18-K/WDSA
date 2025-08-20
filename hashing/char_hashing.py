
hashtable=[0]*27

stringf="wassup cuh"

for i in range(len(stringf)):
    if stringf[i]==' ':
        hashtable[26]+=1
    else:
        hashtable[ord(stringf[i])-97]+=1

print(hashtable)
print(ord(" "))
print(hashtable[ord('a')-97])
print(hashtable[ord('s')-97])
print(hashtable[26])



hashdict={}

for ch in stringf:
    hashdict[ch]=hashdict.get(ch,0)+1
print(hashdict)
print(hashtable[ord('a')-97])
print(hashtable[ord('s')-97])
print(hashtable[26])