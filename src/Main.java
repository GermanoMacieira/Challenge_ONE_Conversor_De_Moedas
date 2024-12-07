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
                System.out.println("Obrigado por usar o Conversor de Moeda. Até logo!");
                break;
            }
        }
    }
}