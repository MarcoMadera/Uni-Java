//Programa CALCULA PROMEDIO DE UN ALUMNo
//Fecha 17/Septiembre/2015

import java.io.*;
public class 7PromAlumno2 {
	public static void main (String args[]) {
		//Declaraciones
		//Definicion de objetos para entrada de datos por el teclado
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader(entrada);
		
		//Variable para tomar los datos leidos del flujo de entrada
		String datoEntrada;
		
		//Variables
		String nombreAlum="", observacion;
		float calif1=0, calif2=0, calif3=0, calif4=0, promedio;
		
		System.out.println("\n    CALCULA PROMEDIO DE UN ALUMNO\n");
		
		//Leer datos
		try {
			System.out.println("----------Entrada de datos---------");
			System.out.print("Teclee nombre: ");
			datoEntrada = flujoEntrada.readLine();
			nombreAlum = datoEntrada;
			
			System.out.print("Teclee calificacion 1: ");
			datoEntrada = flujoEntrada.readLine();
			calif1 = Float.parseFloat(datoEntrada);
			
			System.out.print("Teclee calificacion 2: ");
			datoEntrada = flujoEntrada.readLine();
			calif2 = Float.parseFloat(datoEntrada);
			
			System.out.print("Teclee calificacion 3: ");
			datoEntrada = flujoEntrada.readLine();
			calif3 = Float.parseFloat(datoEntrada);
			
			System.out.print("Teclee calificacion 4: ");
			datoEntrada = flujoEntrada.readLine();
			calif4 = Float.parseFloat(datoEntrada);
		}
		catch (IOException error) {
			System.err.println("Error " + error.getMessage());
		}
		//Calcular
		promedio = (calif1 + calif2 + calif3+ calif4)/4;
		if (promedio >= 60)
			observacion = "Aprobado";
		else
			observacion = "Reprobado";
				
		//Imprimir Salida
		System.out.println("\n-----Salida-----");
		System.out.println("Nombre = " + nombreAlum);
		System.out.println("Promedio = " + promedio);
		System.out.println("Observaciones = "+ observacion);
	}    
}