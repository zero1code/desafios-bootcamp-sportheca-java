import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemRepetidaDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        int valores = scr.nextInt();
        Map<Integer, Integer> numeros = new HashMap<>();

        for (int i = 0; i < valores; i++) {
            var numero = scr.nextInt();

            if (numeros.containsKey(numero)) {
                numeros.put(numero, numeros.get(numero) + 1);
            } else {
                numeros.put(numero, 1);
            }
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() +" vez(es)"));

    }
}
