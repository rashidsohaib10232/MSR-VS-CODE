f = open("CODER ARMY\DAY 4\example 2.txt","a+")
l = []
# n = int(input("how many teacher names : "))
# for i in range(n):
#     name = input("enter teacher name : ")
#     l.append(name + '\n')
f.seek(0)

x = f.writelines(l)

r = f.readline()


print(r)






f.close()

#   python\txt1.py
