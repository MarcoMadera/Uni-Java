//Programa SUMA 2 ARREGLOS E IMPRIME LOS ELEMENTOS Y RESULTADOS
//Fecha: 03/Noviembre/2015

import java.io.*;
public class 16Suma2Arreglos { 
  public static void main(String args[]) {
		//Declaraciones
		//Definicion de objetos para entrada de datos por el teclado
		InputStreamReader entrada =new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader(entrada);
		
		//Variables para tormar los datos leídos del flujo de entrada
		String datoEntrada;
		
		//Variables
		float a[] = new float[10];
		float b[] = new float[10];
		float s[] = new float[10];
		int i;
    		
		System.out.println("\nSUMA LOS ELEMENTOS DE DOS ARREGLOS\n");
    		
		try{
			//Leer datos
			System.out.println("---Entrada de datos----");

			for(i = 0; i <9; i ++) {
				System.out.println("Teclee a[" +i+ "]: ");
				datoEntrada = flujoEntrada.readLine();
				b[i] = Float.parseFloat(datoEntrada);
				System.out.println("Teclee b[" +i+ "]: ");
				datoEntrada = flujoEntrada.readLine();
				a[i] = Float.parseFloat(datoEntrada);
				s[i] = a[i] + b[i];
			}
			
			//Imprimir salida
			System.out.println("----Salida-----");
			System.out.println("Arreglo A Arreglo B Arreglo S");
			System.out.println("-------------");

			for (i = 0; i<=9; i++){
				System.out.println(" " + a[i] + "  " +b[i]+ "  " + s[i]);
			}
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}
}    	