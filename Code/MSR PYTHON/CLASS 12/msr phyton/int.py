import mysql.connector

con = mysql.connector.connect(
    host='localhost',
    user='root',
    passwd='sohaib12',
    database='python_db'
)

cursor = con.cursor()
"""
cursor.execute('''
CREATE TABLE STUDENT (
    NAME VARCHAR(30) NOT NULL,
    ROLLNO INT PRIMARY KEY,
    CLASS VARCHAR(5),
    ADDRESS VARCHAR(50),
    PERCENTAGE FLOAT
)
''')


"""

SQL = '''
INSERT INTO student
(ROLLNO, NAME, CLASS, MARKS, FATHER_NAME, MOTHER_NAME, PHONE, DOB, STREAM, CLASS_TEACHER, ADDRESS)
VALUES
(1,'Ali Khan',10,78,'Rashid Khan','Sana Khan','9876543210','2006-01-12','Science','Mr Sharma','Lucknow'),
(2,'Sohaib Ahmad',11,82,'Javed Ahmad','Nazia Ahmad','9876543211','2005-03-22','Commerce','Mrs Gupta','Kanpur'),
(3,'Ayaan Malik',12,75,'Imran Malik','Farah Malik','9876543212','2004-07-15','Arts','Mr Verma','Delhi'),
(4,'Zaid Hussain',10,69,'Arif Hussain','Shabana Hussain','9876543213','2006-02-10','Science','Mr Sharma','Aligarh'),
(5,'Rehan Sheikh',11,85,'Salim Sheikh','Rukhsar Sheikh','9876543214','2005-05-18','Commerce','Mrs Gupta','Mumbai'),

(6,'Arman Ali',12,72,'Yusuf Ali','Parveen Ali','9876543215','2004-08-09','Arts','Mr Verma','Bhopal'),
(7,'Faizan Khan',10,88,'Rafiq Khan','Salma Khan','9876543216','2006-09-25','Science','Mr Sharma','Lucknow'),
(8,'Sameer Ansari',11,67,'Iqbal Ansari','Nusrat Ansari','9876543217','2005-11-11','Commerce','Mrs Gupta','Kanpur'),
(9,'Imran Qureshi',12,74,'Shahid Qureshi','Zeenat Qureshi','9876543218','2004-12-05','Arts','Mr Verma','Hyderabad'),
(10,'Adil Khan',10,91,'Faisal Khan','Shazia Khan','9876543219','2006-04-14','Science','Mr Sharma','Delhi'),

(11,'Rohit Sharma',11,79,'Mahesh Sharma','Sunita Sharma','9876543220','2005-06-01','Commerce','Mrs Gupta','Jaipur'),
(12,'Amit Verma',12,83,'Rajesh Verma','Kavita Verma','9876543221','2004-10-20','Arts','Mr Verma','Agra'),
(13,'Vikas Yadav',10,68,'Suresh Yadav','Rekha Yadav','9876543222','2006-03-03','Science','Mr Sharma','Varanasi'),
(14,'Deepak Singh',11,77,'Ramesh Singh','Pooja Singh','9876543223','2005-09-09','Commerce','Mrs Gupta','Patna'),
(15,'Ankit Mishra',12,86,'Dinesh Mishra','Seema Mishra','9876543224','2004-02-17','Arts','Mr Verma','Prayagraj'),

(16,'Rahul Gupta',10,73,'Mukesh Gupta','Neha Gupta','9876543225','2006-07-21','Science','Mr Sharma','Kanpur'),
(17,'Sahil Khan',11,81,'Akram Khan','Farida Khan','9876543226','2005-08-13','Commerce','Mrs Gupta','Lucknow'),
(18,'Nadeem Shaikh',12,66,'Khalid Shaikh','Rubina Shaikh','9876543227','2004-11-30','Arts','Mr Verma','Mumbai'),
(19,'Irfan Pathan',10,89,'Yunus Pathan','Shamima Pathan','9876543228','2006-05-05','Science','Mr Sharma','Surat'),
(20,'Wasim Akram',11,92,'Akhtar Akram','Saira Akram','9876543229','2005-01-28','Commerce','Mrs Gupta','Delhi'),

(21,'Harsh Tiwari',12,70,'Kamal Tiwari','Rita Tiwari','9876543230','2004-06-06','Arts','Mr Verma','Lucknow'),
(22,'Karan Mehta',10,84,'Sunil Mehta','Anita Mehta','9876543231','2006-10-10','Science','Mr Sharma','Chandigarh'),
(23,'Nikhil Jain',11,76,'Pankaj Jain','Sushma Jain','9876543232','2005-12-19','Commerce','Mrs Gupta','Indore'),
(24,'Arjun Kapoor',12,88,'Raj Kapoor','Meena Kapoor','9876543233','2004-09-27','Arts','Mr Verma','Mumbai'),
(25,'Ravi Chauhan',10,65,'Mahavir Chauhan','Kamla Chauhan','9876543234','2006-03-14','Science','Mr Sharma','Meerut'),

(26,'Salman Khan',11,90,'Salim Khan','Helen Khan','9876543235','2005-07-07','Commerce','Mrs Gupta','Mumbai'),
(27,'Shahrukh Khan',12,93,'Taj Khan','Latif Khan','9876543236','2004-04-04','Arts','Mr Verma','Delhi'),
(28,'Aamir Khan',10,87,'Taher Khan','Zeenat Khan','9876543237','2006-08-08','Science','Mr Sharma','Mumbai'),
(29,'Varun Dhawan',11,74,'David Dhawan','Karuna Dhawan','9876543238','2005-02-02','Commerce','Mrs Gupta','Mumbai'),
(30,'Ranbir Kapoor',12,85,'Rishi Kapoor','Neetu Kapoor','9876543239','2004-01-01','Arts','Mr Verma','Mumbai'),

(31,'Ayush Sharma',10,69,'Pradeep Sharma','Rekha Sharma','9876543240','2006-11-11','Science','Mr Sharma','Jaipur'),
(32,'Manish Gupta',11,78,'Sanjay Gupta','Alka Gupta','9876543241','2005-03-30','Commerce','Mrs Gupta','Delhi'),
(33,'Pankaj Tripathi',12,82,'Banaras Tripathi','Hemlata Tripathi','9876543242','2004-05-05','Arts','Mr Verma','Patna'),
(34,'Raj Kumar',10,71,'Shiv Kumar','Geeta Kumar','9876543243','2006-06-16','Science','Mr Sharma','Lucknow'),
(35,'Sunil Kumar',11,80,'Om Kumar','Lata Kumar','9876543244','2005-09-21','Commerce','Mrs Gupta','Kanpur'),

(36,'Mohit Saini',12,67,'Ravi Saini','Kusum Saini','9876543245','2004-12-12','Arts','Mr Verma','Rohtak'),
(37,'Ajay Devgan',10,88,'Veeru Devgan','Veena Devgan','9876543246','2006-02-02','Science','Mr Sharma','Mumbai'),
(38,'Akshay Kumar',11,91,'Hari Kumar','Aruna Kumar','9876543247','2005-08-08','Commerce','Mrs Gupta','Delhi'),
(39,'Hrithik Roshan',12,94,'Rakesh Roshan','Pinkie Roshan','9876543248','2004-07-07','Arts','Mr Verma','Mumbai'),
(40,'Tiger Shroff',10,86,'Jackie Shroff','Ayesha Shroff','9876543249','2006-03-03','Science','Mr Sharma','Mumbai'),

(41,'Suresh Raina',11,83,'Trilok Raina','Parveen Raina','9876543250','2005-01-01','Commerce','Mrs Gupta','Ghaziabad'),
(42,'Virat Kohli',12,95,'Prem Kohli','Saroj Kohli','9876543251','2004-11-05','Arts','Mr Verma','Delhi'),
(43,'Rohit Roy',10,77,'Sanjay Roy','Meena Roy','9876543252','2006-04-04','Science','Mr Sharma','Kolkata'),
(44,'Yuvraj Singh',11,89,'Yograj Singh','Shabnam Singh','9876543253','2005-12-12','Commerce','Mrs Gupta','Chandigarh'),
(45,'MS Dhoni',12,96,'Pan Singh','Devaki Devi','9876543254','2004-07-07','Arts','Mr Verma','Ranchi'),

(46,'Hardik Pandya',10,84,'Himanshu Pandya','Nalini Pandya','9876543255','2006-10-11','Science','Mr Sharma','Baroda'),
(47,'KL Rahul',11,88,'Lokesh Rahul','Rajeshwari Rahul','9876543256','2005-04-18','Commerce','Mrs Gupta','Bangalore'),
(48,'Jasprit Bumrah',12,92,'Jasbir Bumrah','Daljit Bumrah','9876543257','2004-12-06','Arts','Mr Verma','Ahmedabad'),
(49,'Ravindra Jadeja',10,85,'Anirudh Jadeja','Lata Jadeja','9876543258','2006-03-01','Science','Mr Sharma','Rajkot'),
(50,'Shubman Gill',11,87,'Lakhwinder Gill','Kirandeep Gill','9876543259','2005-09-08','Commerce','Mrs Gupta','Punjab');

'''

cursor.execute(SQL)

print("Table created successfully")
con.commit()

con.close()