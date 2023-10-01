package ExerciciosParaProva.Exercicio7;

public class App {

    public static void main(String[] args) {
        // A
        Aluno a1 = new Aluno();

        // B
        a1.setNome("Vraunelisson");
        a1.setP1(10);
        a1.setP2(10);
        ;

        // C
        System.out.println("Nome:" + a1.getNome());
        System.out.println("P1: " + a1.getP1());
        System.out.println("P2:" + a1.getP2());

        // D
        Aluno a2 = a1;

        // E
        a2.setP1(5);
        a2.setP2(6);

        System.out.println("Nome:" + a1.getNome());
        System.out.println("P1: " + a1.getP1());
        System.out.println("P2:" + a1.getP2());

        // Valores de a2
        System.out.println("Nome:" + a2.getNome());
        System.out.println("P1: " + a2.getP1());
        System.out.println("P2:" + a2.getP2());

        //F
        /*
         *   OS valores não são difernetes por conta de estarem apontando para o mesmo endereço de memória.
         * Assim, quando o valor éatualizado, todos são alterados
         */
    }
}
