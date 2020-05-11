//Programa AREAS GEOMÉTRICAS
//Fecha:12/Noviembre/2015

import java.io.*;
public class 17AreasFigGeometricas { 
	public static void main(String args[]) {
    int opcion = 0;
    String datoEntrada;

    do {
    	System.out.println("------------------");
    	System.out.println("|AREAS FIGURAS GEOMETRICAS|");
    	System.out.println("|--------------|");
    	System.out.println("|1.TRIANGULO|");
    	System.out.println("|2.CUADRADO|");
			System.out.println("|3.RECTANGULO|");
			System.out.println("|4.CIRCULO|");
			System.out.println("|5.FIN|");
			System.out.print  (" TECLEE OPCION: ");

			try {
				InputStreamReader entrada = new InputStreamReader(System.in);
				BufferedReader flujoEntrada = new BufferedReader(entrada);
				datoEntrada = flujoEntrada.readLine();
				opcion = Integer.parseInt(datoEntrada);
			}
			catch (IOException error) {
				System.err.println("Error" + error.getMessage());
			}

			switch (opcion)	{
				case 1:
					calcularAreaTriangulo();
					break;
				case 2:
					calcularAreaCuadrado();
					break;
				case 3:
					calcularAreaRectangulo();
					break;
				case 4:}
					calcularAreaCirculo();
					break;
		} while (opcion !=5);
	} 

	public static void calcularAreaTriangulo() {
		float base,altura,areatria;
		String datoEntrada;
		
		try {
			System.out.println("--------");
			System.out.print("TECLEE BASE:");
			InputStreamReader entrada =new InputStreamReader(System.in);
			BufferedReader flujoEntrada = new BufferedReader(entrada);
			datoEntrada = flujoEntrada.readLine();
			base=Float.parseFloat(datoEntrada);
			System.out.print("TECLEE ALTURA:");
			datoEntrada = flujoEntrada.readLine();
			altura=Float.parseFloat(datoEntrada);
			areatria = (base * altura)/2;
			System.out.println("AREA = " + areatria);
		}
		catch(IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	} 

	public static void calcularAreaCuadrado() {
		float lado, areaCuad;
		String datoEntrada;
		
		try {
			System.out.println("----------");
			System.out.print("TECLEE LADO:");
			InputStreamReader entrada = new InputStreamReader(System.in);
			BufferedReader flujoEntrada = new BufferedReader(entrada);
			datoEntrada = flujoEntrada.readLine();
			lado = Float.parseFloat(datoEntrada);
			areaCuad = lado * lado;
			System.out.println("AREA = " +areaCuad);
		}
		catch(IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}

	public static void calcularAreaRectangulo() {
		float base, altura, areaRect;
		String datoEntrada;

		try {
			System.out.println("----------");
			System.out.print("TECLEE BASE:");
			InputStreamReader entrada = new InputStreamReader(System.in);
			BufferedReader flujoEntrada = new BufferedReader(entrada);
			datoEntrada = flujoEntrada.readLine();
			base = Float.parseFloat(datoEntrada);
			System.out.print("TECLEE ALTURA:");
			datoEntrada = flujoEntrada.readLine();
			altura = Float.parseFloat(datoEntrada);
			areaRect = base * altura;
			System.out.println("AREA = " +areaRect);
		} 
		catch(IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}

	public static void calcularAreaCirculo() {
		float radio,areaCirc;
		String datoEntrada;
		try {
			System.out.println("----------");
			System.out.print("TECLEE RADIO:");
			InputStreamReader entrada = new InputStreamReader(System.in);
			BufferedReader flujoEntrada = new BufferedReader(entrada);
			datoEntrada = flujoEntrada.readLine();
			radio= Float.parseFloat(datoEntrada);
			areaCirc = 3.1416F * (radio* radio);
			System.out.println("AREA = "+areaCirc);
		}
		catch(IOException error) {
			System.err.println("Error" + error.getMessage());
		}
	}
}

