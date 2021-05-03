import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        NumerosPrimos numerosPrimos = new NumerosPrimos(); 
        ArrayList<Integer> numPrimos = numerosPrimos.generate(7);
        JOptionPane.showMessageDialog(null, "Los números primos son: " + numPrimos.toString(), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
}
