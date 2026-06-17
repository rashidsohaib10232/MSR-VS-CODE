from array import*

arr = array('i',[-1,1,1,1,2,4,5,6,7,1,-1,1,23,0,1])
print(arr)
print(arr[2])
#arr.reverse()
#print(arr)

arr.append(100000)
print(arr)

arr.remove(-1)
print(arr)
print(arr.index(1))