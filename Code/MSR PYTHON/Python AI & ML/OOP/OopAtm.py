class Atm:
    def __init__(self):
        self.__pin = ""
        self.__balance = 0
        self.menu()

    def menu(self):
        user_input = input('''
                   Hello,
                   1. Enter 1 to create pin
                   2. Enter 2 to deposit
                   3. Enter 3 to withdraw
                   4. Enter 4 to check balance
                   5. Enter 5 to exit
                ''')
        if user_input == "1":
            self.create_pin()
        elif user_input == "2":
            self.deposit()
        elif user_input == "3":
            self.withdraw()
        elif user_input == "4":
            self.check_balance()
        else:
            print("Thank u!")

    def create_pin(self):
        self.__pin = input("Enter your Pin : ")
        print("PIN set successfully ")

    def deposit(self):
        temp = input("Enter your PIN : ")
        if temp == self.__pin:
            amount = int(input("Enter the amount : "))
            self.__balance = self.__balance + amount
            print("Deposit successful")
        else:
            print("Invalid PIN! ")

    def withdraw(self):
        temp = input("Enter your PIN : ")
        if temp == self.__pin:
            amount = int(input("Enter the amount : "))
            if amount <= self.__balance:
                self.__balance = self.__balance - amount
                print("Withdraw successful")
                print("Current Balance ", self.__balance)
            else:
                print("Insufficient funds")
        else:
            print("Invalid PIN! ")

    def check_balance(self):
        temp = input("Enter your PIN : ")
        if temp == self.__pin:
            print("Your account Balance is ", self.__balance)
        else:
            print("Invalid PIN! ")


atm = Atm()
atm.menu()
