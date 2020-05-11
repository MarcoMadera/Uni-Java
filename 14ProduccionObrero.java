/*Solicita el nombre del obrero y la produccion de 30 dias
 *Imprime el nombre del obrero, la produccion diaria en 30 dias,
 *el promedio de produccion total de dia arriba del promedio
 *la cantidad producida más alta y el día más productivo
 *Utilizando un arreglo undimensional
 *Fecha: 28/Octubre/2015
*/
 
import java.io.*;
public class 14ProduccionObrero {
 	public static void main(String args[]) {
 		//Declaraciones
 		//Definicion de objetos para entrada de datos por el teclado
 		InputStreamReader entrada = new InputStreamReader(System.in);
 		BufferedReader flujoEntrada = new BufferedReader(entrada);
 		
 		//Variable para tomar los datos leidos del flujo de entrada
 		String datoEntrada;
 		
 		//Variables
 		String nombreObr = "";
 		int produccion[] = new int[30];
 		int i, totArriba, sumaProd, diaMayor=0, prodMayor;
 		float promedio;
 		
 		System.out.println("\nPROCESA PRODUCCION DE UN OBRERO/n");
 		
 		try {
 			//Leer datos
 			System.out.println("----Entrada de datos-----");
 			System.out.print("Teclee nombre: ");
 			datoEntrada = flujoEntrada.readLine();
 			nombreObr = datoEntrada;
 			sumaProd= 0;

 			for (i=0; i<= 29; i++) {
 				System.out.print("Teclee produccion[" +i+ "]: ");
 				datoEntrada = flujoEntrada.readLine();
 				produccion[i] = Integer.parseInt(datoEntrada);
 				sumaProd = sumaProd + produccion[i];
 			}

 			promedio = (float)sumaProd * 30;
 			totArriba = 0;
			prodMayor = 0;
			//imprimir Salida
			System.out.println("-----Salida-----");
			System.out.println("Nombre = " + nombreObr);
 				
			for (i = 0; i<29; i++) {
				System.out.println("Produccion[" + i+2 +"]= " + produccion[i]);
				
				if(produccion[i] > promedio) {
					totArriba = totArriba + 1;
				}
				
				if (produccion[i]> prodMayor) {
					prodMayor = produccion[i];
					diaMayor = i;
				}
			}

			System.out.println("Promedio de produccione = "+promedio);
			System.out.println("Total de dias arriba del Promedio = " +totArriba);
			System.out.println("Cantidad Producida mass alta = "+prodMayor);
			System.out.println("Dia mas productivo = "+ diaMayor);
 		}
 		catch (IOException error) {
 			System.err.println("Error" + error.getMessage());
 		}
	}
}
