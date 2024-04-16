package application;

import java.util.Locale;
import java.util.Scanner;

public class ExSomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] nums = new double[n];
        double soma = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.print("\nDigite um número: ");
            nums[i] = sc.nextDouble();
        }
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }
        double media = soma / n;
        System.out.print("\nVALORES: ");
        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", nums[i]);
        }
        System.out.println("\nSOMA: " + soma);
        System.out.printf("MÉDIA: %.2f", media);
        sc.close();
    }
}