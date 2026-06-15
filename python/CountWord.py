def CountWord ():
    f = open("teach.txt")
   
    r = f.read()
    s = r.split()
    countlines =0
    
   
   
    count =0
    let =0
    for i in s:
        count = count+1
        for j in i:
            let = let+1
            
    
    print(count)
    print(let)

    f.close()


CountWord ()
