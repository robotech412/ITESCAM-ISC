
import cmath
def suma():
    a = (input("Ingrese la primera cantidad usando este formato ->10+25j\n"))
    b = (input("Ingrese la segunda cantidad\n"))
    a2= complex(a)
    b2= complex(b)
    resultado= a2+b2
    print("El resultado de la suma es:",resultado)
    print(" ")
def resta():
    a=(input("Ingrese la primera cantidad usando este formato ->10+25j\n"))
    b=(input("Ingrese la segunda cantidad\n"))
    a2= complex(a)
    b2= complex(b)
    resultado= a2-b2
    print("El resultado de la resta es:",resultado)
    print(" ")
def division():
    a=input(("Ingrese la primera cantidad usando este formato ->10+25j\n"))
    b=input(("Ingrese la segunda cantidad\n"))
    a2= complex(a)
    b2= complex(b)
    resultado= a2/b2
    print("El resultado de la division es:",resultado)
    print(" ")
def multiplicacion():
    a=input("Ingrese la primera cantidad usando este formato ->10+25j")
    b=input("Ingrese la segunda cantidad\n")
    a2= complex(a)
    b2= cmplex(b)
    resultado= a2*b2
    print("El resultado de la multiplicacion es:",resultado)
    print(" ")
while (True):
        print ("1 = Suma")
        print ("2 = Resta")
        print ("3 = Multiplicacion")
        print ("4 = Division")
        opcion = int(input("Ingrese solo una opcion\n"))
        if (opcion == 1):
            suma()

        elif (opcion == 2):
            resta()

        elif (opcion == 3):
            multiplicacion()

        elif (opcion == 4):
            division()
