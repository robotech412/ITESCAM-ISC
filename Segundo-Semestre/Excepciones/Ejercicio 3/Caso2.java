import java.util.*;
import java.io.*;

class Caso2{
	int p, q;
	
	Vector<String> resultados;
	public Caso2(){
		resultados=new Vector<String>();
	}
	
	public boolean readCase(String datos){
		try{
			String []txt= new String[2];
			txt=datos.split(" ");
			p=Integer.parseInt(txt[0]);
			q=Integer.parseInt(txt[1]);
			if (p>q){
				solveCase(p, q);
				return true;
			}
			else{
				return false;
			}
		}catch(NumberFormatException num){
			return false;
		}
	}
	public void solveCase(int p, int q){
		int result=(p-q)/2;
		resultados.addElement(result + " "+ (p-result));
	}
	public Vector<String> print(){
		File archivo=null;
		FileWriter fw=null;
		PrintWriter bw=null;
		try{
			archivo = new File("Salida2.txt");
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
		Caso2 c = new Caso2();
		try{
			File archivo = new File("Entrada2.txt");
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