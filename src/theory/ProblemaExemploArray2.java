package theory;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProblemaExemploArray2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos você deseja digitar? ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("\nDigite o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("\nAVERAGE PRICE: $ %.2f\n", avg);
        sc.close();
    }
}