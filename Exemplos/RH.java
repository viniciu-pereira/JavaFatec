public class RH {
    
    public static void main(String[] args) {
        
        Empregado chefe = new Gerente();

        Empregado empregado = new Empregado();

        pagarSalario(chefe);
        pagarSalario(empregado);
        promoverEmpregado(chefe, empregado);


        Pessoa p = new Pessoa();
        p.quemSouEu();
        chefe.quemSouEu();

    }

    public static void pagarSalario(Empregado empregado){
    }

    public static void promoverEmpregado(Empregado chefe, Empregado empregado){}
}
