import pandas as pd
from glob import glob
import os
import tkinter
import csv
import tkinter as tk
from tkinter import *

def subjectchoose(text_to_speech):
    def calculate_attendance():
        Subject = tx.get()
        if Subject=="":
            t='Please enter the subject name.'
            text_to_speech(t)
        os.chdir(
            f"D:\\Final Project\\Attendance\\{Subject}"
        )
        filenames = glob(
            f"D:\\Final Project\\Attendance\\{Subject}\\{Subject}*.csv"
        )
        df = [pd.read_csv(f) for f in filenames]
        newdf = df[0]
        for i in range(1, len(df)):
            newdf = newdf.merge(df[i], how="outer")
        newdf.fillna(0, inplace=True)
        newdf["Attendance"] = 0
        # for i in range(len(newdf)):
        #     newdf["Attendance"].iloc[i] = str(int(round(newdf.iloc[i, 2:-1].mean() * 100)))+'%'
        for i in range(len(newdf)):
            newdf.loc[i, "Attendance"] = str(int(round(newdf.iloc[i, 2:-1].mean() * 100)))+'%'

        newdf.to_csv("attendance.csv", index=False)

        root = tkinter.Tk()
        root.title("Attendance of "+Subject)
        root.configure(background="lightgrey")
        cs = f"D:\\Final Project\\Attendance\\{Subject}\\attendance.csv"
        with open(cs) as file:
            reader = csv.reader(file)
            r = 0

            for col in reader:
                c = 0
                for row in col:

                    label = tkinter.Label(
                        root,
                        width=10,
                        height=1,
                        fg="darkblue",
                        font=("times new roman", 15, " bold "),
                        bg="lightgrey",
                        text=row,
                        relief=tkinter.FLAT,
                    )
                    label.grid(row=r, column=c)
                    c += 1
                r += 1
        root.mainloop()
        print(newdf)

    subject = Tk()
    subject.title("Subject...")
    subject.geometry("580x320")
    subject.resizable(0, 0)
    subject.configure(background="lightgrey")
    titl = tk.Label(subject, bg="lightgrey", relief=FLAT, bd=10, font=("times new roman", 30))
    titl.pack(fill=X)
    titl = tk.Label(
        subject,
        text="Which Subject of Attendance?",
        bg="lightgrey",
        fg="brown",
        font=("times new roman", 25,"bold")
    )
    titl.place(x=100, y=12)

    # def Attf():
    #     sub = tx.get()
    #     if sub == "":
    #         t="Please enter the subject name!!!"
    #         text_to_speech(t)
    #     else:
    #         os.startfile(
    #         f"D:\\Final Project\\Attendance\\{sub}"
    #         )



    sub = tk.Label(
        subject,
        text="Enter Subject",
        width=10,
        height=2,
        bg="light grey",
        fg="brown",
        bd=5,
        relief=RIDGE,
        font=("times new roman", 15 ),
    )
    sub.place(x=50, y=100)

    tx = tk.Entry(
        subject,
        width=15,
        bd=5,
        bg="white",
        fg="darkblue",
        relief=RIDGE,
        font=("times new roman", 30, "bold"),
    )
    tx.place(x=190, y=100)

    fill_a = tk.Button(
        subject,
        text="View Attendance",
        command=calculate_attendance,
        bd=7,
        font=("times new roman", 15),
        bg="darkblue",
        fg="white",
        height=2,
        width=12,
        relief=RIDGE,
    )
    fill_a.place(x=240, y=200)
    subject.mainloop()
