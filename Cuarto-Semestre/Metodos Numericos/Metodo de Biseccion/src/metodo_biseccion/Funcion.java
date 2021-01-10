package metodo_biseccion;

/*
* La clase Funcion tiene como objetivo traducir lo que se ingrese en el campo funcion
* a una expresion matematica valida mediante el uso de la libreria JbcParser
*
*/

import com.bestcode.mathparser.IMathParser;             // libreria parser en archivo jar (bajada de jbc Parser)
import com.bestcode.mathparser.MathParserFactory;       // libreria parser en archivo jar (bajada de jbc Parser)
/**
 *
 * @author dennis
 */
public class Funcion implements InterfaceB {

    private final String definicion;                                       // esta variable sirve para recibir el texto a convertir mediante el parser
    private final IMathParser parser = MathParserFactory.create();         // parser  se va a recibir mediante un parametro


    public Funcion (String def) {               // en el contructor de la clase se recibira un argumento o variable de tipo String al isntanciarlo
        definicion = def;
        parser.setExpression(definicion);       // este metodo hace la conversion del string (si es valido)

    }
    public double evaluar(double x) {           // metodo sobrecargado para evaluar la variable (x)
        double resultado = Double.NaN;          // double not a number para que tenga un valor  inicial
        parser.setX(x);                         // metodo propio de la libreria del parser con la variable  a evaluar (variable del metodo de la InterfaceB) se le pasa al parser
        parser.getVariableResolver();           // metodo propio del la libreria del parser
        parser.getOptimizationOn();
                                                // el try catch se usa para controlar la excepcion resultante que suceda al evaluar la variable (x)
        try {
            resultado = parser.getValue();      // este metodo sirve para evaluar (x)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;                       // devuelve el valor de la variable a evaluar
    }

    /**
     * El metodo []evaluar([]) que usa un arreglo sirve para guardar en un arreglo la evaluacion del parametro (x)
     * este metodo guarda hasta donde se evalue la expresion (x) segun la función
     * @param x
     * @return 
     */
    public double[] evaluar(double[] x) {      // Este metodo evalua la variable (x) en funcion de la expresion matematica 
        int n = x.length;                      // para luego poder implementarla en la clase que servira para graficar la función
        double[] r = new double[n];            // 
        for (int i = 0; i < n; i++) {
            r[i] = evaluar(x[i]);
        }
        return r;
    }

    /**
     *
     * @param x0
     * @param xn
     * @param d
     * @return
     */
    public double[] rango(double x0, double xn, double d) {     //este metodo pide un arreglo de tres variables para el graficador
        int n = (int) (Math.abs(xn - x0) / d);
        double[] r = new double[n];                             // x0 = limite inferior
        for (int i = 0; i < n; i++) {                           // xn = limite superior
            r[i] = x0;                                          // d= intervalo metrica o escala a dibujar
            x0 += d;
        }
        return r;
    }
}
