package application;

import java.util.Scanner;

public class ExMaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        int maiorIdade = 0;
        String maisVelho = null;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nDados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            if (idades[i] > maiorIdade) {
                maisVelho = nomes[i];
                maiorIdade = idades[i];
            }
        }

        System.out.println("\nPESSOA MAIS VELHA: " + maisVelho);

        sc.close();
    }
}
