import java.util.Scanner;

public class CalculadoraMedia {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        // Leitura das notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Cálculo da média
        double media = soma / 4;

        // Impressão da média no console
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
