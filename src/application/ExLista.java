package application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExLista {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employees> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d: \n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.print("\nId already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);

            employees.add(emp);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idOfIncrease = sc.nextInt();

        Employees emp = employees.stream().filter(element -> element.getId() == idOfIncrease).findFirst().orElse(null);

        //int pos = position(employees, idOfIncrease);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentageOfIncrease = sc.nextDouble();

            emp.increaseSalary(percentageOfIncrease);
        }

        System.out.println("\nList of employees:");
        for (Employees employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static int position(List<Employees> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static boolean hasId(List<Employees> employees, int id) {
        Employees emp = employees.stream().filter(element -> element.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}