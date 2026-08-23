class Car:
    wheels = 4      # class attribute - common for all cars
    def __init__(self , brand, color):
        self.brand = brand      # instance attribute
        self.color = color      # instance attribute

    def details(self):
        #print("This is a ",self.color," ",self.brand, " with ",self.wheels," wheels")
        print(f"This is a {self.color} {self.brand} with {self.wheels} wheels")

car1 = Car("Honda","red")       # object

car2 = Car("Tesla","white")

car1.details()      # This is a red Honda with 4 wheels
car2.details()

# Now change class attribute

Car.wheels = 6

car1.details()   # This is a red Honda with 6 wheels
car2.details()   # This is a white Tesla with 6 wheels