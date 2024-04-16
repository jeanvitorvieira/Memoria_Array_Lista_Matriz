package application;

import java.util.Locale;
import java.util.Scanner;

public class ExMediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double soma = 0;
        int contarPar = 0;
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = sc.nextInt();
            if (nums[i] % 2 == 0) {
                soma += nums[i];
                contarPar++;
            }
        }

        if (contarPar == 0) {
            System.out.println("\nNENHUM NÚMERO PAR!");
        } else {
            double media = soma / contarPar;
            System.out.printf("\nMÉDIA DOS PARES: %.1f", media);
        }

        sc.close();
    }
}