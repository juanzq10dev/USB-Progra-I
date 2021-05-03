import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        NumerosPrimos numerosPrimos = new NumerosPrimos(); 
        ArrayList<Integer> numPrimos = numerosPrimos.generate(1);
        for(int i : numPrimos){
            System.out.println(i);
        }

    }
}
