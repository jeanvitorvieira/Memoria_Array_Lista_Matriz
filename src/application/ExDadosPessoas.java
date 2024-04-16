package application;

import java.util.Locale;
import java.util.Scanner;

public class ExDadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];
        double menorAltura = 999, maiorAltura = 0, soma = 0;
        int contarMulheres = 0, contarHomens = 0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nAltura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            } else if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if ((generos[i] == 'F') || (generos[i] == 'f')) {
                soma += alturas[i];
                contarMulheres++;
            } else if ((generos[i] == 'M') || (generos[i] == 'm')) {
                contarHomens++;
            }
        }

        double mediaMulheres = soma / contarMulheres;

        System.out.println("\nMenor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f \n", mediaMulheres);
        System.out.println("Número de homens = " + contarHomens);

        sc.close();
    }
}