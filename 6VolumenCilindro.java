// Programa VOLUMEN CILINDRO
//Fecha: 07/Septiembre/2015

import java.io.*;
 public class 6VolumenCilindro {
    public static void main(String[] args) {
    	//Declaraciones
    	// Definicion de objetos para entrada de datos por el teclado
    	InputStreamReader entrada= new InputStreamReader(System.in);
    	BufferedReader flujoEntrada = new BufferedReader (entrada);

    	//Variable para tomar los datos leidos por flujo de entrada
    	String datoEntrada;
    	
    	//Variables
    	double radio=0, altura=0, volumen;
    	
    	System.out.println("\n    VOLUMEN CILINDRO\n");
    	
    	//Leer datos
    	try {
    		System.out.println("----Entrada de datos----");
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

    	//Calculcar
    	volumen = Math.PI * Math.pow(radio,2) * altura;
    	//Imprimir salida
    	System.out.println("\n-----------Salida----------");
    	System.out.println("Volumen cilindro=" + volumen);	
    	}
    }

