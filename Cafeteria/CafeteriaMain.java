public class CafeteriaMain {

    public static void main(String[] args) {

        Bebida expresso = new Expresso();

        System.out.println(expresso.getDescricao() + expresso.getValor());

        System.out.println(expresso.getDescricao() + expresso.getValor());

        Bebida conCafe = new ConCafe(expresso);
        System.out.println(conCafe.getDescricao() + conCafe.getValor());
    }
}
