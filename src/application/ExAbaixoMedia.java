package application;

import java.util.Locale;
import java.util.Scanner;

public class ExAbaixoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double soma = 0;
        double[] nums = new double[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = sc.nextDouble();
            soma += nums[i];
        }

        double media = soma / nums.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f", media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < media) {
                System.out.println(nums[i]);
            }
        }

        sc.close();
    }
}