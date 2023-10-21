import java.util.ArrayList;
import java.util.List;

public class CafeteriaMain {

    public static void main(String[] args) {

        Bebida expresso = new Expresso();

        System.out.println(expresso.getDescricao() + expresso.getValor());

        System.out.println(expresso.getDescricao() + expresso.getValor());

        Bebida conCafe = new ConCafe(expresso);
        System.out.println(conCafe.getDescricao() + conCafe.getValor());

        List<Bebida> listaBebidas = new ArrayList<Bebida>();
        list.add(expresso);
        list.add(ConCafe);
        list.add(ConLatte);
    }
}
