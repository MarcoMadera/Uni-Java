/*Programa SECUENCIA FIBONACCI (primeros 20 elementos)
Fecha: 08 octubre 2015*/
 
import java.io.*;
public class 11Fibonacci1 {
 	public static void main(String args[]) {
 	 	//Declaraciones
 	 	//Variables
 	  int i, numero, penultimo, ultimo;
 	  
 	  System.out.println("\nIMPRIME 20 NUMEROS FIBONACCI\n");
 	  penultimo = 0;
 	  ultimo = 1;
 	   
 	  i=1;
 	  do {
			numero = penultimo + ultimo;
			System.out.println(numero + "");
			penultimo = ultimo;
			ultimo = numero;
			i++; 	
 	  } while (i <=20);	
	}	
}	