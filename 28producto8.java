package producto;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class 28producto8 {
  public static void main(String[] args) {
		final JPanel panel = new JPanel();
		String nopromneg="\nEl promedio de los numeros negativos es: Error división entre cero";
    String noprompos="\nEl promedio de los numeros positivos es: Sale error en la calculadora";
    String Enum1="Escriba el primer numero ";
    String Enum2="Escriba el segundo numero ";
    String Enum3="Escriba el tercer numero ";
    String Enum4="Escriba el cuarto numero ";
    String Enum5="Escriba el quinto numero ";
    String Enum6="Escriba el sexto numero ";
    String Enum7="Escriba el septimo numero ";
    String Enum8="Escriba el octavo numero ";
    String Enum9="Escriba el noveno numero ";
    String Enum10="Escriba el decimo numero ";
    String E="Escribir numero",Error="Escriba un numero";
    String Error2="Que sea diferente de 0";
    String Err="Error";
    String Res="Resultado";
    String Rnumpositivos="Los numeros positivos son: ";
    String Rnumnegativos="\nLos numeros negativos son: ";
    String Rsumpositivos="\nLa suma de los numeros positivos es: ";
    String Rsumnegativos="\nLa suma de los numeros negativos es: ";
    String Rsumtodo="\nLa suma de todos los numeros es: ";
    String Rpromediopositivos="\nEl promedio de los numeros positivos es: ";
    String Rpromedionegativos="\nEl promedio de los numeros negativos es: ";
    String Rpromtotal="\nEl promedio de todos los numeros es de: ";
    String ep,otro="¿Desea hacer otro cálculo?";
    String selop="Seleccione una opción";
    String cancel="Lamento que no haya terminado de usarme.";

		int sino;
    
    do{
      try{
		    double e=0;
        double num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0,num10=0;
        double numsnegativos=0,numspositivos=0,sumnumpositivos=0,sumnumnegativos=0;

		    //numero 1
		    do{
          try{
            e=0;
		        ep=JOptionPane.showInputDialog(panel,Enum1,E,JOptionPane.PLAIN_MESSAGE);
		        num1=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }
		
          if (num1==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }
		      
          if (num1>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num1;
          }
          
          if (num1<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num1;
          }
		    }while(num1==0);

		    //numero 2
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum2,E,JOptionPane.PLAIN_MESSAGE);
            num2=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }
            
          if (num2==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }
          
          if (num2>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num2;
          }
          
          if (num2<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num2;
          }
        }while(num2==0);

        //numero 3
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum3,E,JOptionPane.PLAIN_MESSAGE);
            num3=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }

          if (num3==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }
          
          if (num3>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num3;
          }
          
          if (num3<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num3;
          }
        }while(num3==0);

        //numero 4
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum4,E,JOptionPane.PLAIN_MESSAGE);
            num4=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }
          
          if (num4==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }

          if (num4>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num4;
          }
          
          if (num4<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num4;
          }
        }while(num4==0);

        //numero 5
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum5,E,JOptionPane.PLAIN_MESSAGE);
            num5=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }

          if (num5==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }
          
          if (num5>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num5;
          }
          
          if (num5<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num5;
          }
        }while(num5==0);

        //numero 6
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum6,E,JOptionPane.PLAIN_MESSAGE);
            num6=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }
          
          if (num6==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }

          if (num6>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num6;
          }
          
          if (num6<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num6;
          }
        }while(num6==0);

        //numero 7
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum7,E,JOptionPane.PLAIN_MESSAGE);
            num7=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }

          if (num7==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }

          if (num7>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num7;
          }
          
          if (num7<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num7;
          }
        }while(num7==0);

        //numero 8
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum8,E,JOptionPane.PLAIN_MESSAGE);
            num8=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }
          
          if (num8==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }
          
          if (num8>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num8;
          }
          
          if (num8<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num8;
          }
        }while(num8==0);

        //numero 9
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum9,E,JOptionPane.PLAIN_MESSAGE);
            num9=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }

          if (num9==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }
         
          if (num9>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num9;
          }
          if (num9<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num9;
          }
        }while(num9==0);

        //numero 10
        do{
          try{
            e=0;
            ep=JOptionPane.showInputDialog(panel,Enum10,E,JOptionPane.PLAIN_MESSAGE);
            num10=Double.parseDouble(ep);
          }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(panel,Error,Err,JOptionPane.ERROR_MESSAGE);
            e=1;
          }
         
          if (num10==0&&e==0){
            JOptionPane.showMessageDialog(panel,Error2,Err,JOptionPane.ERROR_MESSAGE);
          }

          if (num10>0){
            numspositivos=numspositivos+1;
            sumnumpositivos=sumnumpositivos+num10;
          }
          
          if (num10<0){
            numsnegativos=numsnegativos+1;
            sumnumnegativos=sumnumnegativos+num10;
          }
        }while(num10==0);

        double sumtodo=num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        double promediotodo=sumtodo/10;
        double promediopositivos=sumnumpositivos/numspositivos;
        double promedionegativos=sumnumnegativos/numsnegativos;

        if (numsnegativos==0){
          JOptionPane.showMessageDialog(panel,Rnumpositivos+numspositivos+Rnumnegativos+numsnegativos+Rsumpositivos+sumnumpositivos+Rsumnegativos+sumnumnegativos+Rsumtodo+sumtodo+Rpromediopositivos+promediopositivos+nopromneg+Rpromtotal+promediotodo,Res,JOptionPane.PLAIN_MESSAGE);
        }

        if (numspositivos==0){
          JOptionPane.showMessageDialog(panel,Rnumpositivos+numspositivos+Rnumnegativos+numsnegativos+Rsumpositivos+sumnumpositivos+Rsumnegativos+sumnumnegativos+Rsumtodo+sumtodo+noprompos+Rpromedionegativos+promedionegativos+Rpromtotal+promediotodo,Res,JOptionPane.PLAIN_MESSAGE);
        }

        if (numsnegativos>0&&numspositivos>0){
          JOptionPane.showMessageDialog(panel,Rnumpositivos+numspositivos+Rnumnegativos+numsnegativos+Rsumpositivos+sumnumpositivos+Rsumnegativos+sumnumnegativos+Rsumtodo+sumtodo+Rpromediopositivos+promediopositivos+Rpromedionegativos+promedionegativos+Rpromtotal+promediotodo,Res,JOptionPane.PLAIN_MESSAGE);
        }

      }catch(NullPointerException ex){
        JOptionPane.showMessageDialog(null,cancel);
        System.exit(0);
      }
      
      sino = JOptionPane.showConfirmDialog(panel, otro, selop, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
      
      if(sino == JOptionPane.NO_OPTION) {
        System.exit(0);
      }
    }while(sino == JOptionPane.YES_OPTION);
  }
}
