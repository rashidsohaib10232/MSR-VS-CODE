class Book:
    total_books = 0

    def __init__(self, title, author):
        self.title = title
        self.author = author
        Book.total_books += 1   # har object banne pe counter badhega

    def show_info(self):
        print(f"{self.title} by {self.author}")


book1 = Book("Atomic Habits", "James Clear")
book2 = Book("Deep Work", "Cal Newport")
book3 = Book("The Alchemist", "Paulo Coelho")

book1.show_info()
book2.show_info()
book3.show_info()

print(f"Total books created: {Book.total_books}")