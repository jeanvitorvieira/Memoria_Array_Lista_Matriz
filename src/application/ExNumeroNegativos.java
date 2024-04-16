package application;

import java.util.Scanner;

public class ExNumeroNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("\nDigite um número: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("\nNÚMEROS NEGATIVOS:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.println(nums[i]);
            }
        }
        sc.close();
    }
}