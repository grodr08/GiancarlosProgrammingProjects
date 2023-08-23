import tkinter as tk
def convert():
    try:
        height_input = float(entry_height.get())
        weight_input = float(entry_weight.get())

        height_in = height_input * 12

        result_one = (weight_input * 703) / height_in
        finalResult = round(result_one / height_in, 1)

        output_string.set('Your Body Mass Index: ' + str(finalResult))

        if (finalResult < 18.5):
            result_label.config(text='Underweight')
        elif (finalResult >= 18.5 and finalResult <= 24.9):
            result_label .config(text='Healthy!')
        elif (finalResult >= 25 and finalResult <= 29.9):
            result_label.config(text='Overweight')
        else:
            result_label.config(text='Obesity')
    except ValueError:
        output_string.set('''
        Please enter
           numbers
        ''')

# window
window = tk.Tk()
window.title('BMI Calculator')
window.geometry('300x300')
window.configure(background='lightblue')

# title
title_table = tk.Label(master=window, text= 'BMI CALCULATOR', font='Calibri 20 bold', bg='lightblue')
title_table.pack()

# Height Field
height = tk.IntVar()
entry_height = tk.Entry(window, textvariable=height, width=10)
entry_height.place(x=50, y= 70)

height_label = tk.Label(window,text='Height in ft', font='calibri 12 bold', bg='lightblue')
height_label.place(x=140, y=66)

# Weight Field
weight = tk.IntVar()
entry_weight = tk.Entry(window, textvariable=weight, width=10)
entry_weight.place(x=50, y=100)

weight_label = tk.Label(window, text='Weight in lbs', font='calibri 12 bold', bg='lightblue')
weight_label.place(x=140, y=96)

# Calculate Bottom
calculate_bottom = tk.Button(window, text='Calculate', command=convert)
calculate_bottom.place(x=100, y=140)

# Output Field
output_string = tk.StringVar()
output_label = tk.Label(window, text='', font='Calibri 16', textvariable=output_string, bg='lightblue')
output_label.place(x=30, y=170)

result_label = tk.Label(window, text='', font='Calibri 24', bg='lightblue')
result_label.place(x=60, y=220)

# run
window.mainloop()
