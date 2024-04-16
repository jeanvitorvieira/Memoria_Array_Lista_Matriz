package application;

import java.util.Locale;
import java.util.Scanner;

public class ExMaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você irá digitar? ");
        int n = sc.nextInt();
        double maiorValor = 0;
        int posicao = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
            if ((numbers[i] != numbers[0]) && (numbers[i] > numbers[i - 1])) {
                maiorValor = numbers[i];
                posicao = i;
            }
        }
        System.out.println("\nMAIOR VALOR: " + maiorValor);
        System.out.println("POSIÇÃO DO MAIOR VALOR: " + posicao);
        sc.close();
    }
}
