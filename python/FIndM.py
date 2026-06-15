f = open("CODER ARMY\DAY 4\example 2.txt", 'r')
r = f.readlines()
m = 0
s= 0
for i in r:
    if i[0]== 'm':
        m+=1
    if i[0]=='s':
        s+=1

print("no of m is ", m ,"and s is ", s )

