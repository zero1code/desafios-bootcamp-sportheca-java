import java.io.IOException;
import java.util.Scanner;

public class Colchão {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        if      (A <= H && B <= L || C <= L) System.out.println("S");
        else if (B <= H && A <= L)           System.out.println("S");
        else if (C <= H && A <= L || B <= L) System.out.println("S");
        else					             System.out.println("N");
    }
}
