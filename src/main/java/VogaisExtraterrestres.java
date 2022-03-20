import java.util.Scanner;

public class VogaisExtraterrestres {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String vogais, frase;
        int quantidade = 0;

        while (scr.hasNextLine()) {
            quantidade = 0;
            vogais = scr.nextLine();
            frase = scr.nextLine();

            for (int i = 0; i < vogais.length(); i++) {
                for (int j = 0; j < frase.length(); j++) {
                    if (frase.charAt(j) == vogais.charAt(i)) quantidade++;
                }
            }
            System.out.println(quantidade);
        }
    }
}
