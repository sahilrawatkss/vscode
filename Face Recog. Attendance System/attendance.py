import tkinter as tk
from tkinter import *
import numpy as np
from PIL import ImageTk, Image
import pyttsx3


import show_attendance
import takeImage
import trainImage
import automaticAttedance


def text_to_speech(user_text):
    engine = pyttsx3.init()
    engine.say(user_text)
    engine.runAndWait()


haarcasecade_path = "D:\\Final Project\\haarcascade_frontalface_default.xml"
trainimagelabel_path = "D:\\Final Project\\TrainingImageLabel\\Trainner.yml"
trainimage_path = "D:\\Final Project\\TrainingImage"
studentdetail_path = "D:\\Final Project\\StudentDetails\\studentdetails.csv"
attendance_path = "D:\\Final Project\\Attendance"


window = Tk()
window.title("Face Recognizer")
window.geometry("1520x900+0+0")
window.configure(bg="lightblue")


title_label = tk.Label(
    window,
    text="Face Recognition Based Attendance System",
    bg="lightblue",
    fg="darkblue",
    bd=10,
    font=("Helvetica", 35, "bold")
)
title_label.pack(pady=20)


register_img = Image.open("UI_Image/register.png")
register_photo = ImageTk.PhotoImage(register_img)
register_label = Label(window, image=register_photo, bg="lightblue")
register_label.image = register_photo
register_label.place(x=200, y=270)

attendance_img = Image.open("UI_Image/attendance.png")
attendance_photo = ImageTk.PhotoImage(attendance_img)
attendance_label = Label(window, image=attendance_photo, bg="lightblue")
attendance_label.image = attendance_photo
attendance_label.place(x=980, y=270)

verify_img = Image.open("UI_Image/verifyy.png")
verify_photo = ImageTk.PhotoImage(verify_img)
verify_label = Label(window, image=verify_photo, bg="lightblue")
verify_label.image = verify_photo
verify_label.place(x=600, y=270)


def TakeImageUI():
    image_ui = Tk()
    image_ui.title("Take Student Image")
    image_ui.geometry("780x480")
    image_ui.configure(background="lightgrey")
    image_ui.resizable(0, 0)

    
    title_label = tk.Label(image_ui, bg="lightgrey", relief=FLAT, bd=10, font=("Helvetica", 35, "bold"))
    title_label.pack(fill=X)
    title_label = tk.Label(
        image_ui, text="Register Your Face", bg="lightgrey", fg="darkgreen", font=("Helvetica", 30,"bold")
    )
    title_label.place(x=220, y=12)

    
    heading_label = tk.Label(
        image_ui, text="Enter details", bg="lightgrey", fg="brown", bd=10, font=("Helvetica", 24)
    )
    heading_label.place(x=280, y=75)

    
    lbl1 = tk.Label(
        image_ui, text="Enrollment No", width=14, height=2, bg="lightgrey", fg="brown", bd=5,
        relief=RIDGE, font=("Helvetica", 12)
    )
    lbl1.place(x=120, y=130)
    txt1 = tk.Entry(
        image_ui, width=17, bd=5, validate="key", bg="white", fg="darkblue", relief=RIDGE,
        font=("Helvetica", 25)
    )
    txt1.place(x=250, y=130)
    # txt1["validatecommand"] = (txt1.register(testVal), "%P", "%d")

    
    lbl2 = tk.Label(
        image_ui, text="Name", width=14, height=2, bg="lightgrey", fg="brown", bd=5,
        relief=RIDGE, font=("Helvetica", 12)
    )
    lbl2.place(x=120, y=200)
    txt2 = tk.Entry(
        image_ui, width=17, bd=5, bg="white", fg="darkblue", relief=RIDGE, font=("Helvetica", 25)
    )
    txt2.place(x=250, y=200)


    
    def take_image():
        enrollment = txt1.get()
        name = txt2.get()
        if enrollment == "" or name == "":
            text_to_speech("Enrollment & Name required!")
        else:
            takeImage.TakeImage(
                enrollment, name, haarcasecade_path, trainimage_path, text_to_speech
            )
            txt1.delete(0, "end")
            txt2.delete(0, "end")

    
    take_img_button = tk.Button(
        image_ui, text="Take Image", command=take_image, bd=10,
        font=("Helvetica", 18), bg="darkblue", fg="white", height=2,
        width=12, relief=RIDGE
    )
    take_img_button.place(x=130, y=350)

    
    def train_image():
        trainImage.TrainImage(
            haarcasecade_path, trainimage_path, trainimagelabel_path, text_to_speech
        )

    
    train_img_button = tk.Button(
        image_ui, text="Train Image", command=train_image, bd=10,
        font=("Helvetica", 18), bg="darkblue", fg="white", height=2,
        width=12, relief=RIDGE
    )
    train_img_button.place(x=360, y=350)


register_button = tk.Button(
    window, text="Register new student", command=TakeImageUI, bd=10,
    font=("Helvetica", 16), bg="darkblue", fg="white", height=2, width=17, relief=RIDGE
)
register_button.place(x=200, y=520)


def automatic_attendance():
    automaticAttedance.subjectChoose(text_to_speech)


attendance_button = tk.Button(
    window, text="Take Attendance", command=automatic_attendance, bd=10,
    font=("Helvetica", 16), bg="darkblue", fg="white", height=2, width=17, relief=RIDGE
)
attendance_button.place(x=600, y=520)


def view_attendance():
    show_attendance.subjectchoose(text_to_speech)


view_attendance_button = tk.Button(
    window, text="View Attendance", command=view_attendance, bd=10,
    font=("Helvetica", 16), bg="darkblue", fg="white", height=2, width=17, relief=RIDGE
)
view_attendance_button.place(x=1000, y=520)

window.mainloop()
