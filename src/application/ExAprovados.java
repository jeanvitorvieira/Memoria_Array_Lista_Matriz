package application;

import java.util.Locale;
import java.util.Scanner;

public class ExAprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        double[] n1 = new double[n];
        double[] n2 = new double[n];
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nDigite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            nomes[i] = sc.nextLine();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();
            medias[i] = (n1[i] + n2[i]) / 2;
        }

        System.out.print("\nAlunos aprovados:\n");
        for (int i = 0; i < n; i++) {
            if (medias[i] >= 6) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}