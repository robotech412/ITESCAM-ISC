//import java.io.*;

public class Ejercicio2 {

    public double promedio(String[] valores) { //metdo para sacar el promedio
        double suma = 0; //inicializa variable suma
        for (int i = 0; i < 12; i++) {
            suma += Double.parseDouble(valores[i]);// conversion de valores
        }
        return suma / valores.length; //retorno del valor del promedio
    }
    public double mayor(){
        double mayor=0;
            if (suma>valores.length);
            mayor=mayor+1;
            return mayor;
    }

    public static void main(String[] args) {
        try {
            Ejercicio2 ej = new Ejercicio2();
            System.out.println(ej.promedio(args)); //arreglo
        } catch (NumberFormatException ex) {
            System.out.println("error: entrada de texto en campo numerico");
        }
    }
}
