class Fraction:
    def __init__(self,n,d):
        self.num = n
        self.den = d




    def __str__(self):
        return f"{self.num}/{self.den}"
    




x = int(input("Enter num : "))
y = int(input("Enter den : "))

print(Fraction(x,y))

