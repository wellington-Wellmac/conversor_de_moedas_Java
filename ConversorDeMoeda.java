import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxaUsdBrl = 6.15;
        double taxaEurBrl = 6.10;

        System.out.println("Digite o valor em BRL:");
        double valorBrl = scanner.nextDouble();

        System.out.println("Converter para: (1) USD ou (2) EUR?");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double valorUsd = valorBrl / taxaUsdBrl;
            System.out.printf("Valor em USD: %.2f%n", valorUsd);
        } else if (opcao == 2) {
            double valorEur = valorBrl / taxaEurBrl;
            System.out.printf("Valor em EUR: %.2f%n", valorEur);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}

