package theory;

public class UnBoxing_WrapperClasses {
    public static void main(String[] args) {
        int x = 20;
        Object obj = x; // Boxing - Tipo valor -> Tipo referência compatível
        int y = (int) obj; // Unboxing - Tipo referência -> Tipo valor compatível
        System.out.println(x + "\n" + obj + "\n" + y);
        // cada tipo de váriavel tem sua classe correspondente - Wrapper Classes
        Integer objeto = x;
        y = objeto * 2;
        System.out.println(y);
        Integer z = null; // aceitam valor nulo
        System.out.println(z);
    }
}