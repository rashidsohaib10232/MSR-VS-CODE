f= open("teacher.txt", "a")
c= int(input("How many teachers:"))
a = []
for i in range (c):
    name= input("enter teachers name:")
    a.append(name+'\n')

f.writelines(a)
f.close()



