package producto;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class 27producto7 {
	public static void main(String[] args) {
		final JPanel panel = new JPanel(); 
		int sino,error=1;double altura=0, base=0;
		String cancel="Lamento que no haya terminado de usarme";
    String otro="¿Desea hacer otro cálculo?";
    String selop="Seleccione una opción";
    String a1,b1,ingresar2="Ingrese la base";
    String ingresar1="Ingrese la altura";
    String rarea="\nEl area del triangulo es: ";
    String rperimetro="\nEl perimetro del triangulo es: ";
    String rhipotenusa="\nEl area del triangulo es: ";
    String rerror2="Indique un numero";
    String rerror1="Que sea mayor que 0"; 
		
    do{
      try{
		    do{
          try{ 
		        a1=JOptionPane.showInputDialog(panel,ingresar1,"Datos del triangulo rectangulo",JOptionPane.PLAIN_MESSAGE);
		        altura=Double.parseDouble(a1);error=1;

		        if (altura<=0){
              JOptionPane.showMessageDialog(panel,rerror1,"Error",JOptionPane.ERROR_MESSAGE);
            }
		      }catch(NumberFormatException ex){
            error=2;JOptionPane.showMessageDialog(panel,rerror2,"Error",JOptionPane.ERROR_MESSAGE);
          }
		    }while (altura<=0 || error==2);

		    do{
          try{
		        b1=JOptionPane.showInputDialog(panel,ingresar2,"Datos del triangulo rectangulo",JOptionPane.PLAIN_MESSAGE);
		        base=Double.parseDouble(b1);error=1;
		        
            if (base<=0){
              JOptionPane.showMessageDialog(panel,rerror1,"Error",JOptionPane.ERROR_MESSAGE);
            }
		      }catch(NumberFormatException ex){
            error=2;JOptionPane.showMessageDialog(panel,rerror2,"Error",JOptionPane.ERROR_MESSAGE);
          }
		    }while (base<=0 || error==2);

		    double area=(base*altura)/2;
        double hipotenusa=Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
        double perimetro=base+altura+hipotenusa;

		    JOptionPane.showMessageDialog(panel,rperimetro+perimetro+rhipotenusa+hipotenusa+rarea+area,"Resultado",JOptionPane.PLAIN_MESSAGE);
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
