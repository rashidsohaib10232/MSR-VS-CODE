from array import *
n = int(input("Enter the size of array : "))
arr = array('i',[])
for i in range(n):
    x = int(input("Enter the element : "))
    arr.append(x)
print(arr)

for i in arr:
    print(i, end=",")