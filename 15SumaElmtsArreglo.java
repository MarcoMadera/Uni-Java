//Programa SUMA DE ELEMENTOS DE UN ARREGLO
//Fecha: 03/Noviembre/2015

import java.io.*;
public class 15SumaElmtsArreglo {
  public static void main(String args[]) {
    //Declaraciones
    //Definicion de objetos para entrada de datos por el teclado
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader flujoEntrada = new BufferedReader(entrada);
     
    //Variable para tomar los datos leidos del flujo de entrada
    String datoEntrada; 
     
    //Variables
    int numeros[] = new int[15];
    int r, sumatoria;
     
    System.out.println("\nCALCULA LA SUMA DE LOS ELEMENTOS DE UN ARREGLO\n");
     
    try {
    //Leer datos
      System.out.println("--------Entrada de datos--------");
      sumatoria = 0;

      for (r = 0; r <= 14; r++) {
      System.out.print("Teclee numeros[" + r + "]: ");
      datoEntrada = flujoEntrada.readLine();
      numeros[r] = Integer.parseInt(datoEntrada);
      sumatoria = sumatoria + numeros[r];
      }
      
      //Imprimir Salida
      System.out.println("\nSUMA DEL ARREGLO");
      System.out.println("----------------");
      System.out.println("SUMATORIA = " + sumatoria);
    }
    catch (IOException error) {
      System.err.println("Error" + error.getMessage());
    }
  }  	   	
}
