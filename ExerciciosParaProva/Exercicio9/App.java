package ExerciciosParaProva.Exercicio9;

public class App {

    public double total;

    public static void main(String[] args) {

        Rendimento rendimento = new Rendimento();

        rendimento.setSelic(0.85 * 0.1);
        rendimento.setTaxaAdministrativa(0.1);
        rendimento.setCapital(1000D);
        rendimento.setRendimento(rendimento.getCapital() * rendimento.getSelic()/100);

        System.out.println("Taxa Selic:   " + rendimento.getSelic());
        System.out.println("Capital investido:  " + rendimento.getCapital());
        System.out.println("Mês:  " + "Capital  " + "Rendimento  " + "Total");

        for (int i = 1; i <= 12; i++) {
            rendimento.setTotal( ((rendimento.getCapital() * rendimento.getSelic())) - (rendimento.getTotal() * rendimento.getRendimento()));

            System.out.println(i + "      " + rendimento.getCapital() + "    " + rendimento.getRendimento() + "    " + rendimento.getTotal());
        }
    }

}
