import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("Crie uma lista e adicione as notas:");

        List notas = new ArrayList();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.5);
        notas.add(5.2);
        notas.add(3.7);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println(notas.indexOf(5d));

        notas.add(4, 8.0);

        System.out.println(notas);

       // notas.set(notas.indexOf(5d), 6.0);

        System.out.println(notas.contains(5d));

        System.out.println(Collections.max(notas));
        System.out.println(Collections.min(notas));

        Iterator iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = (Double) iterator.next();
            soma += next;
        }

        System.out.println(soma);

        notas.remove(0d);

        System.out.println(notas);

        Iterator iterator1 = notas.iterator();

        while(iterator1.hasNext()) {
            Double next = (Double) iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(notas);

        notas.clear();

        System.out.println(notas.isEmpty());







    }
}