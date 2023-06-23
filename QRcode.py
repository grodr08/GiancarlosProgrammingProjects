import qrcode

data = "https://blackboard.louisville.edu/?new_loc=%2Fultra%2Fcourse"

qr = qrcode.QRCode(version=1,
                   box_size=10,
                   border=5)

qr.add_data(data)

qr.make(fit=True)
img = qr.make_image(fill_color = 'green',
                    back_color = 'black')

img.save('MyQRCode.png')