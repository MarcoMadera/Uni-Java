// Programa: CALCULOS LOGARITMICOS DE ÁNGULO
//Fecha: 27/Agosto/2015

import java.io.*;
 
public class 5AnguloLog {
	public static void main (String args[]) {
		// Declaraciones
		//Definición de entrada de datos por el teclado
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader (entrada);
		
		//Variable para tomar los datos leidos del flujo de entrada
		String datoEntrada;
		
		//Variables
		double tamAngulo = 0, senAng, cosAng;
		
		System.out.println("\n CALCULOS LOGARITMICOS DE ÁNGULO/N");
		
		//Leer dato
		try {
			System.out.println("-----Entrada de dato-----");
			System.out.println("Teclee el tamaño del ángulo en radianes");
			datoEntrada = flujoEntrada.readLine();
			tamAngulo = Double.parseDouble(datoEntrada);
		} 
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}
		//Calcular
		senAng = Math.sin(tamAngulo);
		cosAng = Math.cos(tamAngulo);
		
		//Imprimir salida
		System.out.println("\n----Salida------");
		System.out.println("Seno = " + senAng);
		System.out.println("Coseno =" + cosAng);
	}
}
