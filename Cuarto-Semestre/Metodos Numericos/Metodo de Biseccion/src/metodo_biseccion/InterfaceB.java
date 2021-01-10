package metodo_biseccion;

/*
 * Esta clase de tipo Interface sirve para poder reciclar y reutilizar el metodo evaluar()
 * ya que además de implmentarse en la clase Funcion puede servir para otros
 * proyectos donde se pueda anexar como un modulo siguiendo la filosofia de POO
 * y el poliformismo
 */

/**
 *
 * @author dennis
 */
public interface InterfaceB {   
    /**
     *
     * @param x
     * @return
     */
    public double evaluar(double x);    // Metodo evaluar que recibe un parametro de tipo double
}                                       // y retorna un valor del mismo tipo
