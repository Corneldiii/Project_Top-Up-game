a=int(input("masukan jumlah data : "))
angka=[0]*a
jumlah=0
for i in range(int(a)):
    angka[i]=int(input("masukan data : "))
    jumlah+=angka[i]
rata=float(jumlah/a)
print("rata ratanya : {:.2f}".format(rata))

    