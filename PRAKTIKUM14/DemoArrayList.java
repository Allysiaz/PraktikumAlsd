import java.util.ArrayList;
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

        for (Costumer cust : costumers) {
            System.out.println(cust.toString());
        }
    }
}
