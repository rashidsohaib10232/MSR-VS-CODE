class User:

    def login(self):
        print("Login")
    def register(self):
        print("Register")

class Student(User):

    def enroll(self):
        print("Enroll")
    def review(self):
        print("Review")

std = Student()
std.login()
std.register()
std.enroll()
std.review()

 