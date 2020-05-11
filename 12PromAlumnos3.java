//Programa CALCULA PROMEDIO DE ALUMNOS (uso del while)
//Fecha: 15/Octubre/2015

import java.io.*;
public class 12PromAlumnos3 {
	public static void main(String args[]) {
		//Declaraciones
		//definición de objetos para entrada de datos por el teclado
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader(entrada);
		
		//Variable para tomar los datos leídos del flujo de entrada
		String datoEntrada;
		
		//Variables
		String nombreAlum="";
		int cal1,cal2,cal3=0;
		float prom;
		char desea=' ';
		
		System.out.println("\nCALCULA EL PROMEDIO DE ALUMNOS");
		try {
			System.out.print("\n¿Desea procesar alumno(S/N)?: ");
			desea = (char)System.in.read();
			System.in.skip(2);

			while (desea == 'S' || desea == 's') {
				//Leer datos
				System.out.println("\n-------Entrada de datos-------");
				System.out.print("Teclee nombre: ");
				datoEntrada = flujoEntrada.readLine();
				nombreAlum = datoEntrada;
				
				System.out.print("Teclee parcial uno: ");
				datoEntrada = flujoEntrada.readLine();
				cal1 = Integer.parseInt(datoEntrada);
				
				System.out.print("Teclee parcial dos: ");
				datoEntrada = flujoEntrada.readLine();
				cal2 = Integer.parseInt(datoEntrada);
				
				System.out.print("Teclee parcial tres: ");
				datoEntrada = flujoEntrada.readLine();
				cal3 = Integer.parseInt(datoEntrada);
				
				//Calcular
				prom=(cal1+cal2+cal3)/3;
				
				//Imprimir salida
				System.out.println("\n------------Salida----------");
				System.out.println("Nombre = " + nombreAlum);
				System.out.println("promedio = "+ prom);
				
				System.out.print("\n¿Desea procesar otro alumno(S/N)?: ");
				desea = (char)System.in.read();
				System.in.skip(2);
			}
		}
		catch (IOException error) {
			System.err.println("Error " + error.getMessage());
		}
	}
}
		