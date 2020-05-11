/*Programa SECUENCIA FIBONACACCI (Primeros 20 elementos)
Fecha: 08/Octubre/2015*/

import java.io.*;
public class 11Fibonacci {
	public static void main(String args[]) {
		//Declaraciones
		//Variables
		int i, numero, penultimo, ultimo;

		System.out.println("\nIMPRIME 20 NÚMEROS FIBONACCI\n");
		penultimo = 0;
		ultimo = 1;

		for (i= 1; i <= 20; i++){
			numero= penultimo + ultimo;
			System.out.println (numero + " ");
			penultimo = ultimo;
			ultimo = numero;
		}
	}
}