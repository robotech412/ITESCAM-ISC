import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.InputMismatchException;
public class Ejercicio7 {

	private double cateto1;
	private double cateto2;
	private double hypotenusa;
	private double x;
	private double a;
	private double b;
	private double c;
	private int opcion;
	public Ejercicio7() {
		cateto1 = 0;
		cateto2 = 0;
		hypotenusa = 0;
		x = 0;
		a = 0;
		b = 0;
		c = 0;
	}
	public void leer()throws InputMismatchException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(" Ingrese los siguientes valores, marque una X al valor a calcular:");
			System.out.println(" 1er dato: cateto opuesto \n 2do dato: cateto adyacente \n 3er dato: hipotenusa");
			System.out.println("ingrese el cateto1: "); //-------------------------------------------------------------------
			try {	//bloque try anidado
				String entrada1 = br.readLine();
				cateto1 = Double.parseDouble(entrada1);
			} catch (NumberFormatException ex) {
				System.out.println(" inserte valores numericos o x como incognita ");
			}		//fin del bloque try catch anidado
			System.out.println("Ingrese el cateto2: ");//-------------------------------------------------------------------
			try {	////bloque try anidado
				String entrada2 = br.readLine();
				cateto2 = Double.parseDouble(entrada2);
			} catch (NumberFormatException ex) {
				System.out.println("inserte valores numericos o x como incognita");
			}//fin del bloque try catch anidado
			System.out.println("Ingrese la hypotenusa: ");//--------------------------------------------------------------------
			try { //boque try anidado
				String entrada3 = br.readLine();
				hypotenusa = Double.parseDouble(entrada3);
			} catch (NumberFormatException ex) {
				System.out.println("inserte valores numericos o x como incognita");
			}	//fin del bloque try catch anidado
		} catch (IOException ex) {
			System.out.println("Error de lectura");
		} catch (InputMismatchException ex) {
			System.out.println("a ingresado una letra, un caracter no permitido o un valor diferente a la incognita x,");
		}

	}
	public  void imprimir() throws NumberFormatException{
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese el # de la variable que usó como incognita: \n 1 para cateto1 \n 2 cateto2 \n 3 hypotenusa");
			String entrada4 = br2.readLine();
			int opcion = Integer.parseInt(entrada4);
			switch (opcion) {
			case 1:
				System.out.println("los datos son: " + a + " " + cateto2 + " " + hypotenusa);
				break;
			case 2:
				System.out.println("los datos son: " + cateto1 + " " + b + " " + hypotenusa);
				break;
			case 3:
				System.out.println("los datos son: " + cateto1 + " " + cateto2 + " " + c);
				break;
			default:
				System.out.println("datos de entrada no validos");
			}
		} catch (NumberFormatException ex) {
			System.out.println("Inserte datos numericos");
		}catch (IOException ex){
			System.out.println("Error de lectura");
		}
	}

public void calculo(){
			if (cateto1 == x) {
			a = Math.sqrt((Math.pow(hypotenusa, 2) - Math.pow(cateto2, 2)));
		}
		if (cateto2 == x) {
			b = Math.sqrt((Math.pow(hypotenusa, 2) - Math.pow(cateto1, 2)));
		}
		if (hypotenusa == x) {
			c = Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
		}
}
	public static void main(String[] args) {
		Ejercicio7 operacion = new Ejercicio7();
		operacion.leer();
		operacion.calculo();
		operacion.imprimir();
	}

}