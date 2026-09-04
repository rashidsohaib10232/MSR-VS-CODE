class Customer:

    def __init__(self,name,gender,address):
        self.name = name
        self.gender = gender
        self.address = address

    def edit_profile(self,new_name,new_city,new_pin,new_state):
        self.name = new_name
        self.address.change_address(new_city,new_pin,new_state)
