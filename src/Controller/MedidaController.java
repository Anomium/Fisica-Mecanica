package Controller;

import Model.Medida;
import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class MedidaController {

    Medida med = new Medida();

    public static String SinNotacion(double val) {
        Locale.setDefault(Locale.US);
        DecimalFormat num = new DecimalFormat("#,###.00000");
        JOptionPane.showMessageDialog(null, num.format(val));
        return num.format(val);
        
    }
    
    
    public static double convertir(double val) {
        double num = val;
        System.out.println(num);
        return num;
    }
}
