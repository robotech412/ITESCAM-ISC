public class Ejercicio3{
	
	
	public boolean esPalindromo(String cadena){
		StringBuffer cadenainversa = new StringBuffer(cadena);
		cadenainversa = cadenainversa.reverse();
		return cadena.equals(cadenainversa.toString());
		
	}
	
	public static void main (String args[]){
	
		Ejercicio3 ej= new Ejercicio3 ();
		try{
			if (ej.esPalindromo(args[0]))
				System.out.println( "Es palindromo");
			
			else 
				System.out.println("No es palindromo");
		}
		catch (Exception e){
			
			System.out.println( " No hay datos ");
			
			
		}
	}
	
}