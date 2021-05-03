import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        NumerosPrimos numerosPrimos = new NumerosPrimos(); 
        ArrayList<Integer> numPrimos = numerosPrimos.generate(3);
        System.out.println(numPrimos.toString());

    }
}
