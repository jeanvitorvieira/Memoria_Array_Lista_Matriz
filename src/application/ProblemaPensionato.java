package application;

import entities.Rents;

import java.util.Scanner;

public class ProblemaPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rents[] rooms = new Rents[10]; // array para de Rents para criar 10 quartos

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("\nRent #" + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Rents(name, email); // atribuindo nomes e emails aos quartos
        }

        System.out.println("\nBusy Rooms:");
        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]); // retornando informação de quartos não nulos/desocupados
            }
        }

        sc.close();
    }
}
