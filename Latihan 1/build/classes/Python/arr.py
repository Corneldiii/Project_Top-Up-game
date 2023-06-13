a=int(input("masukan banyak data : "))
angka=[0]*a
i=0
while i<a:
    b=int(input("Masukan angka "))
    if b==0:
        break
    else:
        angka[i]=b
        i+=1
for i in range(a):
    for j in range(a-i-1):
        if angka[j]>angka[j+1]:
            temp=angka[j+1]
            angka[j+1]=angka[j]
            angka[j]=temp

print ("data yang sudah diurutkan")
for x in angka:
    print(x)
    
    
    
    
