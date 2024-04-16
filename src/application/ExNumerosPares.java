package application;

import java.util.Scanner;

public class ExNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você irá digitar? ");
        int n = sc.nextInt();
        int pares = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNÚMEROS PARES:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                pares++;
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("\n\nQUANTIDADE DE PARES: " + pares);
        sc.close();
    }
}
