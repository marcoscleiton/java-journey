public class EstruturaIfElse {

    public static void main(String[] args) {

        boolean temDinheiro = true;
        boolean temCartao = false;

        if (temDinheiro && temCartao) {
            System.out.println("Pede um iFood e um Zé Delivery");

        } else if (temDinheiro || temCartao) {
            System.out.println("Pede um iFood");

        } else {
            System.out.println("Não pede nada");
        }
    }
}
