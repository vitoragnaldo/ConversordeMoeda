import java.util.Scanner;

public class ConversorDeMoeda {

    // Método para converter o valor entre moedas
    public static double converter(double valor, double taxaCambio) {
        return valor * taxaCambio;
    }

    // Exibir as opções de moedas
    public static void exibirMenu() {
        System.out.println("Escolha a moeda de origem:");
        System.out.println("1. Real (BRL)");
        System.out.println("2. Dólar (USD)");
        System.out.println("3. Euro (EUR)");
        System.out.println("4. Libra Esterlina (GBP)");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taxas de câmbio fixas (valores fictícios)
        double taxaRealParaDolar = 0.20; // 1 Real = 0.20 Dólar
        double taxaDolarParaReal = 5.00; // 1 Dólar = 5 Reais
        double taxaRealParaEuro = 0.18;  // 1 Real = 0.18 Euro
        double taxaEuroParaReal = 5.50;  // 1 Euro = 5.50 Reais
        double taxaRealParaLibra = 0.16; // 1 Real = 0.16 Libra Esterlina
        double taxaLibraParaReal = 6.25; // 1 Libra Esterlina = 6.25 Reais

        // Solicitar ao usuário o valor a ser convertido
        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        // Exibir menu de seleção
        exibirMenu();

        // Obter a moeda de origem e destino
        System.out.print("Escolha a moeda de origem (1-4): ");
        int moedaOrigem = scanner.nextInt();

        System.out.print("Escolha a moeda de destino (1-4): ");
        int moedaDestino = scanner.nextInt();

        // Realizar a conversão
        double resultado = 0;
        String moedaOrigemNome = "";
        String moedaDestinoNome = "";

        if (moedaOrigem == 1) { // Real (BRL)
            if (moedaDestino == 2) { // Dólar (USD)
                resultado = converter(valor, taxaRealParaDolar);
                moedaOrigemNome = "Real";
                moedaDestinoNome = "Dólar";
            } else if (moedaDestino == 3) { // Euro (EUR)
                resultado = converter(valor, taxaRealParaEuro);
                moedaOrigemNome = "Real";
                moedaDestinoNome = "Euro";
            } else if (moedaDestino == 4) { // Libra Esterlina (GBP)
                resultado = converter(valor, taxaRealParaLibra);
                moedaOrigemNome = "Real";
                moedaDestinoNome = "Libra Esterlina";
            }
        } else if (moedaOrigem == 2) { // Dólar (USD)
            if (moedaDestino == 1) { // Real (BRL)
                resultado = converter(valor, taxaDolarParaReal);
                moedaOrigemNome = "Dólar";
                moedaDestinoNome = "Real";
            }
        } else if (moedaOrigem == 3) { // Euro (EUR)
            if (moedaDestino == 1) { // Real (BRL)
                resultado = converter(valor, taxaEuroParaReal);
                moedaOrigemNome = "Euro";
                moedaDestinoNome = "Real";
            }
        } else if (moedaOrigem == 4) { // Libra Esterlina (GBP)
            if (moedaDestino == 1) { // Real (BRL)
                resultado = converter(valor, taxaLibraParaReal);
                moedaOrigemNome = "Libra Esterlina";
                moedaDestinoNome = "Real";
            }
        }

        // Exibir o resultado
        System.out.println("Resultado: " + valor + " " + moedaOrigemNome + " = " + resultado + " " + moedaDestinoNome);

        scanner.close();
    }
}
