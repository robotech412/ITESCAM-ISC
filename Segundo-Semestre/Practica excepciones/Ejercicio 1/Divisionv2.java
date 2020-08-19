
import java.util.Scanner;
import java.util.InputMismatchException;

public class Divisionv2 {

    private int numerador;
    private int denominador;
    private int resultado;
    boolean ValorFueraDeRango;

    public Divisionv2() { //inicializacion de objetos sin parametros/argumentos
        this.numerador = 0;
        this.denominador = 0;
        this.resultado = 0;
    }

    public void Dividir(boolean ValorFueradeRango) throws ValorFueradeRango, InputMismatchException, ArithmeticException { //metodo dividir, incluye la parte para almacenar e imprimir en un arreglo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para dividir");
        int operaciones;
        System.out.println("inserte la cantidad de operaciones a realizar: ");
        operaciones = entrada.nextInt();

        int[] contenedor = new int[operaciones]; //inicializacion del arreglo contenedor donde [operaciones] es el tama�o del arreglo

        for (int i = 0; i < operaciones; i++) { //ciclo for que se realiza mientras las operaciones sean igual a la cantidad insertada
            try {
                System.out.print("Ingrese el numerador: ");
                numerador = entrada.nextInt();
                System.out.print("Ingrese el denominador: ");
                denominador = entrada.nextInt();
                if (numerador <= 100 && denominador <= 100) {
                    resultado = numerador / denominador;
                    contenedor[i] = resultado; //aqui dice que el iterador (indice)del contenedor empieza a guardar el primer resultado que encuentre
                } else {
                    throw new ValorFueradeRango("Excede el rango");
                }
            } catch (InputMismatchException ex) {
                System.out.print(" inserte solo valores numericos ");
            } catch (ArithmeticException ex) {
                System.out.print("error: division entre cero");
            } catch (ValorFueradeRango ex) {
                throw new ValorFueradeRango("Valor fuera de rango");
            }
        }
        for (int i = 0; i < operaciones; i++) { //bucle for anidado en el acumulador1 para imprimir el arreglo
            System.out.println(contenedor[i]); //aqui se imprime el arreglo contenedor

        }

    }

    class ValorFueradeRango extends Exception {

        public String a;

        public ValorFueradeRango(String a) {
            super();
            a = " Valor fuera de rango";
        }
    }
}
