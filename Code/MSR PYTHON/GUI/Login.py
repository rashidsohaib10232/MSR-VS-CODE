from tkinter import *
from PIL import ImageTk, Image
from tkinter import messagebox

def handle_login():
    email = email_input.get()
    passw = pass_input.get()

    if email == 'sohaib@gmail.com' and passw == '1234':
        messagebox.showinfo("Login Successful")
    else:
        messagebox.showerror("Error","Login Failed")
root = Tk()
root.title('Login Form')
root.geometry('350x600')
root.configure(background='#0096DC')

# ✅ Correct way to open the image
img = ImageTk.PhotoImage(Image.open('download (1).jpg'))

# create label with image
img_label = Label(root, image=img)
img_label.pack(pady=30)

text_label = Label(root,text='Flipkart',fg='white',bg='#0096DC')
text_label.pack()
text_label.config(font=('verdana',24))


email_label = Label(root,text='Enter Email',fg ='white',bg='#0096DC')
email_label.pack()
email_label.pack(pady=(20,10))
email_label.config(font=('verdana',12))

email_input = Entry(root,width=50)
email_input.pack(ipady=6,pady=(1,15))


pass_label = Label(root,text='Enter Password',fg ='white',bg='#0096DC')
pass_label.pack()
pass_label.pack(pady=(20,10))
pass_label.config(font=('verdana',12))

pass_input = Entry(root,width=50)
pass_input.pack(ipady=6,pady=(1,15))


login_btn = Button(root,text='Login Here',bg='white',fg='black',width=15,command=handle_login)
login_btn.pack(pady=(10,20))
login_btn.config(font=('verdana',12))


root.mainloop()
