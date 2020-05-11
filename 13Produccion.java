/*Lee e imprime la produccion de 30 dias, utilizando un arreglo unidimensional
Programa PRODUCCION 30 DIAS
Fecha: 28/Octubre/2015 */
 
	import java.io.*;
	public class 13Produccion {
 		public static void main(String args[]) {
 		//Declaraciones
 		//Definicion de objetos para entrada de datos por el teclado
 		InputStreamReader entrada = new InputStreamReader(System.in);
 		BufferedReader flujoEntrada = new BufferedReader(entrada);
 		
 		//Variable para tomar los datos le�dos del flujo de entrada
 		String datoEntrada;
 		
 		//Variables
 		int produccion[] = new int[30];
 		int i;
 		System.out.println("\nLEE E IMPRIME LA PRODUCCION DE 30 DIAS\n");
 		
 		try {
 			//Leer datos
 			System.out.println("----Entrada de datos----");

 			for (i = 0; i<= 29; i ++) {
 				System.out.print("Teclee produccion[" +i+ "]: ");
 				datoEntrada = flujoEntrada.readLine();
 				produccion[i] = Integer.parseInt(datoEntrada);
 			}
 			
 			//Imprimir salida
 			System.out.println("------Salida------");
 			for (i=0; i<=29; i ++) {
 				System.out.println("Produccion[" +i+ "]= " + produccion[i]);
 			}
		}
 		catch (IOException error) {
 			System.err.println("Error" + error.getMessage());
		}
	}
}
