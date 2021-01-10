package metodo_biseccion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dennis
 */
public class TestBiseccion{

    /**
     * @param args the command line arguments
     */

/* En este test ya estan implementao el metodo raiz
* y se le agregan tres parametros del metodo raiz()	
* los cuales son (intervalo inicial,final,tolerancia)
*/


    public static void main(String[] args) {
        Funcion f = new Funcion("3*(x)+sin(x)-EXP(X)");  //aqui se anexa el texto a parsear 
        Biseccion b = new Biseccion(f);
        System.out.println(b.raiz(0,1,0.001)); 											  			
    }
}

