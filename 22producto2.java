package producto;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class 22producto2 {
  public static void main(String[] args) {
		String dif="Que sea diferente de 0";
    String en1;
    String en2;
    String in1="Ingrese el primer número";
    String in2="Ingrese el segundo número";
    String Rsuma="El resultado de la suma es: ";
    String Rresta="\nEl resultado de la resta es: ";
    String Rmultiplicacion="\nEl resultado de la multiplicación es: ";
    String Rdivision="\nEl resultado de la división es: ";

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		double num1=0, num2=0;

		do{
      System.out.println(in1);num1=in.nextDouble();
      
      if (num1==0){
        System.out.println(dif);
      }
    }while (num1==0);

		do{
      System.out.println(in2);
      num2=in.nextDouble();
      
      if (num2==0){
        System.out.println(dif);
      }
    }while (num2==0);

		double suma=num1+num2;
    double resta=num1-num2;
    double multiplicacion=num1*num2;
    double division=num1/num2;

		System.out.println(Rsuma+suma+Rresta+resta+Rmultiplicacion+multiplicacion+Rdivision+division);

		num1=0;num2=0;

		do{
      en1=JOptionPane.showInputDialog(null,in1);num1=Double.parseDouble(en1);
      
      if (num1==0){
        JOptionPane.showMessageDialog(null,dif);
      }
    }while (num1==0);
		
    do{
      en2=JOptionPane.showInputDialog(null,in2);
      num2=Double.parseDouble(en2);

      if (num2==0){
        JOptionPane.showMessageDialog(null,dif);
      }
    }while (num2==0);

		double suma2=num1+num2;
    double resta2=num1-num2;
    double multiplicacion2=num1*num2;
    double division2=num1/num2;	
		JOptionPane.showMessageDialog(null,Rsuma+suma2+Rresta+resta2+Rmultiplicacion+multiplicacion2+Rdivision+division2 );
  }
}
