import mysql.connector
con = mysql.connector.connect(
    host='localhost',
    user = 'root',
    passwd ='sohaib12',
    database = 'msr'
)
cursor =con.cursor()
cursor.execute('select*from student where name = "imran"')
d=cursor.fetchall()
for i in d:
    print(i)



con.close()