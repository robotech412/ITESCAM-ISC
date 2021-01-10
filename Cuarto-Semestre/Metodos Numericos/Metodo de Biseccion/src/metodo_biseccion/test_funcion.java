package metodo_biseccion;

import metodo_biseccion.Funcion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dennis
 */
public class test_funcion {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
Funcion fnc = new Funcion("EXP(-X)");
System.out.println(fnc.evaluar(-5));
    }
}
