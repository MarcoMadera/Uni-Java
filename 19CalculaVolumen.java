//Programa Calcula el volumen de esfera, cubo, piramide triangular y cilindro
//Fecha: 16/Noviembre/2015
import java.io.*;
public class 19CalculaVolumen {
	static int n, opcion = 0;
	static double volEsfera, volCubo, volPiramide, volCilindro, radio;
	public static void main(String[] args) {
		System.out.println("|------------------------|");
		System.out.println("| CALCULA EL VOLUMEN DE: |");
		System.out.println("|------------------------|");
		System.out.println("|1.ESFERA                |");
		System.out.println("|2.CUBO                  |");
		System.out.println("|3.PIRÁMIDE TRIANGULAR   |");
		System.out.println("|4.CILINDRO              |");
		System.out.println("|------------------------|");
		System.out.println("|TECLEE OPCIÓN:          |"); 
		System.out.println("|------------------------|");
		
		String datoEntrada;

		try {
			InputStreamReader entrada = new InputStreamReader(System.in);
			BufferedReader flujoEntrada = new BufferedReader(entrada);
			datoEntrada= flujoEntrada.readLine();
			opcion = Integer.parseInt(datoEntrada);
		}
		catch (IOException error) {
			System.err.println("Error " + error.getMessage());
		}

		if (opcion ==1) {
			calcularEsfera();
			System.out.println("Volumen de esfera = "+ volEsfera);
		}

		if (opcion ==2) {
			calcularCubo();
			System.out.println("Volumen de cubo = "+ volCubo);
		}

		if (opcion ==3) {
			calcularPiramideTriangular();
			System.out.println("Volumen de Pirámide triangular = "+ volPiramide);
		}
		if (opcion ==4) {
			calcularCilindro();
			System.out.println("Volumen de Cilindro = "+ volCilindro);
		}
	}

	public static void calcularEsfera() {
		InputStreamReader entrada= new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader (entrada);
		String datoEntrada;
		double radio=0;

		try {
			System.out.println("Teclee radio: ");
			datoEntrada = flujoEntrada.readLine();
			radio = Double.parseDouble (datoEntrada);
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}

		volEsfera = (4/3)*Math.PI * Math.pow(radio,3);
	}
		
	public static void calcularCubo() {
		InputStreamReader entrada= new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader (entrada);
		String datoEntrada;
		double arista=0;
			
		try {
			System.out.println("Teclee arista: ");
			datoEntrada = flujoEntrada.readLine();
			arista = Double.parseDouble (datoEntrada);
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}

		volCubo = Math.pow(arista,3);
	}
			
	public static void calcularPiramideTriangular() {
		InputStreamReader entrada= new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader (entrada);
		String datoEntrada;
		double base=0, altura=0;
			
		try {
			System.out.println("Teclee arista de la base: ");
			datoEntrada = flujoEntrada.readLine();
			base = Double.parseDouble (datoEntrada);
			
			System.out.println("Teclee altura: ");
			datoEntrada = flujoEntrada.readLine();
			altura = Double.parseDouble (datoEntrada);
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}

		volPiramide = (Math.sqrt(3)/12)* Math.pow(base, 2) * altura;
	}
		
	public static void calcularCilindro() {
		InputStreamReader entrada= new InputStreamReader(System.in);
		BufferedReader flujoEntrada = new BufferedReader (entrada);
		String datoEntrada;
		double radio=0, altura=0;

		try {
			System.out.println("Teclee radio: ");
			datoEntrada = flujoEntrada.readLine();
			radio = Double.parseDouble (datoEntrada);
			
			System.out.println("Teclee altura: ");
			datoEntrada = flujoEntrada.readLine();
			altura = Double.parseDouble (datoEntrada);
		}
		catch (IOException error) {
			System.err.println("Error" + error.getMessage());
		}

		volCilindro = Math.PI * Math.pow(radio,2) * altura;
	}
}


