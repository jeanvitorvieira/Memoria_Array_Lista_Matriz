package theory;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // não aceita tipos primitivos

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // sobrecarga

        System.out.println(list.size()); // tamanho da lista

        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("--------------------");
        list.removeIf(element -> element.charAt(0) == 'M'); // remove da lista os elementos que começam com M
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("--------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // pega a posição do elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("--------------------");
        List<String> result = list.stream().filter(element -> element.charAt(0) == 'A').toList(); // transforma a lista em outra, passando apenas os elementos que começam com A
        for (String element : result) {
            System.out.println(element);
        }

        System.out.println("--------------------");
        String name = list.stream().filter(element -> element.charAt(0) == 'A').findFirst().orElse(null); // retorna o primeiro elemento que começar com A
        System.out.println(name);
    }
}