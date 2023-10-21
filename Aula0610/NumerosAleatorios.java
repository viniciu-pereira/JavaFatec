import java.util.random;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashSet;
import java.util.Set;

public class NumerosAleatorios {

    public static void main(String[] args) {

        Random gerador = new Random();
        Set<Integer> setNumeros = new HashSet<Integer>();

        while (setNumeros.size() < 50) {

            System.out.println(setNumeros.add((int) (Math.random() * 100)));
        }

        Iterator<Integer> it = setNumeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set<Cliente> SetCliente = new HashSet<>();

        Cliente c1 = new Cliente(1, "jao");
        Cliente c2 = new Cliente(2, "jao2");
    }
}
