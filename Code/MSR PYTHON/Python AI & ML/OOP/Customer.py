class Customer:
    def __init__(self,name, gender):
        self.name = name
        self.gender = gender

def greet(customer):
    if customer.gender == "Male":
        print(f"Hello {customer.name} Sir!")

    else:
        print(f"Hello {customer.name} Madam!")
cust = Customer("Rashid","Male")

greet(cust) 

