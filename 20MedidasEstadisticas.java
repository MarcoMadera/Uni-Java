//MedidasEstadisticas.java
//Fecha: 16/Noviembre/2015

import java.io.*; 
public class 20MedidasEstadisticas {
	static float numeros[] = new float[20];
	static int n, opcion = 0;
	static double sumatoria , media, varianza, desviacion, desvuacionEstandar;
	static String datoEntrada;
  public static void main(String args[]) {
		System.out.println("------------------------");
		System.out.println("| MEDIDAS ESTADISTICAS |");
		System.out.println("------------------------");
		System.out.println("1.MEDIA                 ");
		System.out.println("2.VARIANZA              ");
		System.out.println("3.DESVIACIÓN ESTANDAR   ");
		System.out.println("4.TODAS                 ");
		System.out.println("5.FIN                   ");
		System.out.println("------------------------");
		System.out.println("TECLEE OPCION:          ");    	
	
		try{
			InputStreamReader entrada = new InputStreamReader(System.in);
			BufferedReader flujoEntrada = new BufferedReader(entrada);
			datoEntrada= flujoEntrada.readLine();
			opcion = Integer.parseInt(datoEntrada);
			
			for (n = 0; n <=19; n++) {
				System.out.print("Teclee numeros" + n + "]: ");
				datoEntrada = flujoEntrada.readLine();
				numeros[n] = Float.parseFloat(datoEntrada);
			}
		}
		catch (IOException error) {
			System.err.println("Error " + error.getMessage());
		}

		System.out.println("\n----Números-----");

		for (n = 0; n <=19; n ++) {
			System.out.println("Números[" + n + "] = " + numeros[n]);
		}

		if (opcion ==1 || opcion == 4) {
			calcularMedia();
			System.out.println("Media = "+ media);
		}

		if (opcion ==2 || opcion == 4) {
			calcularVarianza();
			System.out.println("Varianza = "+ varianza);
		}

		if (opcion ==3 || opcion == 4) {
			calcularDesviacion();
			System.out.println("Desviacion estandar = "+ desviacion);
		}
	}

	public static void calcularMedia() {
		sumatoria = 0;

		for (n = 0; n<=19;n++) {
			sumatoria = sumatoria + numeros[n];
		}

		media = sumatoria / 20D;
	}
	
	public static void calcularVarianza() {
		calcularMedia();
		sumatoria = 0;

		for (n = 0; n<=19; n ++) {
			desviacion = numeros[n] - media;

			if (desviacion > 0) {
				desviacion = Math.pow(desviacion,2);
				sumatoria = sumatoria + desviacion;
			}
		}

		varianza = sumatoria / 19D;
	}

	public static void calcularDesviacion() {
		calcularVarianza();
		desvuacionEstandar = Math.sqrt(varianza);
	}
}
