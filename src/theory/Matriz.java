package theory;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz: ");
        int n = sc.nextInt();

        int[][] numbers = new int[n][n]; // matriz criada na ordem n
        int negativeNumbers = 0;

        System.out.println("\nDigite os números da matriz: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = sc.nextInt();

                if (numbers[i][j] < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.print("\nMain diagonal: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][i] + " ");
        }
        System.out.println("\nNegative numbers: " + negativeNumbers);

        sc.close();
    }
}