package ExerciciosParaProva.Exericio2Parte2;

public class App {

    public static void main(String[] args) {

        // Cria um objeto Livro
        Livro livro = new Livro("O Senhor dos Anéis", 1954, 1234, "J.R.R. Tolkien");

        // Imprime as informações do livro
        livro.imprimirInformacoes();

        // Cria um objeto DVD
        DVD dvd = new DVD("O Poderoso Chefão", 1972, 5678, "Francis Ford Coppola");

        // Imprime as informações do DVD
        dvd.imprimirInformacoes();

        // Cria um objeto CD
        CD cd = new CD("Thriller", 1982, 9012, "Michael Jackson");

        // Imprime as informações do CD
        cd.imprimirInformacoes();
    }
}
