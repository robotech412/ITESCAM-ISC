import java.util.*;
import java.io.*;

class Caso3{
	int valor;
	
	Vector<String> resultados;
	public Caso3(){
		resultados=new Vector<String>();
	}
	
	public boolean readCase(String valores){
		try{
			valor=Integer.parseInt(valores);
			solveCase(valor);
			return true;
		}catch(NumberFormatException num){
			return false;
		}
	}
	public void solveCase(int a){
		int result=((a+40)/7);
		resultados.addElement(result + " "+ (result*3)+ " "+ ((result*3)-40));
	}
	public Vector<String> print(){
		File archivo=null;
		FileWriter fw=null;
		PrintWriter bw=null;
		try{
			archivo = new File("Salida3.txt");
			fw = new FileWriter(archivo);
			bw = new PrintWriter(fw);
			for (int i=0; i<resultados.size(); i++){
				bw.println(resultados.elementAt(i));
			}
			bw.close();
		}catch(IOException e){
			System.out.println("No se encontro el archivo");
		}finally{
			return resultados;
		} 
	}
	public static void main(String []args){
		Caso3 c = new Caso3();
		try{
			File archivo = new File("Entrada3.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br= new BufferedReader(fr);
			String cadena=br.readLine();
			System.out.println("Entradas:\n");
			while (!cadena.equals("0")){
				if (c.readCase(cadena)==true){
					System.out.println(cadena);
				}else{
					System.out.println("Se han ingresado datos no validos");
				}
				cadena=br.readLine();
			}
			System.out.println("\nResultados:\n");
				
			for (int i=0; i<c.resultados.size(); i++){
				System.out.println(c.print().elementAt(i));
			}
		}catch(IOException e){
			System.out.println("No se encontro el archivo");
		}
	}
}