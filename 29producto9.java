package paquete1;
import javax.swing.JOptionPane;
public class Solocalculadora {
  public static void main(String[] args) {
    int op=0;
    double n1=0,n2=0,s=0,m,d,r,exp;

    do{
      String ax1="",ax2="";
      String x="";
      while (isNum(x)==false){
        x=JOptionPane.showInputDialog("Calculadora para operaciones basicas"+
        "\n [1] SUMAR"+
        "\n [2] RESTAR"+
        "\n [3] MULTIPLICAR"+
        "\n [4] DIVIDIR"+
        "\n [5] POTENCIA"+
        "\n [6] SALIR"+
        "\n Elige la opcion deseada:");

        if (isNum(x) == true) {
          op=Integer.parseInt(x);
        } else {
          JOptionPane.showMessageDialog(null, "Entrada no válida, no introdujo una opción"); }
        }

        switch(op) {
          case 1:
            while (isNum(ax1)==false && isNum(ax2)==false){
              ax1=JOptionPane.showInputDialog("Ingrese numero 1");
              ax2=JOptionPane.showInputDialog("Ingrese numero 2");

              if(isNum(ax1)==true && isNum(ax2)==true){
                n1=Double.parseDouble(ax1);
                n2=Double.parseDouble(ax2);
                s=n1+n2;
                JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+s);
              } else{
                  JOptionPane.showMessageDialog(null, "Por favor repita la operación" + "\nIngrese solo números","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
              }
              break;
            }
          case 2:
            while (isNum(ax1)==false && isNum(ax2)==false){
              ax1=JOptionPane.showInputDialog("Ingrese numero 1");
              ax2=JOptionPane.showInputDialog("Ingrese numero 2");

              if(isNum(ax1)==true && isNum(ax2)==true){
                n1=Double.parseDouble(ax1);
                n2=Double.parseDouble(ax2);
                r=n1-n2;
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+r);
              } else{
                  JOptionPane.showMessageDialog(null, "Por favor repita la operación" + "\nIngrese solo números","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
              }
              break;
            }
          case 3:
            while (isNum(ax1)==false && isNum(ax2)==false){
              ax1=JOptionPane.showInputDialog("Ingrese numero 1");
              ax2=JOptionPane.showInputDialog("Ingrese numero 2");

              if(isNum(ax1)==true && isNum(ax2)==true){
                n1=Double.parseDouble(ax1);
                n2=Double.parseDouble(ax2);
                m=n1*n2;
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+m);
              } else{
                  JOptionPane.showMessageDialog(null, "Por favor repita la operación" + "\nIngrese solo números","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
              }
              break;
            }
          case 4:
            while (isNum(ax1)==false && isNum(ax2)==false){
              ax1=JOptionPane.showInputDialog("Ingrese numero 1");
              ax2=JOptionPane.showInputDialog("Ingrese numero 2");

              if(isNum(ax1)==true && isNum(ax2)==true){
                n1=Double.parseDouble(ax1);
                n2=Double.parseDouble(ax2);

                while (n2==0){
                  ax2=JOptionPane.showInputDialog("Ingrese numero diferente de 0 para evitar error en la división");
                  n2=Double.parseDouble(ax2);
                }

                d=n1/n2;
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+d);
              } else{
                JOptionPane.showMessageDialog(null, "Por favor repita la operación" + "\nIngrese solo números","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
              }
              break;
            }
          case 5:
            while (isNum(ax1)==false && isNum(ax2)==false){
              ax1=JOptionPane.showInputDialog("Ingrese numero 1");
              ax2=JOptionPane.showInputDialog("Ingrese numero 2");

              if(isNum(ax1)==true && isNum(ax2)==true){
                n1=Double.parseDouble(ax1);
                n2=Double.parseDouble(ax2);
                exp=Math.pow(n1,n2);
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+exp);
              } else{
                  JOptionPane.showMessageDialog(null, "Por favor repita la operación" + "\nIngrese solo números","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
              }
            }
            break;
      }
    } while(op!=6);

    int ax = JOptionPane.showConfirmDialog(null, "¿Tienes alguna duda?","FIN DELPROGRAMA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    
    if(ax == JOptionPane.NO_OPTION){
      JOptionPane.showMessageDialog(null, "Felicidades.....");
    }
    else {
      if(ax == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Plantea las dudas que tengas...");
      }
    }
  }
  public static boolean isNum(String n){//metodo para validar si se ha ingresado un numero, recibe una cadena de texto
    try{  
      int  a = Integer.parseInt(n); //se convierte la cadena      
      return true; //si se ha convertido a entero devuelve verdadero
    } 
    catch(NumberFormatException e){ 
      return false; //si no se ha convertido a entero devuelve falso
    }
  }
}
