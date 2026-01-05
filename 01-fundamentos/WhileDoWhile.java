public class WhileDoWhile {

    public static void main(String[] args) {

        // Estrutura while
        int contadorWhile = 0;
        while (contadorWhile <= 5) {
            System.out.println("Contador do while: " + contadorWhile);
            contadorWhile++;
        }

        // Estrutura do while
        int contadorDoWhile = 0;
        do {
            System.out.println("Contador do do while: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 5);
    }
}
