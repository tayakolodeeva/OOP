package sem_1;

public class Drink extends Product {
    double volume;
    Types type;

    public Drink(String name, double cost, double volume, Types type) {
        super(name, cost, type);
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", volume: %f", this.volume);

    } 
}
