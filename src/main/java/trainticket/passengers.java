package trainticket;

public class passengers {

    public int id;
    public String name;
    public int price;

    public passengers(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
