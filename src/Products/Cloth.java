package Products;

/**
 * Created by Cyprian on 2016-12-26.
 */
public class Cloth implements Product {

    private String name;
    private double price;

    public Cloth(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
