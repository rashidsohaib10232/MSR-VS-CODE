# Opening the file in read mode
file = open("example 2.txt", "a+")
name = input("enter ur name : ")
Class = input("enter ur class")
te = input("enter ut teacher name ")

file.writelines(name )
file.writelines(Class )
file.writeline(te )

x = file.readline()
print(x)
file.close()
