package primeFactors;

import java.util.*;

public class PrimeFactors {

    public ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        int divider = 2;
        while (divider <= number) {
            int product = number % divider;
            if (product == 0) {
                if (primeNumbers.size() > 0) {
                    for (int index : primeNumbers) {
                        product = divider % index;
                        if (product == 0) {
                            break;
                        }
                    }
                    if (product != 0) {
                        primeNumbers.add(divider);
                    }
                } else {
                    primeNumbers.add(divider);
                }
            }
            divider = divider + 1;
        }
        return primeNumbers;
    }
}
