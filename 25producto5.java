package producto;
import javax.swing.JOptionPane;

public class 25producto5 {
  public static void main(String[] args) {
		String amb="\nNo hay número mayor";
    String may="\nEl número mayor es: ";
    String igu="Los números son iguales";
    String dif="Los números son diferentes";
    String en1,en2,en3,in1="Ingrese el primer número",
    String in2="Ingrese el segundo número",
    String in3="Ingrese el tercer número";		
		double num1=0, num2=0,num3=0;

		en1=JOptionPane.showInputDialog(null,in1);num1=Double.parseDouble(en1);
		en2=JOptionPane.showInputDialog(null,in2);num2=Double.parseDouble(en2);
		en3=JOptionPane.showInputDialog(null,in3);num3=Double.parseDouble(en3);

		if (num1==num2&&num2==num3){
      JOptionPane.showMessageDialog(null,igu+amb);
    }else{
      if (num1>num2&&num1>num3){
        JOptionPane.showMessageDialog(null,dif+may+num1);
      }else{
        if (num2>num1&&num2>num3){
          JOptionPane.showMessageDialog(null,dif+may+num2);
        }else{
          if (num3>num1&&num3>num2){
            JOptionPane.showMessageDialog(null,dif+may+num3);
          }else{
            if (num3>num1&&num1==num2){
              JOptionPane.showMessageDialog(null,dif+may+num3);
            }else{
              if (num2>num1&&num1==num3){
                JOptionPane.showMessageDialog(null,dif+may+num2);
              }else{
                if (num1>num3&&num3==num2){
                  JOptionPane.showMessageDialog(null,dif+may+num1);
                }else{
                  if (num1>num2&&num1==num3){
                    JOptionPane.showMessageDialog(null,dif+may+num3);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
