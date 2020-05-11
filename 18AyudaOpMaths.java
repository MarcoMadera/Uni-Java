//Programa AYUDA
//Fecha:12/Noviembre/2015

import java.io.*;
public class 18AyudaOpMaths {
	static int num1, num2, resuNi, resuMaq, opcion;
	static int desea;
	static String datoEntrada;
	public static void main (String args[]) {
		do {
			System.out.println("----------------------");
			System.out.println("| TE PUEDO AYUDAR A: |");
			System.out.println("|--------------------|");
			System.out.println("| 1. SUMAR           |");
			System.out.println("| 2. RESTAR          |");
			System.out.println("| 3. MULTIPLICAR     |");
			System.out.println("| 3. DIVIDR          |");
			System.out.println("| 5. FIN             |");
			System.out.println("|--------------------|");
			System.out.print("   TECLEE OPCION");

			try {
				InputStreamReader entrada =new InputStreamReader(System.in);
				BufferedReader flujoEntrada = new BufferedReader(entrada);
				datoEntrada = flujoEntrada.readLine();
				opcion = Integer.parseInt(datoEntrada);
			}
			catch (IOException error) {
				System.err.println("Error" + error.getMessage());
			}

			switch (opcion) {
				case 1:
					ayudaSumar();
					break;
				case 2:
					ayudaRestar();
					break;
				case 3:
					ayudaMultiplicar();
					break;
				case 4:
					ayudaDividir();
					break;
			}
		}while (opcion !=5);
	}
	
	public static void ayudaSumar() {
		try {
			System.out.println("-------------");

			do {
				InputStreamReader entrada = new 
				InputStreamReader(System.in);
				BufferedReader flujoEntrada = new BufferedReader(entrada);
				System.out.println("---- AYUDANDO A SUMAR ----");
				System.out.print("Teclee primer número: ");
				datoEntrada = flujoEntrada.readLine();
				num1 = Integer.parseInt(datoEntrada);
				
				System.out.print("Teclee segundo número: ");
				datoEntrada = flujoEntrada.readLine();
				num2 = Integer.parseInt(datoEntrada);
				System.out.println("         ------- +");
				
				System.out.print("           Teclee su suma: ");
				datoEntrada = flujoEntrada.readLine();
				resuNi = Integer.parseInt(datoEntrada);
				
				resuMaq = num1 + num2;
					
				if(resuNi == resuMaq) {
					System.out.println("\nLA SUMA ES CORRECTA");
				} 
				else {
					System.out.println("\nLA SUMA ES INCORRECTA");
				}
				System.out.print("\n¿Desea Revisar Otra Suma (1/2)?: ");
				datoEntrada = flujoEntrada.readLine();
				desea= Integer.parseInt(datoEntrada);
			} while (desea == 1);
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}

	public static void ayudaRestar() {
		try {
			System.out.println("-------------");
			
			do{
				InputStreamReader entrada = new 
				InputStreamReader(System.in);
				BufferedReader flujoEntrada = new BufferedReader(entrada);
				System.out.println("---- AYUDANDO A RESTAR ----");
				System.out.print("Teclee primer número: ");
				datoEntrada = flujoEntrada.readLine();
				num1 = Integer.parseInt(datoEntrada);
				
				System.out.print("Teclee segundo número: ");
				datoEntrada = flujoEntrada.readLine();
				num2 = Integer.parseInt(datoEntrada);
				System.out.println("         ------- -");
				
				System.out.print("           Teclee su resta: ");
				datoEntrada = flujoEntrada.readLine();
				resuNi = Integer.parseInt(datoEntrada);
				
				resuMaq = num1 - num2;
					
				if(resuNi == resuMaq) {
					System.out.println("\nLA RESTA ES CORRECTA");
				}
				else {
					System.out.println("\nLA RESTA ES INCORRECTA");
				}
						
				System.out.print("\n¿Desea Revisar Otra Resta (1/2)?: ");
				datoEntrada = flujoEntrada.readLine();
				desea= Integer.parseInt(datoEntrada);
			}while (desea == 1);
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}

	public static void ayudaMultiplicar() {
		try {
			System.out.println("-------------");
			
			do{
				InputStreamReader entrada = new 
				InputStreamReader(System.in);
				BufferedReader flujoEntrada = new BufferedReader(entrada);
				System.out.println("---- AYUDANDO A MULTIPLICAR ----");
				System.out.print("Teclee primer número: ");
				datoEntrada = flujoEntrada.readLine();
				num1 = Integer.parseInt(datoEntrada);
				
				System.out.print("Teclee segundo número: ");
				datoEntrada = flujoEntrada.readLine();
				num2 = Integer.parseInt(datoEntrada);
				System.out.println("         ------- *");
				
				System.out.print("           Teclee su multiplicación: ");
				datoEntrada = flujoEntrada.readLine();
				resuNi = Integer.parseInt(datoEntrada);
				
				resuMaq = num1 * num2;
					
				if(resuNi == resuMaq) {
					System.out.println("\nLA MULTIPLICACIÓN ES CORRECTA");
				}
				else
					System.out.println("\nLA MULTIPLICACIÓN ES INCORRECTA");
				}

				System.out.print("\n¿Desea Revisar Otra Multiplicación (1/2)?: ");
				datoEntrada = flujoEntrada.readLine();
				desea= Integer.parseInt(datoEntrada);
			}while (desea == 1);
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}

	public static void ayudaDividir() {
		try {
			System.out.println("-------------");
			
			do{
				InputStreamReader entrada = new 
				InputStreamReader(System.in);
				BufferedReader flujoEntrada = new BufferedReader(entrada);
				System.out.println("---- AYUDANDO A DIVIDIR ----");
				System.out.print("Teclee el primer número: ");
				datoEntrada = flujoEntrada.readLine();
				num1 = Integer.parseInt(datoEntrada);
				
				System.out.print("Teclee el segundo número: ");
				datoEntrada = flujoEntrada.readLine();
				num2 = Integer.parseInt(datoEntrada);
				System.out.println("         ------- /");
				
				System.out.print("           Teclee su división: ");
				datoEntrada = flujoEntrada.readLine();
				resuNi = Integer.parseInt(datoEntrada);
				
				resuMaq = num1 / num2;
					
				if(resuNi == resuMaq){
					System.out.println("\nLA DIVISIÓN ES CORRECTA");
				}
				else {
					System.out.println("\nLA DIVISIÓN ES INCORRECTA");
				}

				System.out.print("\n¿Desea Revisar Otra División (1/2)?: ");
				datoEntrada = flujoEntrada.readLine();
				desea= Integer.parseInt(datoEntrada);
			}while (desea == 1);
		}
		catch (IOException error)
		{
			System.err.println("Error" + error.getMessage());
		}
	}
}