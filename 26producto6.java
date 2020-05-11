package producto;
import javax.swing.JOptionPane;

public class 26producto6 {
  public static void main(String[] args) {
		String numspositivos="\nLos números positivos son: ";
    String numsnegativos="\nLos números negativos son: ";
    String rsuma="La suma de todos los números es: ";
    String rpromedio="\nEl promedio de todos los números es: ";
    String en1,en2,en3,en4,en5,dif="Que sea diferente de 0";
    String in1="Ingrese el primer número",in2="Ingrese el segundo número";
    String in3="Ingrese el tercer número",in4="Ingrese el cuarto número";
    String in5="Ingrese el quinto número";

		double num1=0, num2=0,num3=0,num4=0,num5=0,nnegativos=0,npositivos=0;
		
		do{
      en1=JOptionPane.showInputDialog(null,in1);
      num1=Double.parseDouble(en1);
      if (num1==0){
        JOptionPane.showMessageDialog(null,dif);
      }
      
      if (num1<0){
        nnegativos=nnegativos+1;
      }
      
      if (num1>0){
        npositivos=npositivos+1;
      }
    }while(num1==0);

		do{
      en2=JOptionPane.showInputDialog(null,in2);
      num2=Double.parseDouble(en2);
		  if (num2==0){
        JOptionPane.showMessageDialog(null,dif);
      }
      
      if (num2<0){
        nnegativos=nnegativos+1;
      }
      
      if (num2>0){
        npositivos=npositivos+1;
      }
    }while(num2==0);
		
    do{
      en3=JOptionPane.showInputDialog(null,in3);num3=Double.parseDouble(en3);
      if (num3==0){
        JOptionPane.showMessageDialog(null,dif);
        }
      
      if (num3<0){
        nnegativos=nnegativos+1;
      }
      
      if (num3>0){
        npositivos=npositivos+1;
      }
    }while(num3==0);
		
    do{
      en4=JOptionPane.showInputDialog(null,in4);
      num4=Double.parseDouble(en4);
		  if (num4==0){
        JOptionPane.showMessageDialog(null,dif);
      }
      
      if (num4<0){
        nnegativos=nnegativos+1;
      }
      
      if (num4>0){
        npositivos=npositivos+1;
      }
    }while(num4==0);
		
    do{
      en5=JOptionPane.showInputDialog(null,in5);
      num5=Double.parseDouble(en5);
      if (num5==0){
        JOptionPane.showMessageDialog(null,dif);
      }
      
      if (num5<0){
        nnegativos=nnegativos+1;
      }
      
      if (num5>0){
        npositivos=npositivos+1;
      }
    }while(num5==0);

		double suma=num1+num2+num3+num4+num5;
    double promedio=suma/5;
		JOptionPane.showMessageDialog(null,rsuma+suma+numspositivos+npositivos+numsnegativos+nnegativos+rpromedio+promedio);
  }
}
