print ("arreglo 1\n")
print ("tipo de arreglo: matriz cuadrada")
A=[[1,2,3],[4,5,6]]

a=""
for k in range(2):

    for j in range(2):

       # imprime(A[k][j])

        a+=str(A[k][j])+'\t'

    print (a)
    a=""

    B=[[1,2,3],[4,5,6]]

a=""
print("")
print ("arreglo 2\n")
print ("tipo de arreglo: matriz rectangular")
B=[[1,2,3],[4,0,6],[6,1,9]]

b=""

 

for k in range(3):

    for j in range(3):

       # imprime(B[k][j]) filas x comlumnas

        b+=str(B[k][j])+'\t' 

    print (b)

    b=""