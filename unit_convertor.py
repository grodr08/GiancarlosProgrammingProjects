import tkinter as tk
from tkinter import ttk

def convert():
    mile_input = entry_int.get()
    km_output = round(mile_input * 1.61, 1)
    output_sting.set(km_output)


# window
window = tk.Tk()
window.title('Unit Converter')
window.geometry('300x150')

# title
title_lable = ttk.Label(master= window, text= 'Miles to kilometers', font='Calibri 24 bold')
title_lable.pack()

# input field
input_frame = ttk.Frame(master= window)
entry_int = tk.IntVar()
entry = ttk.Entry(master= input_frame,
                  textvariable= entry_int)
button = ttk.Button(master= input_frame,
                    text= 'Convert',
                    command= convert)
entry.pack(side= 'left', padx= 10)
button.pack(side= 'left')
input_frame.pack(pady= 10)

# output
output_sting = tk.StringVar()
output_label = ttk.Label(master= window,
                         text= 'Output',
                         font= 'Calibri 24',
                         textvariable= output_sting)
output_label.pack(pady= 5)


# run
window.mainloop()