package sem_1;

public class Product {
    private String name;
    private double cost;
    Types type;

    public Product(String name, double cost, Types type) {
        this.cost = cost;
        this.name = name;
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name: %s, cost: %f, type: %s", this.name, this.cost, this.type);
        }
}
