	import java.util.*;
	import java.io.*;

	class Caso1{
		double a, b, c, d;
	
		Vector<String> resultados;
		public Caso1(){
			resultados=new Vector<String>();
		}
	
	public boolean readCase(String valores){
			try{
				String []txt= new String[4];
				txt=valores.split(" ");
				a=Double.parseDouble(txt[0]);
				b=Double.parseDouble(txt[1]);
				c=Double.parseDouble(txt[2]);
				d=Double.parseDouble(txt[3]);
			if (a>0.0 && d>0.0 && a<12.1 && d<8.1 && c==15.0){
				solveCase(a, b, c, d);
				return true;
			}
			else{
				return false;
			}
		}catch(NumberFormatException num){
			return false;
		}
	}
		public void solveCase(double a, double b, double c, double d){
			double result=(b-((c/8)*d));
			resultados.addElement("La temperatura a las "+String.format("%.0f", d)+" es "+String.format("%.0f", result)+" grados");
	}
		public Vector<String> print(){
			File archivo=null;
			FileWriter fw=null;
			PrintWriter bw=null;
		try{
			archivo = new File("Salida1.txt");
			fw = new FileWriter(archivo);
			bw = new PrintWriter(fw);
			for (int i=0; i<resultados.size(); i++){
				bw.println(resultados.elementAt(i));
			}
			bw.close();
		}catch(IOException e){
			System.out.println("No se encontro ningun archivo");
		}finally{
			return resultados;
		} 
	}
	public static void main(String []args){
		Caso1 c = new Caso1();
		try{
			File archivo = new File("Entrada1.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br= new BufferedReader(fr);
			String cadena=br.readLine();
			System.out.println("Entradas:\n");
			while (!cadena.equals("0")){
				if (c.readCase(cadena)==true){
					System.out.println(cadena);
				}
				cadena=br.readLine();
			}
			System.out.println("\nResultados:\n");
				
			for (int i=0; i<c.resultados.size(); i++){
				System.out.println(c.print().elementAt(i));
			}
		}catch(IOException e){
			System.out.println("No se encontro ningun archvio");
		}
	}
}