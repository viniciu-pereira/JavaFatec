public class PizzaFactory {

    public static Pizza CreatePizza(PizzaEnum PizzaEnum) {

        Pizza p = null;

        if (PizzaEnum.CALABRESA.equals(PizzaEnum)) {
            p = new PizzaDeCalabresa();

            borda = new Borda();
            b.setTipoBorda("Cheddar");
            b.setValor(111.2);

            p.setBorda(b);

        } else if (PizzaEnum.RUCULA.equals(PizzaEnum)) {
            p = new PizzaDeRucula();

            borda = new Borda();
            b.setTipoBorda("Nutella");
            b.setValor(200D);

            p.setBorda(b);

        } else if (PizzaEnum.MARGUERITA.equals(PizzaEnum)) {
            p = new PizzaDeMarguerita();

            borda = new Borda();
            b.setTipoBorda("Provolone");
            b.setValor(210D);

            p.setBorda(b);
            
        } else if (PizzaEnum.QUATRO_QUEIJOS.equals(PizzaEnum)) {
            p = PizzaDeQuatroQueijos();
        } else if (PizzaEnum.NUTELLA_COM_MORANGO.equals(PizzaEnum)) {
            p = PizzaDeNutelaComMorango();
        }
        return p;

    }
}
