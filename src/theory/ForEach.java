package theory;

public class ForEach {
    public static void main(String[] args) {

        String[] nomes = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        for (String nome : nomes) { // percorre o array nomes, chamando cada posição de nome do tipo String
            System.out.println(nome);
        }
    }
}