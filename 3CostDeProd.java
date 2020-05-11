//Programa Calcular el costo de producción de un articulo
//Fecha: 19/Agosto/2015

import java.util.Scanner;

public class 3CostDeProd {
	public static void main(String[] args) {
		//Instancias
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		
		//Variantes
		int numUni;
		String descripcion;
		
		//Preguntas
		System.out.println("Cual es el nombre del producto?");
		descripcion = in.next();
		System.out.println("Cuál es la cantidad?");
		numUni = in.nextInt();

		//Resultados
		double multiplicar = numUni*3.5;
		double resultado = multiplicar+10700;
		System.out.printf( "El costo del artículo: " +descripcion); System.out.printf( " es de $"+resultado);		
	}
}
