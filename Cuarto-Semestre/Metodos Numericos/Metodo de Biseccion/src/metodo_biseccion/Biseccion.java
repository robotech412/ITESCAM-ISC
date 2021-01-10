package metodo_biseccion;

/* 
 * En esta clase se aloja el algoritmo
 * del metodo biseccion pasado a codigo
 */

/**
 *
 * @author dennis
 */
public class Biseccion{
    InterfaceB f;               // se crea un atributo/variable  de tipo Interface (InterfaceB)
    private int iteraciones;    /* esta variable se usa para calcular el numero de iteraciones
                                * que se haran durante la ejecucion del algortimo
                                */ 


    /**
     *
     * @param funcion
     */

    public Biseccion(InterfaceB funcion) {      // En el constructor de la clase se recibe un parametro  de tipo interface (InterfaseB)
        f = funcion;                            //  al atributo f se le pasa el parametro que se esta recibiendo (funcion);
       
    }

    /**
     * En el metodo raiz se piden los parametros y metodos siguientes
     * f es el atributo sobre el que se usa el metodo eval() de la clase InterfaceB
     * eval(x); es el metodo que se usa para evaluar el argumento requerido en el atibuto f
     * @param x0 valor inicial
     * @param x1 valor final
     * @param t tolerancia
     * @return x
     */
    public final double raiz(double x0, double x1, double t) {  // se reciben tres parametros en el metodo
        Double x = Double.NaN;                                  // valor inicial not a number
        if (f.evaluar(x0) * f.evaluar(x1) < 0) {                // f(x) evaluada en x1 y x0 (formula) para saber si existen o no raices
            do {
                x = (x0 + x1) / 2;
                if (f.evaluar(x0) * f.evaluar(x) < 0) {        //f(x) evaluada en x0 y (x) mientras sean menor que cero
                    x1 = x;
                } else {                                      // en el if y el else se hace el cambio de variable
                    x0 = x;
                }
            } while (Math.abs(f.evaluar(x)) > t);             // si es mayor que la tolerancia se siguen realizando los calculss
        }                                                     // el absoluto de la funcion debe ser mayor o igual que la tolerancia
        return x;
    }
    
        public final double iteraciones(double x0, double x1, double t) {
        Double x = Double.NaN; //valor inicial not a number
        if (f.evaluar(x0) * f.evaluar(x1) < 0) {
            do {
                x = (x0 + x1) / 2;
                if (f.evaluar(x0) * f.evaluar(x) < 0) {
                    x1 = x;
                } else {
                    x0 = x;
                }
               //
            } while (Math.abs(f.evaluar(x)) > t);
        }//iteraciones++;
        return iteraciones;
    }
    
    
}
