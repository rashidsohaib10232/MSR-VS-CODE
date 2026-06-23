import threading
import time

def kaam(name):
    print(f"Thread {name} start hua")
    time.sleep(2)   # 2 second ruk jao
    print(f"Thread {name} khatam hua")

# 2 threads banaye
t1 = threading.Thread(target=kaam, args=("A",))
t2 = threading.Thread(target=kaam, args=("B",))

t1.start()
t2.start()

t1.join()
t2.join()

print("Dono threads complete ho gaye")
