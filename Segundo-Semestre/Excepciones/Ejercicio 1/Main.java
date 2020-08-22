public class Main {

	public static void main(String[] args) { //metodo main para ejecutar el programa
		Divisionv2 operacion = new Divisionv2(); //objeto Main al cual se le añadira el metodo division()
		try {
			operacion.Dividir(true); //objeto division con el metodo division() añadido
		} catch (Exception a) {
			System.out.println("Excede el rango");
			a.printStackTrace();
		}
	}
}
