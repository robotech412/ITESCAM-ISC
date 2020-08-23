import java.util.Arrays;

public class listaDennis
{
    //Se define un array bidimensional donde se albergaran los valores pares
    //e impares
    static int [][]arreglo = new int[2][5]; //arreglo bidimensional de dos filas cinco columnas


    //Funcion que llena de valores aleatorios el array "arreglo"

    static void llenaArreglo()
    {
        int z;
        for(int i = 0; i < arreglo.length; i++)
        {
            for(int j = 0; j < arreglo[i].length; j++)
            {
                z = (int)(Math.random() * 98 + 1);
                if(z % 2 == 0)
                {
                    // valor par
                    arreglo[0][j] = z;
                }
                else
                {
                    // valor impar
                    arreglo[1][j] = z;
                }
            }
        }
    }


    //Funcion encargada de ordenar el array

    static void ordenarArreglo()
    {
        // ordenamos los valores pares
        Arrays.sort(arreglo[0]);
        // ordenamos los valores impares
        Arrays.sort(arreglo[1]);
    }

    // Funcion que muestra por pantalla el resultado

    static void imprimir()
    {
        for(int i = 0; i < arreglo.length; i++)
        {
            // Mostramos los titulos
            if(i == 0)
                System.out.println("\t--- Pares ---");
            else if(i == 1)
                System.out.println("\t--- Impares ---");

            // Mostramos los valores
            for(int j = 0; j < arreglo[i].length; j++)
            {
                System.out.print("arreglo[" + i + "][" + j + "] : " + arreglo[i][j]);
                System.out.println("");
            }
        }
    }

    public static void main(String[] args)
    {
        listaDennis arreglo = new listaDennis();
        arreglo.llenaArreglo();
        arreglo.ordenarArreglo();
        arreglo.imprimir();
    }
}