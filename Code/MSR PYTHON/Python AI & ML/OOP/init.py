class Bags:
    def __init__(self, material, zips, pockets):
        self.material = material
        self.zips = zips
        self.pockets = pockets

reebok = Bags("leather",3,4)
campus = Bags("polyster",4,5)

print(reebok.material)