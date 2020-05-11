package producto;
import javax.swing.JOptionPane;

public class 23producto3 {
  public static void main(String[] args) {
    String n1,escribe1="Escribe el número que va a ser contado";
    double a=0,suma=0,num1;

    do{
      n1=JOptionPane.showInputDialog(escribe1);
      num1=Double.parseDouble(n1);

      if (num1<0){
        JOptionPane.showMessageDialog(null, "Que sea mayor que 0");
      }

      if (num1==0){
        JOptionPane.showMessageDialog(null, "No se contó ningún número");
        System.exit(0);
      }
      if (num1==1){
        JOptionPane.showMessageDialog(null, "Solo se sumó un número y su suma es 1");
        System.exit(0);
      }
    }while(num1<=0);
    
    do {
      a+=1;suma=suma+a;
    }while (a!=num1);

    JOptionPane.showMessageDialog(null, "Los números sumados son: "+a+"\n La suma de los "+a+" números es: "+suma);
  }
}
