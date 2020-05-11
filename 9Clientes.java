/* Determina el total a pagar por articulo para un cliente utilizando el do... while
Programa CLIENTES CON ARTÍCULOS
Fecha: 01/Octubre/2015 */

import java.io.*; 
public class 9Clientes {
  public static void main(String[] args) {
		//Declaraciones
		//Definición de objetos para entrada de datos por el teclado
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader(entrada);
		
		//Variable para tomar los datos leídos del flujo de entrada
		String datoEntrada;
		
		//Variables
		String nombreClie="", articulo="";
		char otro=' ', hay= ' ';
		int totClientes , cantidad ;
		float precio, totPagar, totPagarClie, totPagarGral;
		
		System.out.println("\n    PROCESA LA VENTA A VARIOS CLIENTES/n");
	
		try {
			System.out.println("   REPORTE DE VENTAS");
			System.out.println("NOMBRE       ARTÍCULO    TOTAL PAGAR");
			System.out.println("--------------------");
			totClientes = 0;
			totPagarGral = 0;
	
			do {
				//Leer datos
				System.out.println("\n--------Entrada de datos--------");
				System.out.print(" Teclee nombre: ");
				datoEntrada = flujoEntrada.readLine();
				nombreClie = datoEntrada;
				
				System.out.print("Nombre = " + nombreClie);
				totPagarClie = 0;

				do {
					System.out.print("\n Teclee articulo: ");

					datoEntrada = flujoEntrada.readLine();
					articulo = datoEntrada;
					
					System.out.print("Teclee cantidad de articulos: ");
					datoEntrada = flujoEntrada.readLine();
					cantidad = Integer.parseInt(datoEntrada);
					
					System.out.print("Teclee precio unitario: ");
					datoEntrada = flujoEntrada.readLine();
					precio = Float.parseFloat(datoEntrada);
					
					totPagar = cantidad * precio;
					System.out.println("Articulo = " + articulo);
					System.out.println("Total a pagar = " + totPagar);
					totPagarClie = totPagarClie + totPagar;
					
					System.out.print("\n¿Desea procesar otro artículo(S/N)?: ");
					hay = (char)System.in.read();
					System.in.skip(2);
				} while (otro == 'S' || hay == 'S');
				
				//Imprimir salida
				System.out.println("Total a pagar cliente =  + totPagarClie");
				
				totClientes = totClientes + 1;
				totPagarGral= totPagarGral + totPagarClie;
				
				System.out.print("\n¿Desea procesar otro cliente (S/N)?: ");
				otro = (char) System.in.read();
				System.in.skip(2);
			} while (otro =='S' || otro == 's');

			System.out.println("\n------------Total-----------");
			System.out.println("Total clientes = " + totClientes);
			System.out.println("Total a pagar general =" + totPagarGral);
		}
		catch (IOException error) {
			System.err.println("Error " + error.getMessage());
    }
	}
}
    