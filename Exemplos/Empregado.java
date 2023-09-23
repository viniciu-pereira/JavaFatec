public class Empregado extends Pessoa {       
        public Empregado(){
            System.out.println("Construtor empregado");
        }

        @Override
        public void quemSouEu(){
            System.out.println("Sou um empregado com odio no coração e pau na mão");
        }

        public void quemSouEu(String x){
            System.out.println(x);
        }

        private void funcaoX(){
        
            //classe filha, sem sobrescrita, nesta classe
            this.quemSouEu();
            //classe pai
            super.quemSouEu();
        }
    }
