def mycount():
    f = open("my.txt" ,'r')
    r = f.read()
    s = r.split()
    count = 0        # counter pehle 0 hona chahiye
    for i in s:
        if(i=='my'):
            count+=1     

    print(count)

    f.close()
mycount()
