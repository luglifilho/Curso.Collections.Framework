import java.util.HashMap;
import java.util.Map;

public class MyCars {
    public static void main(String[] args) {

        Map<String, Double> carrosPopulares = new HashMap<>(){{

            put("gol", 14.0);
            put("fox", 15.0);
            put("tucson", 5.0);
            put("honda", 8.0);
            put("uno", 20.0);
        }};

        System.out.println(carrosPopulares.toString());


    }
}