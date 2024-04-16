package theory;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploArray {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite a altura da pessoa: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double avg = sum / n;
        System.out.printf("\nAVERAGE HEIGHT: %.2f\n", avg);
        sc.close();
    }
}