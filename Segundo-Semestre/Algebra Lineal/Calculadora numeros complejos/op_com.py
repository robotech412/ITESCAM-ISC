
import cmath
def suma():
    a = (input("Ingrese primer numero\n"))
    b = (input("Ingrese otro numero\n"))
    a2= complex(a)
    b2= complex(b)
    resultado= a2+b2
    print("El resultado de la suma es:",resultado)
def resta():
    a=input("Introduce el primer numero\n")
    b=input("Introduce el primer numero\n")
    a2= complex(a)
    b2= complex(b)
    resultado= a2-b2
    print("El resultado de la resta es:",resultado)
def division():
    a=input("Introduce el primer numero\n")
    b= input("ntroduce el primer numero\n")
    a2= complex(a)
    b2= complex(b)
    resultado= a2/b2
    print("El resultado de la division es:",resultado)
def multiplicacion():
    a=input("Introduce el primer numero\n")
    b=input("Introduce el primer numero\n")
    a2= complex(a)
    b2= cmplex(b)
    resultado= a2*b2
    print("El resultado de la multiplicacion es:",resultado)

while (True):
        print ("1 = suma")
        print ("2 = resta")
        print ("3 = multiplicacion")
        print ("4 = division")
        opcion = int(input("Ingrese opcion\n"))
        if (opcion == 1):
            suma()

        elif (opcion == 2):
            resta()

        elif (opcion == 3):
            multiplicacion()

        elif (opcion == 4):
            division()
