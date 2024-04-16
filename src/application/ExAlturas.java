package application;

import java.util.Locale;
import java.util.Scanner;

public class ExAlturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nmenores = 0;
        double mediaAltura = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nDados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            mediaAltura = mediaAltura + alturas[i];

            if (idades[i] < 16) {
                nmenores++;
            }
            
        }
        double menoresPercent = ((double)nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", mediaAltura / n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", menoresPercent);
        System.out.println("Lista:");
        for(int i=0; i<n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }
        sc.close();
    }
}