import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Loteria2 { 
    Vector<Carta> mazo;
    public Loteria2(){
        mazo= new Vector<Carta>();
    }
    
    public void leerDatos(){
                try {
            BufferedReader bufer = new BufferedReader(new FileReader("cartasd.in")); //constructor sobrecargado para lectura de lineas
            String acumulador = ""; // null, aqui se guardara la linea de texto
            while ((acumulador = bufer.readLine()) != null) {
                StringTokenizer coma = new StringTokenizer(acumulador, ","); //se invoca al stringtokenizer y se indica el delimitador
                String numero = coma.nextToken().trim();
                String imagen = coma.nextToken().trim();
                String copla = coma.nextToken().trim();
                System.out.println("Numero es: " + numero);
                System.out.println("Imagen es: " + imagen);
                System.out.println("Copla: " + copla);
                Carta x = new Carta (numero, imagen, copla); 
                mazo.addElement(x);
            }
            bufer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    
    }
    
    public String showCartaAt(int p){
        return mazo.elementAt(p).showCarta();
    }
    
    public static void main(String[] args) {
        Loteria2 juego = new Loteria2();
        juego.leerDatos();
        //--------------------
}

//public class Loteria{
    
//}

public class Carta{
    String numero;
    String imagen;
    String copla;
    
    public Carta(String n, String b, String c){
        this.numero = n;
        //nombre = a; deshabilitado
        this.imagen = b;
        this.copla = c;
    }
    
    public String showCarta(){
        return ("numero: " + numero+"imagen: "+imagen+"copla: "+copla);
    }
}
}