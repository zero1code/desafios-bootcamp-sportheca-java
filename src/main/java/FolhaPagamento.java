import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codColaborador = leitor.nextInt();
        int horasTrabalhadas = leitor.nextInt();
        double horaPreco = leitor.nextDouble();

        double pagarSalario = horasTrabalhadas * horaPreco;


        System.out.println("NUMBER = " + codColaborador);
        System.out.println(String.format("SALARY = U$ %.2f", pagarSalario));
    }
}
