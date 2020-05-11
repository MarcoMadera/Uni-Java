package producto;
import javax.swing.JOptionPane;

public class 24producto4 {
  public static void main(String[] args) {
		String amb="\nNo hay número mayor",
    String may="\nEl número mayor es: ",
    String igu="Los números son iguales",
    String dif="Los números son diferentes",
    String en1,en2,in1="Ingrese el primer número",
    String in2="Ingrese el segundo número";		
		double num1=0, num2=0;

		en1=JOptionPane.showInputDialog(null,in1);
    num1=Double.parseDouble(en1);
		en2=JOptionPane.showInputDialog(null,in2);
    num2=Double.parseDouble(en2);

		if (num1==num2){
      JOptionPane.showMessageDialog(null,igu+amb);
    }

		if (num1>num2){
      JOptionPane.showMessageDialog(null,dif+may+num1);
    }

		if (num2>num1){
      JOptionPane.showMessageDialog(null,dif+may+num2);
    }
  }
}
