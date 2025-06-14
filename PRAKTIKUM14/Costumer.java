public class Costumer {

    public int id;
    public String name;

    public Costumer() {

    }

    public Costumer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return " ID: "+this.id+ " Nama: "+this.name;
    }
}
