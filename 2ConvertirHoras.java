// Programa: Convertidor de horas a días minutos y segundos
// Fecha: 19/Agosto/2015

import java.util.Scanner ;
public class 2ConvertirHoras {
	public static void main(String[] args) {
		//Instancias
		Scanner in = new Scanner (System.in);
	
		//Variantes
		float horas;
		int min = 60;
		int seg = 3600;
		
		//Indicaciones
		System.out.println("Indique el número de horas");
		horas = (float) in.nextFloat(); in.close();
		
		//Operaciones
		float resmin = horas*min;
		float resseg = horas*seg;
		float resdias = horas/24f;
		
		// Lo que se mostrará
		System.out.printf (""+horas); 		System.out.printf( " hora/s son:");
		System.out.printf("\n"+resdias );	System.out.printf( " días");
		System.out.printf( "\n" +resmin);	System.out.printf( " minutos");
		System.out.printf( "\n" +resseg);	System.out.printf( " segundos");	
	}
}	

