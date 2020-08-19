import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Ejercicio6 {

	double cateto1;
	double cateto2;
	double resultado;
	public Ejercicio6() {
		cateto1 = 0;
		cateto2 = 0;
	}

	public void calculo() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("ingrese el cateto1: ");
			String entrada = br.readLine();
			cateto1 = Double.parseDouble(entrada);
			System.out.println("Ingrese el cateto2: ");
			String entrada2 = br.readLine();
			cateto2 = Double.parseDouble(entrada2);
		} catch (IOException ex) {
			System.out.println("Error de E/S");
		}
		resultado = Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2,2));
	}
	public void datos() {
		System.out.println("el resultado es: " + resultado);

	}
	public static void main(String[] args) {
		Ejercicio6 operacion = new Ejercicio6();
		operacion.calculo();
		operacion.datos();
	}
}