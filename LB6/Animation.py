from tkinter import *
import time

root =Tk()
mx = 1000
my = 600

c = Canvas(root, width=mx, height=my)
c.pack()
ball = c.create_oval(10, 10, 100, 100)
ball1 = c.create_oval(10, 10, 100, 100)
ball2= c.create_oval(10, 10, 100, 100)


for i in range(1000):
    c.move(ball,4,1)
    c.move(ball1,2,3)
    c.move(ball2,1,1)

    root.update()
    time.sleep(0.05)

root.mainloop()