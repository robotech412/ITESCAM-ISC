#!/usr/bin/env python
# -*- coding: utf-8 -*-
import numpy as ny
import sys
def suma ():
    print ("SUMA DE MATRICES \t")
    filas = int(input("inserte numero de filas: "))
    columnas = int(input("inserte numero de columnas: "))
    A = [[0 for x in range(filas)] for y in range(columnas)]
    print ("Matriz 1")
    for i in range(filas):
        for j in range(columnas):
            A[i][j] = int(raw_input("Introduce los valores (%d,%d): " % (i, j)))

    filas = int(input("inserte numero de filas:"))
    columnas = int(input(" inserte numero de columnas: "))
    B = [[0 for x in range(filas)] for y in range(columnas)]
    print("Matriz 2")
    for i in range(filas):
        for j in range(columnas):
            B[i][j] = int(raw_input("Introduce los valores (%d,%d): " % (i, j)))

    C = [[0 for x in range(filas)] for y in range(columnas)]
    for i in range(filas):
        for j in range(columnas):
            C[i][j] = A[i][j] + B[i][j]

    def dibujaMatriz(M):
        for i in range(len(M)):
            print '[',
            for j in range(len(M[i])):
                print '{:>3s}'.format(str(M[i][j])),
            print ']'

    print("RESULTADO\t")
    dibujaMatriz(C)

def resta():
    print ("RESTA DE MATRICES \t")
    filas = int(input("inserte numero de filas: "))
    columnas = int(input("inserte numero de columnas: "))
    A = [[0 for x in range(filas)] for y in range(columnas)]
    print ("Matriz 1")
    for i in range(filas):
        for j in range(columnas):
            A[i][j] = int(raw_input("Introduce los valores (%d,%d): " % (i, j)))

    filas = int(input("inserte numero de filas:"))
    columnas = int(input(" inserte numero de columnas: "))
    B = [[0 for x in range(filas)] for y in range(columnas)]
    print("Matriz 2")
    for i in range(filas):
        for j in range(columnas):
            B[i][j] = int(raw_input("Introduce los valores (%d,%d): " % (i, j)))

    C = [[0 for x in range(filas)] for y in range(columnas)]
    for i in range(filas):
        for j in range(columnas):
            C[i][j] = A[i][j] - B[i][j]

    def dibujaMatriz(M):
        for i in range(len(M)):
            print '[',
            for j in range(len(M[i])):
                print '{:>3s}'.format(str(M[i][j])),
            print ']'

    print("RESULTADO\t")
    dibujaMatriz(C)

def multiplicacion():
    fila1 = int(input("Inserte el tamaño de la fila A "))
    columna1 = int(input("Inserte el tamaño de la columna A: "))
    fila2 = int(input("Inserte el tamaño de la fila B: "))
    columna2 = int(input("Inserte el tamaño de la columna B: "))
    #verificacion de la de la multiplicacion
    if (columna1 != fila2):
        print("No es posible hacer la multiplicacion")
        sys.exit()
    matrizA = numpy.zeros((fila1, columna1))
    matrizB = numpy.zeros((fila2, columna2))
    matrizC = numpy.zeros((fila1, columna2))
    print("introduce los elementos de la matriz A")
    for r in range(0, fila1):
        for c in range(0, columna1):
            matrizA[r, c] = input("Elemento a["+str(r+1)+str(c+1)+"]")
    print("Introduce los elementos de la matriz B")
    for r in range(0, fila2):
        for c in range(0, columna2):
            matrizB[r, c] = input("Elemento a["+str(r+1)+str(c+1)+"]")
    #operaciones de multiplicacion
    for r in range(0, fila1):
        for c in range(0, columna2):
            for k in range(0, fila2):
                matrizC[r, c] += matrizA[r, k]*matrizB[k, c]

    print(matrizC)

def multiescalar():
        SC = int(input("Inserte el numero escalar: "))
        fila1 = int(input("Inserte el tamaño de la fila A "))
        columna1 = int(input("Inserte el tamaño de la columna A: "))
        fila2 = int(input("Inserte el tamaño de la fila B: "))
        columna2 = int(input("Inserte el tamaño de la columna B: "))
        # verificacion de la de la multiplicacion
        if (columna1 != fila2):
            print("No es posible hacer la multiplicacion")
            sys.exit()
        matrizA = numpy.zeros((fila1, columna1))
        matrizB = numpy.zeros((fila2, columna2))
        matrizC = numpy.zeros((fila1, columna2))
        print("introduce los elementos de la matriz A")
        for r in range(0, fila1):
            for c in range(0, columna1):
                matrizA[r, c] = input("Elemento a[" + str(r + 1) + str(c + 1) + "]")
        print("Introduce los elementos de la matriz B")
        for r in range(0, fila2):
            for c in range(0, columna2):
                matrizB[r, c] = input("Elemento a[" + str(r + 1) + str(c + 1) + "]")
        # operaciones de multiplicacion
        for r in range(0, fila1):
            for c in range(0, columna2):
                for k in range(0, fila2):
                    matrizC[r, c] += ((matrizA[r, k] * SC) * (matrizB[k, c] * SC))

        print(matrizC)

def determinante():
	print "Ingrese los valores:"
	print "|a00 a01 a02|"
	print "|a10 a11 a12|"
	print "|a20 a21 a22|"

	a00 = float(raw_input('Ingrese el valor a00 '))
	a01 = float(raw_input('Ingrese el valor a01 '))
	a02 = float(raw_input('Ingrese el valor a02 '))
	a10 = float(raw_input('Ingrese el valor a10 '))
	a11 = float(raw_input('Ingrese el valor a11 '))
	a12 = float(raw_input('Ingrese el valor a12 '))
	a20 = float(raw_input('Ingrese el valor a20 '))
	a21 = float(raw_input('Ingrese el valor a21 '))
	a22 = float(raw_input('Ingrese el valor a22 '))




	#               !a00 a10 a20! l2a00 l2a10
	 #              !a01 a11 a21! l2a01 l2a11
	  #             !a02 a12 a22! l2a02 l2a12
	         
	total=a00*a11*a22 + a10*a21*a02 +a20*a01*a12;
	total=total+(a02*a11*a20)*-1 + (a12*a21*a00)*-1 + (a22*a01*a10)*-1;


	if total!=0:
	   print a00," ",a01," ",a02
	   print a10," ",a11," ",a12
	   print a20," ",a21," ",a22
	   print "Determinante 3x3: ",total;


	else:
	    print "Error el det. da 0";

while (True):
        print ("1 = suma")
        print ("2 = resta")
        print ("3 = multiplicacion")
        print ("4 = multipliciacion escalar")
        print ("5 = multiplicacion transpuesta")
        print ("6 = determinante de una matriz")
        print ("7 = salir")

        opcion = int(input("Ingrese opcion\n"))
        if (opcion == 1):
            suma()

        elif (opcion == 2):
            resta()

        elif (opcion == 3):
            multiplicacion()

        elif (opcion == 4):
            multiescalar()

        elif (opcion == 5):
            ()

        elif (opcion == 6):
            determinante()

        elif (opcion == 7):
            break
        else:
            print ("")
            (input("No has pulsado ninguna opción correcta...\npulsa una tecla para continuar"))