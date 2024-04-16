package application;

import java.util.Scanner;

public class ExSomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        System.out.println("\nDigite os valores do vetor A: ");
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("\nDigite os valores do vetor B: ");
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println("\nVETOR RESULTANTE:");
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (i == j) {
                    System.out.println(nums1[i] + nums2[j]);
                }
            }
        }
        sc.close();
    }
}