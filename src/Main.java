import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<Car,Car1>map=new HashMap<>();
        map.put(new Car(1,700),new Car1(2008,"GS 300",20000,"Black"));
        map.put(new Car(2,003),new Car1(2012,"Camry 55",22000,"White"));
        map.put(new Car(3,555),new Car1(2018,"Camry 65",28000,"Grey"));
        map.put(new Car(4,001),new Car1(2010,"BMW 5",24000,"Blue"));

        for (Map.Entry<Car, Car1> c:map.entrySet()) {
            System.out.println(c);
        }







    }
}