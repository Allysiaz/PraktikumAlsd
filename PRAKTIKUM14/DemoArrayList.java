import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
    public static void main(String[] args) {
        
        ArrayList<Costumer> costumers = new ArrayList<>();

        Costumer costumer1 = new Costumer(1, "Zakia");
        Costumer costumer2 = new Costumer(2, "Budi");

        costumers.add(costumer1);
        costumers.add(costumer2);

        costumers.add(new Costumer(4, "Cica"));

        costumers.add(2, new Costumer(100, "Rosa"));

        System.out.println(costumers.indexOf(costumer2));

        Costumer costumer = costumers.get(1);
        System.out.println(costumer.name);
        costumer.name = "Budi Utomo";

        ArrayList<Costumer> newCostumers = new ArrayList<>();
        newCostumers.add(new Costumer(201, "Della"));
        newCostumers.add(new Costumer(202, "Victor"));
        newCostumers.add(new Costumer(203, "Sarah"));
       
        costumers.addAll(newCostumers);

        for (Costumer cust : costumers) {
            System.out.println(cust.toString());
        }

        System.out.println(costumers);
        Collections.sort(costumers, (c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(costumers);

    }
}
