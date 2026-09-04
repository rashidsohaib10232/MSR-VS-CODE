import numpy as np
arr1 = np.array([1,2,4,5,4,33,5])
#print(arr1)
arr2 = np.array([[2,3,2,4],[-1,2,-4,4]])
#print(arr2)

#third method for creating arr

arr3 = np.zeros((2,3))  #2 row and 3 col
#print(arr3)

arr4 = np.ones((4,4))
#print(arr4)

#print(type arr4)

#4th method for creating array
arr5 = np.identity(5)
#print(arr5)   #gives dingonal elem

#5th method
arr6 = np.arange(10)
print(arr6) #gives arr of range 10 i.e. 0 to 9  also (5,16) --> 5 to 15  also leaving one no. is (5,15,2)


#6th method idk
arr7 = np.linspace(10,20,10)
print(arr7)

#copy array

arr8 = arr7.copy()
print(arr8)

print(arr5.shape)

arr9 = np.array([[[2,4],[4,2],[1,0],[9,5]]])
print(arr9)
print(arr9.shape)  #shape of this idk
print(arr9.ndim , arr9.size) #idk
#diff b/w size and itemsize
