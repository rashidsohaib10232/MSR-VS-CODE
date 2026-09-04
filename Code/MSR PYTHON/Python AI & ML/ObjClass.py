class Person:
    def __init__(self,n,a,g):
        self.name = n
        self.age = a
        self.gender = g
    def talk(self):
        print("Hi, I am " ,self.name)

    def vote(self):
        if self.age<18:
            print("I am not eligible for vote ")
        else:
            print("I am eligible for vote ")
        
obj1 = Person("Sohaib",18, "male")
obj2 = Person("Sulem",10,"male")
obj3 = Person("Noman",46,"male")
    
print(obj1.name,obj2.name)

obj1.vote()
obj3.vote()