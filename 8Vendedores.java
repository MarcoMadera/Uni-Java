//Determina el total de venta y el total de incentivo de acuerdo a la clave de venta
//Programa VENDEDORES CON ATICULOS
//Fecha: 24/Septiembre/2015

import java.io.*;
public class 8Vendedores {
	public static void main (String args[]) {
		//Declaraciones
		//Definicion de objetos para entrada de datos por el teclado
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader(entrada);
		
		//Variable para tomar los datos leidos del flujo de entrada
		String datoEntrada;
		
		//Variables
		String nombreVend="", articulo="";
		char otro=' ' , hay=' ' ;  //posible error
		int totVend, cantidad, clave;
		float precio, totVendido, incentivo=0, totIncentivo, venta, totGralIncentivo, totGralVenta;
		
		System.out.println("\n PROCESSA LA VENTA DE VARIOS VENDEDORES \n");
		
		try {
			System.out.println("    REPORTE DE INCENTIVOS");
			System.out.println("NOMBRE     ARTICULO   TOTAL PAGAR");
			System.out.println("------------------------");
			totVend = 0;
			totGralVenta = 0;
			totGralIncentivo = 0;

			do {
				//Leer datos
				System.out.println("\n-----Entrada de datos------");
				System.out.print("Teclee nombre: ");
				datoEntrada = flujoEntrada.readLine();
				nombreVend = datoEntrada;
				totVendido = 0;
				totIncentivo = 0;

				do {
					System.out.print("Teclee articulo: ");
					datoEntrada = flujoEntrada.readLine();
					articulo = datoEntrada;
					
					System.out.print("Teclee clave de venta (1,2,3,4): ");
					datoEntrada = flujoEntrada.readLine();
					clave = Integer.parseInt(datoEntrada);
					
					System.out.print("Teclee cantidad de articulos: ");
					datoEntrada = flujoEntrada.readLine();
					cantidad = Integer.parseInt(datoEntrada);
					
					System.out.print("Teclee precio unitario: ");
					datoEntrada = flujoEntrada.readLine();
					precio = Integer.parseInt(datoEntrada);
					
					venta = cantidad * precio;
					
					switch (clave) {
						case 1:
							incentivo = venta* 0.15F;
							break;
						case 2:
							incentivo = venta* 0.1F;
							break;
						case 3:
							incentivo = venta* 0.05F;
							break;
						case 4:
							incentivo = venta* 0.03F;
							break;
					}
					
					totVendido = totVendido+venta;
					totIncentivo = totIncentivo + incentivo;
					
					System.out.print("\n¿Desea procesar otro articulo(S/N)?");
					hay = (char)System.in.read();
					System.in.skip(2);
				} while (hay == 'S' || hay=='s');
				
				//Imprimir salida
				System.out.println("Nombre = " + nombreVend);
				System.out.println("Total vendido = "+ totIncentivo);
				System.out.println("Total incentivo = "+ totIncentivo);
				
				totVend = totVend + 1;
				totGralVenta = totGralVenta + totVendido;
				totGralIncentivo = totGralIncentivo + totIncentivo;
				
				System.out.print("\n¿Desea procesar otro vendedor(S/N)?: ");
				otro= (char)System.in.read();
				System.in.skip(2);
			} while (otro== 'S' || otro == 's');

			System.out.println("\n---------Total--------");
			System.out.println("Total vendedores = " + totVend);
			System.out.println("Total general venta = " + totGralVenta);
			System.out.println("Total general incentivo = " + totGralIncentivo);
		} 
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}
}
		