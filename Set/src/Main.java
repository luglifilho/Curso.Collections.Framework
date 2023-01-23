import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collection.*;


public class Main {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 6.0, 6.2, 4.9, 9.2, 10.0));



        System.out.println(notas);
        System.out.println(notas.contains((5.0)));
      //  System.out.println(Collection.min(notas));
        //System.out.println(Collection.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        notas.remove(10.0);

        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);


    }
}