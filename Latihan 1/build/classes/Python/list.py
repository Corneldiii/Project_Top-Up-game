kata=[]
while True:
    hasil=input("Masukan data : ")
    if hasil== '':
        break
    else:
        kata.append(hasil)

databaru=list(dict.fromkeys(kata))
print(databaru)