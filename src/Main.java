import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("****************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("****************************************************");
            System.out.print("Escolha uma opção válida: ");

            int opcao = scanner.nextInt();

            if (opcao == 7) {
                continuar = false;
                System.out.println("APLICAÇÃO ENCERRADA!!!");
                System.out.println("Obrigado por usar o Conversor de Moeda. Até logo!");
                break;
            }

            String moedaOrigem = "";
            String moedaDestino = "";
            switch (opcao) {
                case 1 -> {
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                }
                case 2 -> {
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                }
                case 3 -> {
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                }
                case 4 -> {
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                }
                case 5 -> {
                    moedaOrigem = "USD";
                    moedaDestino = "COP";
                }
                case 6 -> {
                    moedaOrigem = "COP";
                    moedaDestino = "USD";
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente!");
                    continue;
                }
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();
            double taxa = BuscaMoeda.obterTaxa(moedaOrigem, moedaDestino);
            double valorConvertido = valor * taxa;

            System.out.printf("Taxa de conversão %s => %s: %.2f%n", moedaOrigem, moedaDestino, taxa);
            System.out.printf("Valor convertido: %.2f %s%n", valorConvertido, moedaDestino);
            System.out.println("****************************************************");
        }

        scanner.close();

    }
}