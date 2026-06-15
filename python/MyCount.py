def mycount():
    f = open("my.txt" ,'r')
    r = f.read()
    s = r.split()
    my = 0
    for i in s:
        if(i=='my' or i=="My"):
            my +=1

    print(my)

    f.close()
mycount()