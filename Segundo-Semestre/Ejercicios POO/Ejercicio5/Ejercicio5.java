import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.util.Scanner;

public class Ejercicio5 {
	static double Calificaciones[];
	static String Alumnos[];
	static int Edad[];
	static double Promedio;
	static int n;

	public Ejercicio5(){
		Calificaciones = new double[n];
		Alumnos = new String[n];
		Edad= new int[n];
	}

	public static void Datos(double Calificaciones[], String Alumnos[], int Edad[], Scanner Teclado) {
		for (int i = 0; i < Calificaciones.length; i++) {
			System.out.println("Ingrese el nombre del alumno: ");
			Alumnos[i] = Teclado.next();
			System.out.print("Ingrese la edad: ");
			Edad[i] = Teclado.nextInt();
			System.out.print("Ingrese la calificación: ");
			Calificaciones[i]=Teclado.nextDouble();
		}
	}

	public static double Promedio(double Calificaciones[]){
		double prom,acumulador = 0;
		for (int i = 0;i< Calificaciones.length;i++)
			acumulador+=Calificaciones[i];
			prom= acumulador/Calificaciones.length;
			return prom;
	}
	public static void Imprimir(double Calificaciones[],String Alumnos[],double Promedio){	
		System.out.printf("%-15s %-15s%n%n","Alumnos","Calificación");
		for(int i=0;i<Calificaciones.length;i++){
			System.out.printf("%-15s %-15f%n%n", Alumnos[i],Calificaciones[i]);
			//System.out.println("\nEl promedio grupal es: "+Promedio);
		}
		System.out.printf("\nEl promedio grupal es: "+Promedio);
	}
	public static void Mayor(double Calificaciones[],String Alumnos[]){
		double Mayor=0;
		String Alumno=null;
		for (int i=0;i<Calificaciones.length;i++)
			if (Calificaciones[i]>Mayor)
			{
				Mayor=Calificaciones[i];
				Alumno= Alumnos[i];
			}
		System.out.println("\nLa calificación mas alta es: "+Mayor+"\nEl cual es del alumno: "+Alumno);
	}

	public static void main(String[] args){
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alumnos: ");
		n = Teclado.nextInt();
		Ejercicio5 boleta= new Ejercicio5();
		boleta.Datos(Calificaciones,Alumnos,Edad,Teclado);
		Promedio= boleta.Promedio(Calificaciones);
		Imprimir(Calificaciones,Alumnos,Promedio);
		Mayor(Calificaciones, Alumnos);
	}
}